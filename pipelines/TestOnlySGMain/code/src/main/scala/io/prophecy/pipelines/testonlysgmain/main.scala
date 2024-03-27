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
    val df_sgwith2SG2gem_9 = sgwith2SG2gem_9.apply(
      sgwith2SG2gem_9.config
        .Context(context.spark, context.config.sgwith2SG2gem_9),
      df_src_emr_s3_source
    )
    val df_sgwith2SG2gem_10 = sgwith2SG2gem_10.apply(
      sgwith2SG2gem_10.config
        .Context(context.spark, context.config.sgwith2SG2gem_10),
      df_sgwith2SG2gem_9
    )
    val df_sgwith2SG2gem_11 = sgwith2SG2gem_11.apply(
      sgwith2SG2gem_11.config
        .Context(context.spark, context.config.sgwith2SG2gem_11),
      df_sgwith2SG2gem_10
    )
    val df_sgwith2SG2gem_12 = sgwith2SG2gem_12.apply(
      sgwith2SG2gem_12.config
        .Context(context.spark, context.config.sgwith2SG2gem_12),
      df_sgwith2SG2gem_11
    )
    val df_sgwith2SG2gem_13 = sgwith2SG2gem_13.apply(
      sgwith2SG2gem_13.config
        .Context(context.spark, context.config.sgwith2SG2gem_13),
      df_sgwith2SG2gem_12
    )
    val df_Subgraph_12 = Subgraph_12.apply(
      Subgraph_12.config.Context(context.spark, context.config.Subgraph_12),
      df_src_emr_s3_source
    )
    val df_sg10InsideSG = sg10InsideSG.apply(
      sg10InsideSG.config.Context(context.spark, context.config.sg10InsideSG),
      df_Subgraph_12
    )
    val df_sg10InsideSG_1 = sg10InsideSG_1.apply(
      sg10InsideSG_1.config
        .Context(context.spark, context.config.sg10InsideSG_1),
      df_sg10InsideSG
    )
    val df_sgScriptWith5ScriptEachHaving1000LOC =
      sgScriptWith5ScriptEachHaving1000LOC.apply(
        sgScriptWith5ScriptEachHaving1000LOC.config.Context(
          context.spark,
          context.config.sgScriptWith5ScriptEachHaving1000LOC
        ),
        df_sg10InsideSG_1
      )
    val df_sg10InsideSG_2 = sg10InsideSG_2.apply(
      sg10InsideSG_2.config
        .Context(context.spark, context.config.sg10InsideSG_2),
      df_sgScriptWith5ScriptEachHaving1000LOC
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
    val df_sg10InsideSG_5 = sg10InsideSG_5.apply(
      sg10InsideSG_5.config
        .Context(context.spark, context.config.sg10InsideSG_5),
      df_sg10InsideSG_4
    )
    val df_sgwith2SG2gem_14 = sgwith2SG2gem_14.apply(
      sgwith2SG2gem_14.config
        .Context(context.spark, context.config.sgwith2SG2gem_14),
      df_sgwith2SG2gem_13
    )
    val df_sgwith2SG2gem_15 = sgwith2SG2gem_15.apply(
      sgwith2SG2gem_15.config
        .Context(context.spark, context.config.sgwith2SG2gem_15),
      df_sgwith2SG2gem_14
    )
    val df_sgwith2SG2gem_16 = sgwith2SG2gem_16.apply(
      sgwith2SG2gem_16.config
        .Context(context.spark, context.config.sgwith2SG2gem_16),
      df_sgwith2SG2gem_15
    )
    val df_sgwith2SG2gem_17 = sgwith2SG2gem_17.apply(
      sgwith2SG2gem_17.config
        .Context(context.spark, context.config.sgwith2SG2gem_17),
      df_sgwith2SG2gem_16
    )
    val df_sgwith2SG2gem_18 = sgwith2SG2gem_18.apply(
      sgwith2SG2gem_18.config
        .Context(context.spark, context.config.sgwith2SG2gem_18),
      df_sgwith2SG2gem_17
    )
    val df_sg10InsideSG_6 = sg10InsideSG_6.apply(
      sg10InsideSG_6.config
        .Context(context.spark, context.config.sg10InsideSG_6),
      df_sg10InsideSG_5
    )
    val df_sgwith2SG2gem_6 = sgwith2SG2gem_6.apply(
      sgwith2SG2gem_6.config
        .Context(context.spark, context.config.sgwith2SG2gem_6),
      df_sgwith2SG2gem_5
    )
    val df_sg10InsideSG_7 = sg10InsideSG_7.apply(
      sg10InsideSG_7.config
        .Context(context.spark, context.config.sg10InsideSG_7),
      df_sg10InsideSG_6
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
