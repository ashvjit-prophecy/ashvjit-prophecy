package io.prophecy.pipelines.livyscalapipelineforairflow

import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipelineforairflow.config._
import io.prophecy.pipelines.livyscalapipelineforairflow.udfs.UDFs._
import io.prophecy.pipelines.livyscalapipelineforairflow.udfs.PipelineInitCode._
import io.prophecy.pipelines.livyscalapipelineforairflow.graph._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object Main {

  def apply(context: Context): Unit = {
    val df_scala_livy_oss_index = scala_livy_oss_index(context)
  }

  def main(args: Array[String]): Unit = {
    val config = ConfigurationFactoryImpl.getConfig(args)
    val spark: SparkSession = SparkSession
      .builder()
      .appName("Livy-Scala-Pipeline-For-Airflow")
      .config("spark.default.parallelism",             "4")
      .config("spark.sql.legacy.allowUntypedScalaUDF", "true")
      .enableHiveSupport()
      .getOrCreate()
    val context = Context(spark, config)
    spark.conf.set("prophecy.metadata.pipeline.uri",
                   "pipelines/Livy-Scala-Pipeline-For-Airflow"
    )
    registerUDFs(spark)
    MetricsCollector.instrument(spark,
                                "pipelines/Livy-Scala-Pipeline-For-Airflow"
    ) {
      apply(context)
    }
  }

}
