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
    val df_Filter_1           = Filter_1(context,           df_annual)
    val df_OrderBy_1          = OrderBy_1(context,          df_Filter_1)
    val df_SetOperation_1     = SetOperation_1(context,     df_OrderBy_1, df_OrderBy_1)
    val df_SchemaTransform_1  = SchemaTransform_1(context,  df_SetOperation_1)
    val df_Aggregate_1        = Aggregate_1(context,        df_SchemaTransform_1)
    val df_WindowFunction_1   = WindowFunction_1(context,   df_Aggregate_1)
    val df_Deduplicate_1      = Deduplicate_1(context,      df_WindowFunction_1)
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
    val df_Limit_1         = Limit_1(context,         df_annual)
    val df_Reformat_1      = Reformat_1(context,      df_Limit_1)
    val df_FlattenSchema_1 = FlattenSchema_1(context, df_Reformat_1)
    val (df_RowDistributor_1_out0, df_RowDistributor_1_out1) =
      RowDistributor_1(context, df_FlattenSchema_1)
    val df_Subgraph_1 = Subgraph_1.apply(
      Subgraph_1.config.Context(context.spark, context.config.Subgraph_1),
      df_annual
    )
    val df_Repartition_1 = Repartition_1(context, df_RowDistributor_1_out0)
    val df_SQLStatement_1 =
      SQLStatement_1(context, df_Repartition_1, df_RowDistributor_1_out1)
    val df_Reformat_1_1_4_1_5 = Reformat_1_1_4_1_5(context, df_Reformat_1_1_1_5)
    val df_Reformat_1_1_1_1_4 =
      Reformat_1_1_1_1_4(context, df_Reformat_1_1_4_1_5)
    val df_Reformat_1_1_4_1_1_4 =
      Reformat_1_1_4_1_1_4(context, df_Reformat_1_1_1_1_4)
    val df_Join_1   = Join_1(context,   df_Deduplicate_1, df_Deduplicate_1)
    val df_Script_1 = Script_1(context, df_SQLStatement_1)
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
