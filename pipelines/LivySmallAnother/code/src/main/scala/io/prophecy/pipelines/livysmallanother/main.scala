package io.prophecy.pipelines.livysmallanother

import io.prophecy.libs._
import io.prophecy.pipelines.livysmallanother.config._
import io.prophecy.pipelines.livysmallanother.udfs.UDFs._
import io.prophecy.pipelines.livysmallanother.udfs.PipelineInitCode._
import io.prophecy.pipelines.livysmallanother.graph._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object Main {

  def apply(context: Context): Unit = {
    val df_src_emr_s3_source = src_emr_s3_source(context)
    val df_Reformat_1        = Reformat_1(context, df_src_emr_s3_source).cache()
    val df_Reformat_4_1 = if (context.config.c_string == "asdasdasdasdads") {
      val df_remove = remove(context, df_Reformat_1)
      Reformat_4_1(context, df_remove)
    } else
      null
    val df_qa_table = qa_table(context)
    val df_skip =
      if (context.config.c_string == "asdasdasdasdads")
        skip(context, df_Reformat_1)
      else df_Reformat_1
    val df_Reformat_3    = Reformat_3(context,    df_skip)
    val df_Deduplicate_1 = Deduplicate_1(context, df_Reformat_3)
  }

  def main(args: Array[String]): Unit = {
    val config = ConfigurationFactoryImpl.getConfig(args)
    val spark: SparkSession = SparkSession
      .builder()
      .appName("LivySmallAnother")
      .config("spark.default.parallelism",             "4")
      .config("spark.sql.legacy.allowUntypedScalaUDF", "true")
      .enableHiveSupport()
      .getOrCreate()
    val context = Context(spark, config)
    spark.conf
      .set("prophecy.metadata.pipeline.uri", "pipelines/LivySmallAnother")
    registerUDFs(spark)
    MetricsCollector.instrument(spark, "pipelines/LivySmallAnother") {
      apply(context)
    }
  }

}
