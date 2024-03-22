package io.prophecy.pipelines.livyscalapipeline

import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.config._
import io.prophecy.pipelines.livyscalapipeline.udfs.UDFs._
import io.prophecy.pipelines.livyscalapipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livyscalapipeline.graph._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object Main {

  def apply(context: Context): Unit = {
    val df_annual_1 = annual_1(context)
    Lookup_1(context, df_annual_1)
    val df_annual             = annual(context)
    val df_Reformat_1_1_8     = Reformat_1_1_8(context,     df_annual)
    val df_Reformat_1_1_4_5   = Reformat_1_1_4_5(context,   df_Reformat_1_1_8)
    val df_Reformat_1_1_1_5   = Reformat_1_1_1_5(context,   df_Reformat_1_1_4_5)
    val df_Reformat_1_1_3_5   = Reformat_1_1_3_5(context,   df_annual)
    val df_Reformat_1_1_3_5_1 = Reformat_1_1_3_5_1(context, df_annual)
    val df_SetOperation_1_5 =
      SetOperation_1_5(context, df_Reformat_1_1_3_5_1, df_Reformat_1_1_3_5)
    val df_SetOperation_1_1_5 =
      SetOperation_1_1_5(context, df_Reformat_1_1_1_5, df_SetOperation_1_5)
    val df_Reformat_1_1_5_5   = Reformat_1_1_5_5(context,   df_Reformat_1_1_3_5)
    val df_Reformat_1_1_3_1_5 = Reformat_1_1_3_1_5(context, df_Reformat_1_1_5_5)
    val df_Reformat_1_1_5_1_5 =
      Reformat_1_1_5_1_5(context, df_Reformat_1_1_3_1_5)
    val df_Reformat_1_1_3_1_1_4 =
      Reformat_1_1_3_1_1_4(context, df_Reformat_1_1_5_1_5)
    val df_SetOperation_1_1_1_5 = SetOperation_1_1_1_5(context,
                                                       df_SetOperation_1_1_5,
                                                       df_Reformat_1_1_3_1_1_4
    )
    val df_Filter_1 = Filter_1(context, df_annual)
    val df_Subgraph_1 = Subgraph_1.apply(
      Subgraph_1.config.Context(context.spark, context.config.Subgraph_1),
      df_Filter_1
    )
    val df_Reformat_1_1_5_1_1_4 = Reformat_1_1_5_1_1_4(context, df_Subgraph_1)
    val df_Subgraph_1_4 = Subgraph_1_4.apply(
      Subgraph_1_4.config.Context(context.spark, context.config.Subgraph_1_4),
      df_annual
    )
    val df_Subgraph_1_4_1 = Subgraph_1_4_1.apply(
      Subgraph_1_4_1.config
        .Context(context.spark, context.config.Subgraph_1_4_1),
      df_Subgraph_1_4
    )
    val df_Reformat_1_1_4_1_5 = Reformat_1_1_4_1_5(context, df_Reformat_1_1_1_5)
    val df_Reformat_1_1_1_1_4 =
      Reformat_1_1_1_1_4(context, df_Reformat_1_1_4_1_5)
    val df_Reformat_1_1_4_1_1_4 =
      Reformat_1_1_4_1_1_4(context, df_Reformat_1_1_1_1_4)
  }

  def main(args: Array[String]): Unit = {
    val config = ConfigurationFactoryImpl.getConfig(args)
    val spark: SparkSession = SparkSession
      .builder()
      .appName("Livy-Scala-Pipeline")
      .config("spark.default.parallelism",             "4")
      .config("spark.sql.legacy.allowUntypedScalaUDF", "true")
      .enableHiveSupport()
      .getOrCreate()
    val context = Context(spark, config)
    spark.conf
      .set("prophecy.metadata.pipeline.uri", "pipelines/Livy-Scala-Pipeline")
    registerUDFs(spark)
    MetricsCollector.instrument(spark, "pipelines/Livy-Scala-Pipeline") {
      apply(context)
    }
  }

}
