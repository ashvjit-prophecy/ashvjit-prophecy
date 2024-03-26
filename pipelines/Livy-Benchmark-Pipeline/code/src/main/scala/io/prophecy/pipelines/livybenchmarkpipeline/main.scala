package io.prophecy.pipelines.livybenchmarkpipeline

import io.prophecy.libs._
import io.prophecy.pipelines.livybenchmarkpipeline.config._
import io.prophecy.pipelines.livybenchmarkpipeline.udfs.UDFs._
import io.prophecy.pipelines.livybenchmarkpipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livybenchmarkpipeline.graph._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object Main {

  def apply(context: Context): Unit = {
    val df_annual           = annual(context)
    val df_Reformat_1_1_3_5 = Reformat_1_1_3_5(context, df_annual)
    val df_Reformat_1_1_5_5 = Reformat_1_1_5_5(context, df_Reformat_1_1_3_5)
    val df_Reformat_1_1_8   = Reformat_1_1_8(context,   df_annual)
    val df_Reformat_1_1_4_5 = Reformat_1_1_4_5(context, df_Reformat_1_1_8)
    val df_SetOperation_1_5 =
      SetOperation_1_5(context, df_Reformat_1_1_4_5, df_Reformat_1_1_5_5)
    val df_Reformat_1_1_3_5_1 = Reformat_1_1_3_5_1(context, df_SetOperation_1_5)
    val df_Reformat_1_1_5_5_1 =
      Reformat_1_1_5_5_1(context, df_Reformat_1_1_3_5_1)
    val df_Reformat_1_1_8_1   = Reformat_1_1_8_1(context,   df_SetOperation_1_5)
    val df_Reformat_1_1_4_5_1 = Reformat_1_1_4_5_1(context, df_Reformat_1_1_8_1)
    val df_SetOperation_1_5_1 =
      SetOperation_1_5_1(context, df_Reformat_1_1_4_5_1, df_Reformat_1_1_5_5_1)
    val df_Reformat_1_1_3_5_2 =
      Reformat_1_1_3_5_2(context, df_SetOperation_1_5_1)
    val df_Reformat_1_1_5_5_2 =
      Reformat_1_1_5_5_2(context, df_Reformat_1_1_3_5_2)
    val df_Reformat_1_1_8_2   = Reformat_1_1_8_2(context,   df_SetOperation_1_5_1)
    val df_Reformat_1_1_4_5_2 = Reformat_1_1_4_5_2(context, df_Reformat_1_1_8_2)
    val df_SetOperation_1_5_2 =
      SetOperation_1_5_2(context, df_Reformat_1_1_4_5_2, df_Reformat_1_1_5_5_2)
    val df_Reformat_1_1_3_5_1_1 =
      Reformat_1_1_3_5_1_1(context, df_SetOperation_1_5_2)
    val df_Reformat_1_1_5_5_1_1 =
      Reformat_1_1_5_5_1_1(context, df_Reformat_1_1_3_5_1_1)
    val df_Reformat_1_1_8_1_1 =
      Reformat_1_1_8_1_1(context, df_SetOperation_1_5_2)
    val df_Reformat_1_1_4_5_1_1 =
      Reformat_1_1_4_5_1_1(context, df_Reformat_1_1_8_1_1)
    val df_SetOperation_1_5_1_1 = SetOperation_1_5_1_1(context,
                                                       df_Reformat_1_1_4_5_1_1,
                                                       df_Reformat_1_1_5_5_1_1
    )
    val df_Reformat_1_1_3_5_3 =
      Reformat_1_1_3_5_3(context, df_SetOperation_1_5_1_1)
    val df_Reformat_1_1_5_5_3 =
      Reformat_1_1_5_5_3(context, df_Reformat_1_1_3_5_3)
    val df_Reformat_1_1_8_3   = Reformat_1_1_8_3(context,   df_SetOperation_1_5_1_1)
    val df_Reformat_1_1_4_5_3 = Reformat_1_1_4_5_3(context, df_Reformat_1_1_8_3)
    val df_SetOperation_1_5_3 =
      SetOperation_1_5_3(context, df_Reformat_1_1_4_5_3, df_Reformat_1_1_5_5_3)
    val df_Reformat_1_1_3_5_1_2 =
      Reformat_1_1_3_5_1_2(context, df_SetOperation_1_5_3)
    val df_Reformat_1_1_5_5_1_2 =
      Reformat_1_1_5_5_1_2(context, df_Reformat_1_1_3_5_1_2)
    val df_Reformat_1_1_8_1_2 =
      Reformat_1_1_8_1_2(context, df_SetOperation_1_5_3)
    val df_Reformat_1_1_4_5_1_2 =
      Reformat_1_1_4_5_1_2(context, df_Reformat_1_1_8_1_2)
    val df_SetOperation_1_5_1_2 = SetOperation_1_5_1_2(context,
                                                       df_Reformat_1_1_4_5_1_2,
                                                       df_Reformat_1_1_5_5_1_2
    )
    val df_Reformat_1_1_8_2_1 =
      Reformat_1_1_8_2_1(context, df_SetOperation_1_5_1_2)
    val df_Reformat_1_1_3_5_2_1 =
      Reformat_1_1_3_5_2_1(context, df_SetOperation_1_5_1_2)
    val df_Reformat_1_1_5_5_2_1 =
      Reformat_1_1_5_5_2_1(context, df_Reformat_1_1_3_5_2_1)
    val df_Reformat_1_1_4_5_2_1 =
      Reformat_1_1_4_5_2_1(context, df_Reformat_1_1_8_2_1)
    val df_SetOperation_1_5_2_1 = SetOperation_1_5_2_1(context,
                                                       df_Reformat_1_1_4_5_2_1,
                                                       df_Reformat_1_1_5_5_2_1
    )
    val df_Reformat_1_1_3_5_1_1_1 =
      Reformat_1_1_3_5_1_1_1(context, df_SetOperation_1_5_2_1)
    val df_Reformat_1_1_5_5_1_1_1 =
      Reformat_1_1_5_5_1_1_1(context, df_Reformat_1_1_3_5_1_1_1)
    val df_Reformat_1_1_8_1_1_1 =
      Reformat_1_1_8_1_1_1(context, df_SetOperation_1_5_2_1)
    val df_Reformat_1_1_4_5_1_1_1 =
      Reformat_1_1_4_5_1_1_1(context, df_Reformat_1_1_8_1_1_1)
    val df_SetOperation_1_5_1_1_1 = SetOperation_1_5_1_1_1(
      context,
      df_Reformat_1_1_4_5_1_1_1,
      df_Reformat_1_1_5_5_1_1_1
    )
    val df_Reformat_1_1_3_5_2_1_1 =
      Reformat_1_1_3_5_2_1_1(context, df_SetOperation_1_5_1_1_1)
    val df_Reformat_1_1_5_5_2_1_1 =
      Reformat_1_1_5_5_2_1_1(context, df_Reformat_1_1_3_5_2_1_1)
    val df_Reformat_1_1_8_2_1_1 =
      Reformat_1_1_8_2_1_1(context, df_SetOperation_1_5_1_1_1)
    val df_Reformat_1_1_4_5_2_1_1 =
      Reformat_1_1_4_5_2_1_1(context, df_Reformat_1_1_8_2_1_1)
    val df_SetOperation_1_5_2_1_1 = SetOperation_1_5_2_1_1(
      context,
      df_Reformat_1_1_4_5_2_1_1,
      df_Reformat_1_1_5_5_2_1_1
    )
    val df_Reformat_1_1_3_5_1_1_1_1 =
      Reformat_1_1_3_5_1_1_1_1(context, df_SetOperation_1_5_2_1_1)
    val df_Reformat_1_1_5_5_1_1_1_1 =
      Reformat_1_1_5_5_1_1_1_1(context, df_Reformat_1_1_3_5_1_1_1_1)
    val df_Reformat_1_1_8_1_1_1_1 =
      Reformat_1_1_8_1_1_1_1(context, df_SetOperation_1_5_2_1_1)
    val df_Reformat_1_1_4_5_1_1_1_1 =
      Reformat_1_1_4_5_1_1_1_1(context, df_Reformat_1_1_8_1_1_1_1)
    val df_SetOperation_1_5_1_1_1_1 = SetOperation_1_5_1_1_1_1(
      context,
      df_Reformat_1_1_4_5_1_1_1_1,
      df_Reformat_1_1_5_5_1_1_1_1
    )
    val df_Reformat_1_1_3_5_1_2_1 =
      Reformat_1_1_3_5_1_2_1(context, df_SetOperation_1_5_1_1_1_1)
    val df_Reformat_1_1_5_5_1_2_1 =
      Reformat_1_1_5_5_1_2_1(context, df_Reformat_1_1_3_5_1_2_1)
    val df_Reformat_1_1_8_1_2_1 =
      Reformat_1_1_8_1_2_1(context, df_SetOperation_1_5_1_1_1_1)
    val df_Reformat_1_1_4_5_1_2_1 =
      Reformat_1_1_4_5_1_2_1(context, df_Reformat_1_1_8_1_2_1)
    val df_SetOperation_1_5_1_2_1 = SetOperation_1_5_1_2_1(
      context,
      df_Reformat_1_1_4_5_1_2_1,
      df_Reformat_1_1_5_5_1_2_1
    )
    val df_Reformat_1_1_3_5_2_1_2 =
      Reformat_1_1_3_5_2_1_2(context, df_SetOperation_1_5_1_2_1)
    val df_Reformat_1_1_5_5_2_1_2 =
      Reformat_1_1_5_5_2_1_2(context, df_Reformat_1_1_3_5_2_1_2)
    val df_Reformat_1_1_8_2_1_2 =
      Reformat_1_1_8_2_1_2(context, df_SetOperation_1_5_1_2_1)
    val df_Reformat_1_1_4_5_2_1_2 =
      Reformat_1_1_4_5_2_1_2(context, df_Reformat_1_1_8_2_1_2)
    val df_SetOperation_1_5_2_1_2 = SetOperation_1_5_2_1_2(
      context,
      df_Reformat_1_1_4_5_2_1_2,
      df_Reformat_1_1_5_5_2_1_2
    )
    val df_Reformat_1_1_3_5_1_1_1_2 =
      Reformat_1_1_3_5_1_1_1_2(context, df_SetOperation_1_5_2_1_2)
    val df_Reformat_1_1_5_5_1_1_1_2 =
      Reformat_1_1_5_5_1_1_1_2(context, df_Reformat_1_1_3_5_1_1_1_2)
    val df_Reformat_1_1_8_1_1_1_2 =
      Reformat_1_1_8_1_1_1_2(context, df_SetOperation_1_5_2_1_2)
    val df_Reformat_1_1_4_5_1_1_1_2 =
      Reformat_1_1_4_5_1_1_1_2(context, df_Reformat_1_1_8_1_1_1_2)
    val df_SetOperation_1_5_1_1_1_2 = SetOperation_1_5_1_1_1_2(
      context,
      df_Reformat_1_1_4_5_1_1_1_2,
      df_Reformat_1_1_5_5_1_1_1_2
    )
    val df_Reformat_1_1_3_5_2_1_1_1 =
      Reformat_1_1_3_5_2_1_1_1(context, df_SetOperation_1_5_1_1_1_2)
    val df_Reformat_1_1_5_5_2_1_1_1 =
      Reformat_1_1_5_5_2_1_1_1(context, df_Reformat_1_1_3_5_2_1_1_1)
    val df_Reformat_1_1_8_2_1_1_1 =
      Reformat_1_1_8_2_1_1_1(context, df_SetOperation_1_5_1_1_1_2)
    val df_Reformat_1_1_4_5_2_1_1_1 =
      Reformat_1_1_4_5_2_1_1_1(context, df_Reformat_1_1_8_2_1_1_1)
    val df_SetOperation_1_5_2_1_1_1 = SetOperation_1_5_2_1_1_1(
      context,
      df_Reformat_1_1_4_5_2_1_1_1,
      df_Reformat_1_1_5_5_2_1_1_1
    )
    val df_Reformat_1_1_3_5_1_1_1_1_1 =
      Reformat_1_1_3_5_1_1_1_1_1(context, df_SetOperation_1_5_2_1_1_1)
    val df_Reformat_1_1_5_5_1_1_1_1_1 =
      Reformat_1_1_5_5_1_1_1_1_1(context, df_Reformat_1_1_3_5_1_1_1_1_1)
    val df_Reformat_1_1_8_1_1_1_1_1 =
      Reformat_1_1_8_1_1_1_1_1(context, df_SetOperation_1_5_2_1_1_1)
    val df_Reformat_1_1_4_5_1_1_1_1_1 =
      Reformat_1_1_4_5_1_1_1_1_1(context, df_Reformat_1_1_8_1_1_1_1_1)
    val df_SetOperation_1_5_1_1_1_1_1 = SetOperation_1_5_1_1_1_1_1(
      context,
      df_Reformat_1_1_4_5_1_1_1_1_1,
      df_Reformat_1_1_5_5_1_1_1_1_1
    )
    val df_Reformat_1_1_3_5_1_2_1_1 =
      Reformat_1_1_3_5_1_2_1_1(context, df_SetOperation_1_5_1_1_1_1_1)
    val df_Reformat_1_1_5_5_1_2_1_1 =
      Reformat_1_1_5_5_1_2_1_1(context, df_Reformat_1_1_3_5_1_2_1_1)
    val df_Reformat_1_1_8_1_2_1_1 =
      Reformat_1_1_8_1_2_1_1(context, df_SetOperation_1_5_1_1_1_1_1)
    val df_Reformat_1_1_4_5_1_2_1_1 =
      Reformat_1_1_4_5_1_2_1_1(context, df_Reformat_1_1_8_1_2_1_1)
    val df_SetOperation_1_5_1_2_1_1 = SetOperation_1_5_1_2_1_1(
      context,
      df_Reformat_1_1_4_5_1_2_1_1,
      df_Reformat_1_1_5_5_1_2_1_1
    )
    val df_Reformat_1_1_3_5_2_1_2_1 =
      Reformat_1_1_3_5_2_1_2_1(context, df_SetOperation_1_5_1_2_1_1)
    val df_Reformat_1_1_5_5_2_1_2_1 =
      Reformat_1_1_5_5_2_1_2_1(context, df_Reformat_1_1_3_5_2_1_2_1)
    val df_Reformat_1_1_8_2_1_2_1 =
      Reformat_1_1_8_2_1_2_1(context, df_SetOperation_1_5_1_2_1_1)
    val df_Reformat_1_1_4_5_2_1_2_1 =
      Reformat_1_1_4_5_2_1_2_1(context, df_Reformat_1_1_8_2_1_2_1)
    val df_SetOperation_1_5_2_1_2_1 = SetOperation_1_5_2_1_2_1(
      context,
      df_Reformat_1_1_4_5_2_1_2_1,
      df_Reformat_1_1_5_5_2_1_2_1
    )
    val df_Reformat_1_1_3_5_1_1_1_2_1 =
      Reformat_1_1_3_5_1_1_1_2_1(context, df_SetOperation_1_5_2_1_2_1)
    val df_Reformat_1_1_5_5_1_1_1_2_1 =
      Reformat_1_1_5_5_1_1_1_2_1(context, df_Reformat_1_1_3_5_1_1_1_2_1)
    val df_Reformat_1_1_8_1_1_1_2_1 =
      Reformat_1_1_8_1_1_1_2_1(context, df_SetOperation_1_5_2_1_2_1)
    val df_Reformat_1_1_4_5_1_1_1_2_1 =
      Reformat_1_1_4_5_1_1_1_2_1(context, df_Reformat_1_1_8_1_1_1_2_1)
    val df_SetOperation_1_5_1_1_1_2_1 = SetOperation_1_5_1_1_1_2_1(
      context,
      df_Reformat_1_1_4_5_1_1_1_2_1,
      df_Reformat_1_1_5_5_1_1_1_2_1
    )
    val df_Reformat_1_1_8_2_1_1_1_1 =
      Reformat_1_1_8_2_1_1_1_1(context, df_SetOperation_1_5_1_1_1_2_1)
    val df_Reformat_1_1_3_5_2_1_1_1_1 =
      Reformat_1_1_3_5_2_1_1_1_1(context, df_SetOperation_1_5_1_1_1_2_1)
    val df_Reformat_1_1_5_5_2_1_1_1_1 =
      Reformat_1_1_5_5_2_1_1_1_1(context, df_Reformat_1_1_3_5_2_1_1_1_1)
    val df_Reformat_1_1_4_5_2_1_1_1_1 =
      Reformat_1_1_4_5_2_1_1_1_1(context, df_Reformat_1_1_8_2_1_1_1_1)
    val df_SetOperation_1_5_2_1_1_1_1 = SetOperation_1_5_2_1_1_1_1(
      context,
      df_Reformat_1_1_4_5_2_1_1_1_1,
      df_Reformat_1_1_5_5_2_1_1_1_1
    )
    val df_Reformat_1_1_3_5_1_1_1_1_1_1 =
      Reformat_1_1_3_5_1_1_1_1_1_1(context, df_SetOperation_1_5_2_1_1_1_1)
    val df_Reformat_1_1_5_5_1_1_1_1_1_1 =
      Reformat_1_1_5_5_1_1_1_1_1_1(context, df_Reformat_1_1_3_5_1_1_1_1_1_1)
    val df_Reformat_1_1_8_1_1_1_1_1_1 =
      Reformat_1_1_8_1_1_1_1_1_1(context, df_SetOperation_1_5_2_1_1_1_1)
    val df_Reformat_1_1_4_5_1_1_1_1_1_1 =
      Reformat_1_1_4_5_1_1_1_1_1_1(context, df_Reformat_1_1_8_1_1_1_1_1_1)
    val df_SetOperation_1_5_1_1_1_1_1_1 = SetOperation_1_5_1_1_1_1_1_1(
      context,
      df_Reformat_1_1_4_5_1_1_1_1_1_1,
      df_Reformat_1_1_5_5_1_1_1_1_1_1
    )
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
    spark.conf.set("prophecy.metadata.pipeline.uri",
                   "pipelines/Livy-Benchmark-Pipeline"
    )
    registerUDFs(spark)
    MetricsCollector.instrument(spark, "pipelines/Livy-Benchmark-Pipeline") {
      apply(context)
    }
  }

}
