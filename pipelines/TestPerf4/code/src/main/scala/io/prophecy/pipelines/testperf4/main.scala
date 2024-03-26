package io.prophecy.pipelines.testperf4

import io.prophecy.libs._
import io.prophecy.pipelines.testperf4.config._
import io.prophecy.pipelines.testperf4.udfs.UDFs._
import io.prophecy.pipelines.testperf4.udfs.PipelineInitCode._
import io.prophecy.pipelines.testperf4.graph._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object Main {

  def apply(context: Context): Unit = {
    val df_src_emr_s3_source = src_emr_s3_source(context)
    val df_T21Gems1000LOC = T21Gems1000LOC.apply(
      T21Gems1000LOC.config
        .Context(context.spark, context.config.T21Gems1000LOC),
      df_src_emr_s3_source
    )
    val (df_sg100gems_out0,
         df_sg100gems_out1,
         df_sg100gems_out2,
         df_sg100gems_out3,
         df_sg100gems_out4,
         df_sg100gems_out5,
         df_sg100gems_out6,
         df_sg100gems_out7
    ) = sg100gems.apply(
      sg100gems.config.Context(context.spark, context.config.sg100gems),
      df_src_emr_s3_source
    )
    val df_sgScriptWith5ScriptEachHaving1000LOC =
      sgScriptWith5ScriptEachHaving1000LOC.apply(
        sgScriptWith5ScriptEachHaving1000LOC.config.Context(
          context.spark,
          context.config.sgScriptWith5ScriptEachHaving1000LOC
        ),
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
  }

  def main(args: Array[String]): Unit = {
    val config = ConfigurationFactoryImpl.getConfig(args)
    val spark: SparkSession = SparkSession
      .builder()
      .appName("TestPerf4")
      .config("spark.default.parallelism",             "4")
      .config("spark.sql.legacy.allowUntypedScalaUDF", "true")
      .enableHiveSupport()
      .getOrCreate()
    val context = Context(spark, config)
    spark.conf.set("prophecy.metadata.pipeline.uri", "pipelines/TestPerf4")
    registerUDFs(spark)
    MetricsCollector.instrument(spark, "pipelines/TestPerf4") {
      apply(context)
    }
  }

}
