package io.prophecy.pipelines.testperflargetotalnodes

import io.prophecy.libs._
import io.prophecy.pipelines.testperflargetotalnodes.config._
import io.prophecy.pipelines.testperflargetotalnodes.udfs.UDFs._
import io.prophecy.pipelines.testperflargetotalnodes.udfs.PipelineInitCode._
import io.prophecy.pipelines.testperflargetotalnodes.graph._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object Main {

  def apply(context: Context): Unit = {
    val df_src_emr_s3_source = src_emr_s3_source(context)
    val df_sg100gems_1 = sg100gems_1.apply(
      sg100gems_1.config.Context(context.spark, context.config.sg100gems_1),
      df_src_emr_s3_source
    )
    val df_sg100gems_2 = sg100gems_2.apply(
      sg100gems_2.config.Context(context.spark, context.config.sg100gems_2),
      df_src_emr_s3_source
    )
    val df_sg100gems = sg100gems.apply(
      sg100gems.config.Context(context.spark, context.config.sg100gems),
      df_src_emr_s3_source
    )
    val df_sg100gems_3 = sg100gems_3.apply(
      sg100gems_3.config.Context(context.spark, context.config.sg100gems_3),
      df_src_emr_s3_source
    )
    val df_sg100gems_4 = sg100gems_4.apply(
      sg100gems_4.config.Context(context.spark, context.config.sg100gems_4),
      df_src_emr_s3_source
    )
  }

  def main(args: Array[String]): Unit = {
    val config = ConfigurationFactoryImpl.getConfig(args)
    val spark: SparkSession = SparkSession
      .builder()
      .appName("TestPerfLargeTotalNodes")
      .config("spark.default.parallelism",             "4")
      .config("spark.sql.legacy.allowUntypedScalaUDF", "true")
      .enableHiveSupport()
      .getOrCreate()
    val context = Context(spark, config)
    spark.conf.set("prophecy.metadata.pipeline.uri",
                   "pipelines/TestPerfLargeTotalNodes"
    )
    registerUDFs(spark)
    MetricsCollector.instrument(spark, "pipelines/TestPerfLargeTotalNodes") {
      apply(context)
    }
  }

}
