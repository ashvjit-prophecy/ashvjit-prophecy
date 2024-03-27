package io.prophecy.pipelines.testbasicpipelinejob

import io.prophecy.libs._
import io.prophecy.pipelines.testbasicpipelinejob.config._
import io.prophecy.pipelines.testbasicpipelinejob.udfs.UDFs._
import io.prophecy.pipelines.testbasicpipelinejob.udfs.PipelineInitCode._
import io.prophecy.pipelines.testbasicpipelinejob.graph._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object Main {

  def apply(context: Context): Unit = {
    val df_emr_hdfs_target_1 = emr_hdfs_target_1(context)
    val df_Reformat_1        = Reformat_1(context, df_emr_hdfs_target_1)
  }

  def main(args: Array[String]): Unit = {
    val config = ConfigurationFactoryImpl.getConfig(args)
    val spark: SparkSession = SparkSession
      .builder()
      .appName("TestBasicPipelineJob")
      .config("spark.default.parallelism",             "4")
      .config("spark.sql.legacy.allowUntypedScalaUDF", "true")
      .enableHiveSupport()
      .getOrCreate()
    val context = Context(spark, config)
    spark.conf
      .set("prophecy.metadata.pipeline.uri", "pipelines/TestBasicPipelineJob")
    registerUDFs(spark)
    MetricsCollector.instrument(spark, "pipelines/TestBasicPipelineJob") {
      apply(context)
    }
  }

}
