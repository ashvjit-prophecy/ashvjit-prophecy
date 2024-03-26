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
    val df_livy_annual_enterprise = livy_annual_enterprise(context)
    val (df_Subgraph_1_out0,
         df_Subgraph_1_out1,
         df_Subgraph_1_out2,
         df_Subgraph_1_out3,
         df_Subgraph_1_out4,
         df_Subgraph_1_out5,
         df_Subgraph_1_out6,
         df_Subgraph_1_out7
    ) = Subgraph_1.apply(
      Subgraph_1.config.Context(context.spark, context.config.Subgraph_1),
      df_livy_annual_enterprise
    )
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
