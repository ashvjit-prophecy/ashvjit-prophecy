package io.prophecy.pipelines.nousepipeline

import io.prophecy.libs._
import io.prophecy.pipelines.nousepipeline.config._
import io.prophecy.pipelines.nousepipeline.udfs.UDFs._
import io.prophecy.pipelines.nousepipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.nousepipeline.graph._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object Main {

  def apply(context: Context): Unit = {
    val df_scala_customers = scala_customers(context)
    val df_Filter_1        = Filter_1(context,  df_scala_customers)
    val df_OrderBy_1       = OrderBy_1(context, df_Filter_1)
    val df_Filter_2        = Filter_2(context,  df_OrderBy_1)
  }

  def main(args: Array[String]): Unit = {
    val config = ConfigurationFactoryImpl.getConfig(args)
    val spark: SparkSession = SparkSession
      .builder()
      .appName("Prophecy Pipeline")
      .config("spark.default.parallelism",             "4")
      .config("spark.sql.legacy.allowUntypedScalaUDF", "true")
      .enableHiveSupport()
      .getOrCreate()
    val context = Context(spark, config)
    spark.conf
      .set("prophecy.metadata.pipeline.uri", "pipelines/no-use-pipeline")
    registerUDFs(spark)
    MetricsCollector.instrument(spark, "pipelines/no-use-pipeline") {
      apply(context)
    }
  }

}
