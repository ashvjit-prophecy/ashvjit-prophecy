package io.prophecy.pipelines.livysmallpipeline

import io.prophecy.libs._
import io.prophecy.pipelines.livysmallpipeline.config._
import io.prophecy.pipelines.livysmallpipeline.udfs.UDFs._
import io.prophecy.pipelines.livysmallpipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livysmallpipeline.graph._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object Main {

  def apply(context: Context): Unit = {
    val df_src_emr_s3_source = src_emr_s3_source(context)
    val df_sgScriptWith5ScriptEachHaving1000LOC =
      sgScriptWith5ScriptEachHaving1000LOC.apply(
        sgScriptWith5ScriptEachHaving1000LOC.config.Context(
          context.spark,
          context.config.sgScriptWith5ScriptEachHaving1000LOC
        ),
        df_src_emr_s3_source
      )
    val df_T210Gems_10kLOC = T210Gems_10kLOC.apply(
      T210Gems_10kLOC.config
        .Context(context.spark, context.config.T210Gems_10kLOC),
      df_src_emr_s3_source
    )
    val df_sgScriptWith5ScriptEachHaving1000LOC_1 =
      sgScriptWith5ScriptEachHaving1000LOC_1.apply(
        sgScriptWith5ScriptEachHaving1000LOC_1.config.Context(
          context.spark,
          context.config.sgScriptWith5ScriptEachHaving1000LOC_1
        ),
        df_sgScriptWith5ScriptEachHaving1000LOC
      )
    val df_sg100gems = sg100gems.apply(
      sg100gems.config.Context(context.spark, context.config.sg100gems),
      df_src_emr_s3_source
    )
    val df_sgScriptWith5ScriptEachHaving1000LOC_2 =
      sgScriptWith5ScriptEachHaving1000LOC_2.apply(
        sgScriptWith5ScriptEachHaving1000LOC_2.config.Context(
          context.spark,
          context.config.sgScriptWith5ScriptEachHaving1000LOC_2
        ),
        df_sgScriptWith5ScriptEachHaving1000LOC_1
      )
    val df_T21Gems1000LOC = T21Gems1000LOC.apply(
      T21Gems1000LOC.config
        .Context(context.spark, context.config.T21Gems1000LOC),
      df_src_emr_s3_source
    )
    val df_sgScriptWith5ScriptEachHaving1000LOC_1_1 =
      sgScriptWith5ScriptEachHaving1000LOC_1_1.apply(
        sgScriptWith5ScriptEachHaving1000LOC_1_1.config.Context(
          context.spark,
          context.config.sgScriptWith5ScriptEachHaving1000LOC_1_1
        ),
        df_sgScriptWith5ScriptEachHaving1000LOC_2
      )
    val df_sg100gems_1 = sg100gems_1.apply(
      sg100gems_1.config.Context(context.spark, context.config.sg100gems_1),
      df_src_emr_s3_source
    )
  }

  def main(args: Array[String]): Unit = {
    val config = ConfigurationFactoryImpl.getConfig(args)
    val spark: SparkSession = SparkSession
      .builder()
      .appName("LivySmallPipeline")
      .config("spark.default.parallelism",             "4")
      .config("spark.sql.legacy.allowUntypedScalaUDF", "true")
      .enableHiveSupport()
      .getOrCreate()
    val context = Context(spark, config)
    spark.conf
      .set("prophecy.metadata.pipeline.uri", "pipelines/LivySmallPipeline")
    registerUDFs(spark)
    MetricsCollector.instrument(spark, "pipelines/LivySmallPipeline") {
      apply(context)
    }
  }

}
