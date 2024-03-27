package io.prophecy.pipelines.testpipmoresubgraphs

import io.prophecy.libs._
import io.prophecy.pipelines.testpipmoresubgraphs.config._
import io.prophecy.pipelines.testpipmoresubgraphs.udfs.UDFs._
import io.prophecy.pipelines.testpipmoresubgraphs.udfs.PipelineInitCode._
import io.prophecy.pipelines.testpipmoresubgraphs.graph._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object Main {
  def apply(context: Context): Unit = {}

  def main(args:     Array[String]): Unit = {
    val config = ConfigurationFactoryImpl.getConfig(args)
    val spark: SparkSession = SparkSession
      .builder()
      .appName("TestPipMoreSubgraphs")
      .config("spark.default.parallelism",             "4")
      .config("spark.sql.legacy.allowUntypedScalaUDF", "true")
      .enableHiveSupport()
      .getOrCreate()
    val context = Context(spark, config)
    spark.conf
      .set("prophecy.metadata.pipeline.uri", "pipelines/TestPipMoreSubgraphs")
    registerUDFs(spark)
    MetricsCollector.instrument(spark, "pipelines/TestPipMoreSubgraphs") {
      apply(context)
    }
  }

}
