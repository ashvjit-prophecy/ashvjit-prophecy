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
    val df_Subgraph_2 = Subgraph_2.apply(
      Subgraph_2.config.Context(context.spark, context.config.Subgraph_2),
      df_src_emr_s3_source
    )
    val df_Subgraph_3 = Subgraph_3.apply(
      Subgraph_3.config.Context(context.spark, context.config.Subgraph_3),
      df_Subgraph_2
    )
    val df_sgwith2SG2gem_8 = sgwith2SG2gem_8.apply(
      sgwith2SG2gem_8.config
        .Context(context.spark, context.config.sgwith2SG2gem_8),
      df_src_emr_s3_source
    )
    val df_sgwith2SG2gem_7 = sgwith2SG2gem_7.apply(
      sgwith2SG2gem_7.config
        .Context(context.spark, context.config.sgwith2SG2gem_7),
      df_sgwith2SG2gem_8
    )
    val df_Subgraph_1 = Subgraph_1.apply(
      Subgraph_1.config.Context(context.spark, context.config.Subgraph_1),
      df_sgwith2SG2gem_7
    )
    val df_sgwith2SG2gem = sgwith2SG2gem.apply(
      sgwith2SG2gem.config.Context(context.spark, context.config.sgwith2SG2gem),
      df_Subgraph_1
    )
    val df_sgwith2SG2gem_1 = sgwith2SG2gem_1.apply(
      sgwith2SG2gem_1.config
        .Context(context.spark, context.config.sgwith2SG2gem_1),
      df_sgwith2SG2gem
    )
    val df_sgwith2SG2gem_2 = sgwith2SG2gem_2.apply(
      sgwith2SG2gem_2.config
        .Context(context.spark, context.config.sgwith2SG2gem_2),
      df_sgwith2SG2gem_1
    )
    val df_Subgraph_4 = Subgraph_4.apply(
      Subgraph_4.config.Context(context.spark, context.config.Subgraph_4),
      df_Subgraph_3
    )
    val df_Subgraph_5 = Subgraph_5.apply(
      Subgraph_5.config.Context(context.spark, context.config.Subgraph_5),
      df_Subgraph_4
    )
    val df_Subgraph_6 = Subgraph_6.apply(
      Subgraph_6.config.Context(context.spark, context.config.Subgraph_6),
      df_Subgraph_5
    )
    val df_Subgraph_7 = Subgraph_7.apply(
      Subgraph_7.config.Context(context.spark, context.config.Subgraph_7),
      df_Subgraph_6
    )
    val df_Subgraph_8 = Subgraph_8.apply(
      Subgraph_8.config.Context(context.spark, context.config.Subgraph_8),
      df_Subgraph_7
    )
    val df_Subgraph_9 = Subgraph_9.apply(
      Subgraph_9.config.Context(context.spark, context.config.Subgraph_9),
      df_Subgraph_8
    )
    val df_Subgraph_10 = Subgraph_10.apply(
      Subgraph_10.config.Context(context.spark, context.config.Subgraph_10),
      df_Subgraph_9
    )
    val df_Subgraph_11 = Subgraph_11.apply(
      Subgraph_11.config.Context(context.spark, context.config.Subgraph_11),
      df_Subgraph_10
    )
    val df_sgwith2SG2gem_3 = sgwith2SG2gem_3.apply(
      sgwith2SG2gem_3.config
        .Context(context.spark, context.config.sgwith2SG2gem_3),
      df_sgwith2SG2gem_2
    )
    val df_sgwith2SG2gem_4 = sgwith2SG2gem_4.apply(
      sgwith2SG2gem_4.config
        .Context(context.spark, context.config.sgwith2SG2gem_4),
      df_sgwith2SG2gem_3
    )
    val df_sgwith2SG2gem_5 = sgwith2SG2gem_5.apply(
      sgwith2SG2gem_5.config
        .Context(context.spark, context.config.sgwith2SG2gem_5),
      df_sgwith2SG2gem_4
    )
    val df_sgwith2SG2gem_6 = sgwith2SG2gem_6.apply(
      sgwith2SG2gem_6.config
        .Context(context.spark, context.config.sgwith2SG2gem_6),
      df_sgwith2SG2gem_5
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
    spark.conf.set("prophecy.metadata.pipeline.uri", "pipelines/TestOnlySGMain")
    registerUDFs(spark)
    MetricsCollector.instrument(spark, "pipelines/TestOnlySGMain") {
      apply(context)
    }
  }

}
