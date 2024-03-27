package io.prophecy.pipelines.testonlysgmain

import io.prophecy.libs._
import io.prophecy.pipelines.testonlysgmain.config._
import io.prophecy.pipelines.testonlysgmain.udfs.UDFs._
import io.prophecy.pipelines.testonlysgmain.udfs.PipelineInitCode._
import io.prophecy.pipelines.testonlysgmain.graph._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object Main {

  def apply(context: Context): Unit = {
    val df_src_emr_s3_source = src_emr_s3_source(context)
    val df_Subgraph_1 = Subgraph_1.apply(
      Subgraph_1.config.Context(context.spark, context.config.Subgraph_1),
      df_src_emr_s3_source
    )
    val df_Subgraph_1_1 = Subgraph_1_1.apply(
      Subgraph_1_1.config.Context(context.spark, context.config.Subgraph_1_1),
      df_Subgraph_1
    )
    val df_Subgraph_1_3 = Subgraph_1_3.apply(
      Subgraph_1_3.config.Context(context.spark, context.config.Subgraph_1_3),
      df_Subgraph_1_1
    )
    val df_Subgraph_1_3_1 = Subgraph_1_3_1.apply(
      Subgraph_1_3_1.config
        .Context(context.spark, context.config.Subgraph_1_3_1),
      df_Subgraph_1_3
    )
    val df_Subgraph_1_4 = Subgraph_1_4.apply(
      Subgraph_1_4.config.Context(context.spark, context.config.Subgraph_1_4),
      df_Subgraph_1_3_1
    )
    val df_Subgraph_1_2_1 = Subgraph_1_2_1.apply(
      Subgraph_1_2_1.config
        .Context(context.spark, context.config.Subgraph_1_2_1),
      df_Subgraph_1_4
    )
    val df_Subgraph_1_1_1 = Subgraph_1_1_1.apply(
      Subgraph_1_1_1.config
        .Context(context.spark, context.config.Subgraph_1_1_1),
      df_Subgraph_1_2_1
    )
    val df_Subgraph_1_3_2 = Subgraph_1_3_2.apply(
      Subgraph_1_3_2.config
        .Context(context.spark, context.config.Subgraph_1_3_2),
      df_Subgraph_1_1_1
    )
    val df_Subgraph_1_3_1_1 = Subgraph_1_3_1_1.apply(
      Subgraph_1_3_1_1.config
        .Context(context.spark, context.config.Subgraph_1_3_1_1),
      df_Subgraph_1_3_2
    )
  }

  def main(args: Array[String]): Unit = {
    val config = ConfigurationFactoryImpl.getConfig(args)
    val spark: SparkSession = SparkSession
      .builder()
      .appName("TestOnlySGMain")
      .config("spark.default.parallelism",             "4")
      .config("spark.sql.legacy.allowUntypedScalaUDF", "true")
      .enableHiveSupport()
      .getOrCreate()
    val context = Context(spark, config)
    spark.conf
      .set("prophecy.metadata.pipeline.uri", "pipelines/testdonotdelissue")
    registerUDFs(spark)
    MetricsCollector.instrument(spark, "pipelines/testdonotdelissue") {
      apply(context)
    }
  }

}
