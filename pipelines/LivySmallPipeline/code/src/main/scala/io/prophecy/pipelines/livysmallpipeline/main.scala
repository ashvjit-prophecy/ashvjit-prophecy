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
    val df_livy_annual_enterprise = livy_annual_enterprise(context)
    val df_Subgraph_0 = Subgraph_0.apply(
      Subgraph_0.config.Context(context.spark, context.config.Subgraph_0),
      df_livy_annual_enterprise
    )
    val df_Subgraph_1 = Subgraph_1.apply(
      Subgraph_1.config.Context(context.spark, context.config.Subgraph_1),
      df_livy_annual_enterprise
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
      df_livy_annual_enterprise
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
