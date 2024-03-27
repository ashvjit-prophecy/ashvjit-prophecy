package io.prophecy.pipelines.testperfmoresgraphs

import io.prophecy.libs._
import io.prophecy.pipelines.testperfmoresgraphs.config._
import io.prophecy.pipelines.testperfmoresgraphs.udfs.UDFs._
import io.prophecy.pipelines.testperfmoresgraphs.udfs.PipelineInitCode._
import io.prophecy.pipelines.testperfmoresgraphs.graph._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object Main {

  def apply(context: Context): Unit = {
    val df_src_emr_s3_source = src_emr_s3_source(context)
    val df_sg10InsideSG = sg10InsideSG.apply(
      sg10InsideSG.config.Context(context.spark, context.config.sg10InsideSG),
      df_src_emr_s3_source
    )
    val df_sg10InsideSG_1 = sg10InsideSG_1.apply(
      sg10InsideSG_1.config
        .Context(context.spark, context.config.sg10InsideSG_1),
      df_sg10InsideSG
    )
    val df_sg10InsideSG_2 = sg10InsideSG_2.apply(
      sg10InsideSG_2.config
        .Context(context.spark, context.config.sg10InsideSG_2),
      df_sg10InsideSG_1
    )
    val df_sg10InsideSG_3 = sg10InsideSG_3.apply(
      sg10InsideSG_3.config
        .Context(context.spark, context.config.sg10InsideSG_3),
      df_sg10InsideSG_2
    )
    val df_sg10InsideSG_4 = sg10InsideSG_4.apply(
      sg10InsideSG_4.config
        .Context(context.spark, context.config.sg10InsideSG_4),
      df_sg10InsideSG_3
    )
    val df_sg10InsideSG_6 = sg10InsideSG_6.apply(
      sg10InsideSG_6.config
        .Context(context.spark, context.config.sg10InsideSG_6),
      df_src_emr_s3_source
    )
    val df_sg10InsideSG_7 = sg10InsideSG_7.apply(
      sg10InsideSG_7.config
        .Context(context.spark, context.config.sg10InsideSG_7),
      df_sg10InsideSG_6
    )
    val df_sg10InsideSG_8 = sg10InsideSG_8.apply(
      sg10InsideSG_8.config
        .Context(context.spark, context.config.sg10InsideSG_8),
      df_sg10InsideSG_7
    )
    val df_sg10InsideSG_9 = sg10InsideSG_9.apply(
      sg10InsideSG_9.config
        .Context(context.spark, context.config.sg10InsideSG_9),
      df_sg10InsideSG_8
    )
    val df_sg10InsideSG_10 = sg10InsideSG_10.apply(
      sg10InsideSG_10.config
        .Context(context.spark, context.config.sg10InsideSG_10),
      df_sg10InsideSG_9
    )
    val df_sg10InsideSG_11 = sg10InsideSG_11.apply(
      sg10InsideSG_11.config
        .Context(context.spark, context.config.sg10InsideSG_11),
      df_sg10InsideSG_10
    )
    val df_sg10InsideSG_13 = sg10InsideSG_13.apply(
      sg10InsideSG_13.config
        .Context(context.spark, context.config.sg10InsideSG_13),
      df_sg10InsideSG_11
    )
    val df_sg10InsideSG_5 = sg10InsideSG_5.apply(
      sg10InsideSG_5.config
        .Context(context.spark, context.config.sg10InsideSG_5),
      df_sg10InsideSG_4
    )
    val df_sg10InsideSG_12 = sg10InsideSG_12.apply(
      sg10InsideSG_12.config
        .Context(context.spark, context.config.sg10InsideSG_12),
      df_sg10InsideSG_5
    )
  }

  def main(args: Array[String]): Unit = {
    val config = ConfigurationFactoryImpl.getConfig(args)
    val spark: SparkSession = SparkSession
      .builder()
      .appName("TestPerfMoreSGraphs")
      .config("spark.default.parallelism",             "4")
      .config("spark.sql.legacy.allowUntypedScalaUDF", "true")
      .enableHiveSupport()
      .getOrCreate()
    val context = Context(spark, config)
    spark.conf
      .set("prophecy.metadata.pipeline.uri", "pipelines/TestPerfMoreSGraphs")
    registerUDFs(spark)
    MetricsCollector.instrument(spark, "pipelines/TestPerfMoreSGraphs") {
      apply(context)
    }
  }

}
