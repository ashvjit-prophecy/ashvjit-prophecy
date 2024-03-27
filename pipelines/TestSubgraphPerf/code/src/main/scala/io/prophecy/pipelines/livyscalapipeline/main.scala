package io.prophecy.pipelines.livyscalapipeline

import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.config._
import io.prophecy.pipelines.livyscalapipeline.udfs.UDFs._
import io.prophecy.pipelines.livyscalapipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livyscalapipeline.graph._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object Main {

  def apply(context: Context): Unit = {
    val df_annual_1 = annual_1(context)
    Lookup_1(context, df_annual_1)
    val df_annual_2 = annual_2(context)
    val df_Subgraph_1_2 = Subgraph_1_2.apply(
      Subgraph_1_2.config.Context(context.spark, context.config.Subgraph_1_2),
      df_annual_2
    )
    val df_Limit_1_1 = Limit_1_1(context, df_Subgraph_1_2)
    val df_Subgraph_2_1_2 = Subgraph_2_1_2.apply(
      Subgraph_2_1_2.config
        .Context(context.spark, context.config.Subgraph_2_1_2),
      df_Limit_1_1
    )
    val df_Subgraph_12_1_2 = Subgraph_12_1_2.apply(
      Subgraph_12_1_2.config
        .Context(context.spark, context.config.Subgraph_12_1_2),
      df_Subgraph_2_1_2
    )
    val df_Subgraph_13_1_2 = Subgraph_13_1_2.apply(
      Subgraph_13_1_2.config
        .Context(context.spark, context.config.Subgraph_13_1_2),
      df_Subgraph_12_1_2
    )
    val df_Subgraph_14_1_2 = Subgraph_14_1_2.apply(
      Subgraph_14_1_2.config
        .Context(context.spark, context.config.Subgraph_14_1_2),
      df_Subgraph_13_1_2
    )
    val df_Subgraph_15_1_2 = Subgraph_15_1_2.apply(
      Subgraph_15_1_2.config
        .Context(context.spark, context.config.Subgraph_15_1_2),
      df_Subgraph_14_1_2
    )
    val df_Subgraph_2_1_1_2 = Subgraph_2_1_1_2.apply(
      Subgraph_2_1_1_2.config
        .Context(context.spark, context.config.Subgraph_2_1_1_2),
      df_Subgraph_15_1_2
    )
    val df_annual    = annual(context)
    val df_Filter_3  = Filter_3(context,  df_annual)
    val df_OrderBy_3 = OrderBy_3(context, df_Filter_3)
    val (df_Subgraph_5_out, df_Subgraph_5_out0) = Subgraph_5.apply(
      Subgraph_5.config.Context(context.spark, context.config.Subgraph_5),
      df_OrderBy_3
    )
    val df_Subgraph_6 = Subgraph_6.apply(
      Subgraph_6.config.Context(context.spark, context.config.Subgraph_6),
      df_Subgraph_5_out,
      df_Subgraph_5_out0
    )
    val df_Subgraph_10 = Subgraph_10.apply(
      Subgraph_10.config.Context(context.spark, context.config.Subgraph_10),
      df_Subgraph_6
    )
    val df_Deduplicate_1 = Deduplicate_1(context, df_Subgraph_10)
    val df_Subgraph_2_1 = Subgraph_2_1.apply(
      Subgraph_2_1.config.Context(context.spark, context.config.Subgraph_2_1),
      df_Limit_1_1
    )
    val df_Subgraph_12_1 = Subgraph_12_1.apply(
      Subgraph_12_1.config.Context(context.spark, context.config.Subgraph_12_1),
      df_Subgraph_2_1
    )
    val df_Subgraph_13_1 = Subgraph_13_1.apply(
      Subgraph_13_1.config.Context(context.spark, context.config.Subgraph_13_1),
      df_Subgraph_12_1
    )
    val df_Subgraph_14_1 = Subgraph_14_1.apply(
      Subgraph_14_1.config.Context(context.spark, context.config.Subgraph_14_1),
      df_Subgraph_13_1
    )
    val df_Subgraph_15_1 = Subgraph_15_1.apply(
      Subgraph_15_1.config.Context(context.spark, context.config.Subgraph_15_1),
      df_Subgraph_14_1
    )
    val df_Subgraph_2_1_1 = Subgraph_2_1_1.apply(
      Subgraph_2_1_1.config
        .Context(context.spark, context.config.Subgraph_2_1_1),
      df_Subgraph_15_1
    )
    val df_Subgraph_2 = Subgraph_2.apply(
      Subgraph_2.config.Context(context.spark, context.config.Subgraph_2),
      df_Limit_1_1
    )
    val df_Subgraph_12 = Subgraph_12.apply(
      Subgraph_12.config.Context(context.spark, context.config.Subgraph_12),
      df_Subgraph_2
    )
    val df_Subgraph_13 = Subgraph_13.apply(
      Subgraph_13.config.Context(context.spark, context.config.Subgraph_13),
      df_Subgraph_12
    )
    val df_Subgraph_14 = Subgraph_14.apply(
      Subgraph_14.config.Context(context.spark, context.config.Subgraph_14),
      df_Subgraph_13
    )
    val df_Subgraph_15 = Subgraph_15.apply(
      Subgraph_15.config.Context(context.spark, context.config.Subgraph_15),
      df_Subgraph_14
    )
    val df_Subgraph_12_1_1_2 = Subgraph_12_1_1_2.apply(
      Subgraph_12_1_1_2.config
        .Context(context.spark, context.config.Subgraph_12_1_1_2),
      df_Subgraph_2_1_1_2
    )
    val df_Subgraph_13_1_1_2 = Subgraph_13_1_1_2.apply(
      Subgraph_13_1_1_2.config
        .Context(context.spark, context.config.Subgraph_13_1_1_2),
      df_Subgraph_12_1_1_2
    )
    val df_Subgraph_2_1_2_1_1 = Subgraph_2_1_2_1_1.apply(
      Subgraph_2_1_2_1_1.config
        .Context(context.spark, context.config.Subgraph_2_1_2_1_1),
      df_Limit_1_1
    )
    val df_Subgraph_12_1_2_1_1 = Subgraph_12_1_2_1_1.apply(
      Subgraph_12_1_2_1_1.config
        .Context(context.spark, context.config.Subgraph_12_1_2_1_1),
      df_Subgraph_2_1_2_1_1
    )
    val df_Subgraph_13_1_2_1_1 = Subgraph_13_1_2_1_1.apply(
      Subgraph_13_1_2_1_1.config
        .Context(context.spark, context.config.Subgraph_13_1_2_1_1),
      df_Subgraph_12_1_2_1_1
    )
    val df_Subgraph_2_1_2_1 = Subgraph_2_1_2_1.apply(
      Subgraph_2_1_2_1.config
        .Context(context.spark, context.config.Subgraph_2_1_2_1),
      df_Limit_1_1
    )
    val df_Subgraph_12_1_2_1 = Subgraph_12_1_2_1.apply(
      Subgraph_12_1_2_1.config
        .Context(context.spark, context.config.Subgraph_12_1_2_1),
      df_Subgraph_2_1_2_1
    )
    val df_Subgraph_13_1_2_1 = Subgraph_13_1_2_1.apply(
      Subgraph_13_1_2_1.config
        .Context(context.spark, context.config.Subgraph_13_1_2_1),
      df_Subgraph_12_1_2_1
    )
    val df_Subgraph_14_1_2_1 = Subgraph_14_1_2_1.apply(
      Subgraph_14_1_2_1.config
        .Context(context.spark, context.config.Subgraph_14_1_2_1),
      df_Subgraph_13_1_2_1
    )
    val df_Subgraph_15_1_2_1 = Subgraph_15_1_2_1.apply(
      Subgraph_15_1_2_1.config
        .Context(context.spark, context.config.Subgraph_15_1_2_1),
      df_Subgraph_14_1_2_1
    )
    val df_Subgraph_2_1_1_2_1 = Subgraph_2_1_1_2_1.apply(
      Subgraph_2_1_1_2_1.config
        .Context(context.spark, context.config.Subgraph_2_1_1_2_1),
      df_Subgraph_15_1_2_1
    )
    val df_Subgraph_12_1_1_2_1 = Subgraph_12_1_1_2_1.apply(
      Subgraph_12_1_1_2_1.config
        .Context(context.spark, context.config.Subgraph_12_1_1_2_1),
      df_Subgraph_2_1_1_2_1
    )
    val df_Subgraph_13_1_1_2_1 = Subgraph_13_1_1_2_1.apply(
      Subgraph_13_1_1_2_1.config
        .Context(context.spark, context.config.Subgraph_13_1_1_2_1),
      df_Subgraph_12_1_1_2_1
    )
    val df_Subgraph_14_1_1_2_1 = Subgraph_14_1_1_2_1.apply(
      Subgraph_14_1_1_2_1.config
        .Context(context.spark, context.config.Subgraph_14_1_1_2_1),
      df_Subgraph_13_1_1_2_1
    )
    val df_Subgraph_15_1_1_2_1 = Subgraph_15_1_1_2_1.apply(
      Subgraph_15_1_1_2_1.config
        .Context(context.spark, context.config.Subgraph_15_1_1_2_1),
      df_Subgraph_14_1_1_2_1
    )
    val df_Limit_1 = Limit_1(context, df_OrderBy_3)
    val df_Subgraph_7 = Subgraph_7.apply(
      Subgraph_7.config.Context(context.spark, context.config.Subgraph_7),
      df_Limit_1
    )
    val (df_Subgraph_8_out, df_Subgraph_8_out10) = Subgraph_8.apply(
      Subgraph_8.config.Context(context.spark, context.config.Subgraph_8),
      df_Subgraph_7
    )
    val df_Subgraph_12_1_1 = Subgraph_12_1_1.apply(
      Subgraph_12_1_1.config
        .Context(context.spark, context.config.Subgraph_12_1_1),
      df_Subgraph_2_1_1
    )
    val df_Subgraph_13_1_1 = Subgraph_13_1_1.apply(
      Subgraph_13_1_1.config
        .Context(context.spark, context.config.Subgraph_13_1_1),
      df_Subgraph_12_1_1
    )
    val df_Subgraph_14_1_1 = Subgraph_14_1_1.apply(
      Subgraph_14_1_1.config
        .Context(context.spark, context.config.Subgraph_14_1_1),
      df_Subgraph_13_1_1
    )
    val df_ConfigUdfLookup = ConfigUdfLookup(context, df_OrderBy_3)
    val df_Subgraph_2_1_1_1 = Subgraph_2_1_1_1.apply(
      Subgraph_2_1_1_1.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1),
      df_Subgraph_15
    )
    val df_Subgraph_15_1_1 = Subgraph_15_1_1.apply(
      Subgraph_15_1_1.config
        .Context(context.spark, context.config.Subgraph_15_1_1),
      df_Subgraph_14_1_1
    )
    val df_Subgraph_14_1_2_1_1 = Subgraph_14_1_2_1_1.apply(
      Subgraph_14_1_2_1_1.config
        .Context(context.spark, context.config.Subgraph_14_1_2_1_1),
      df_Subgraph_13_1_2_1_1
    )
    val df_Subgraph_15_1_2_1_1 = Subgraph_15_1_2_1_1.apply(
      Subgraph_15_1_2_1_1.config
        .Context(context.spark, context.config.Subgraph_15_1_2_1_1),
      df_Subgraph_14_1_2_1_1
    )
    val df_Subgraph_2_1_1_2_1_1 = Subgraph_2_1_1_2_1_1.apply(
      Subgraph_2_1_1_2_1_1.config
        .Context(context.spark, context.config.Subgraph_2_1_1_2_1_1),
      df_Subgraph_15_1_2_1_1
    )
    val df_Subgraph_12_1_1_2_1_1 = Subgraph_12_1_1_2_1_1.apply(
      Subgraph_12_1_1_2_1_1.config
        .Context(context.spark, context.config.Subgraph_12_1_1_2_1_1),
      df_Subgraph_2_1_1_2_1_1
    )
    val df_Subgraph_13_1_1_2_1_1 = Subgraph_13_1_1_2_1_1.apply(
      Subgraph_13_1_1_2_1_1.config
        .Context(context.spark, context.config.Subgraph_13_1_1_2_1_1),
      df_Subgraph_12_1_1_2_1_1
    )
    val df_Subgraph_14_1_1_2_1_1 = Subgraph_14_1_1_2_1_1.apply(
      Subgraph_14_1_1_2_1_1.config
        .Context(context.spark, context.config.Subgraph_14_1_1_2_1_1),
      df_Subgraph_13_1_1_2_1_1
    )
    val df_Subgraph_15_1_1_2_1_1 = Subgraph_15_1_1_2_1_1.apply(
      Subgraph_15_1_1_2_1_1.config
        .Context(context.spark, context.config.Subgraph_15_1_1_2_1_1),
      df_Subgraph_14_1_1_2_1_1
    )
    val df_Subgraph_1 = Subgraph_1.apply(
      Subgraph_1.config.Context(context.spark, context.config.Subgraph_1),
      df_OrderBy_3
    )
    val df_sg100gems = sg100gems.apply(
      sg100gems.config.Context(context.spark, context.config.sg100gems),
      df_annual_2
    )
    val df_Subgraph_12_1_1_1 = Subgraph_12_1_1_1.apply(
      Subgraph_12_1_1_1.config
        .Context(context.spark, context.config.Subgraph_12_1_1_1),
      df_Subgraph_2_1_1_1
    )
    val df_Subgraph_13_1_1_1 = Subgraph_13_1_1_1.apply(
      Subgraph_13_1_1_1.config
        .Context(context.spark, context.config.Subgraph_13_1_1_1),
      df_Subgraph_12_1_1_1
    )
    val df_Subgraph_3 = Subgraph_3.apply(
      Subgraph_3.config.Context(context.spark, context.config.Subgraph_3),
      df_OrderBy_3
    )
    val df_Subgraph_4 = Subgraph_4.apply(
      Subgraph_4.config.Context(context.spark, context.config.Subgraph_4),
      df_Subgraph_3
    )
    val df_Reformat_1_1_3_1_1_4 = Reformat_1_1_3_1_1_4(context, df_Subgraph_4)
    dest_livytest(context, df_Reformat_1_1_3_1_1_4)
    val df_Subgraph_11 = Subgraph_11.apply(
      Subgraph_11.config.Context(context.spark, context.config.Subgraph_11),
      df_Subgraph_8_out,
      df_Subgraph_8_out10
    )
    val df_Subgraph_14_1_1_2 = Subgraph_14_1_1_2.apply(
      Subgraph_14_1_1_2.config
        .Context(context.spark, context.config.Subgraph_14_1_1_2),
      df_Subgraph_13_1_1_2
    )
    val df_Subgraph_14_1_1_1 = Subgraph_14_1_1_1.apply(
      Subgraph_14_1_1_1.config
        .Context(context.spark, context.config.Subgraph_14_1_1_1),
      df_Subgraph_13_1_1_1
    )
    val df_Join_1 = Join_1(context, df_Deduplicate_1, df_Deduplicate_1)
    val df_Subgraph_15_1_1_2 = Subgraph_15_1_1_2.apply(
      Subgraph_15_1_1_2.config
        .Context(context.spark, context.config.Subgraph_15_1_1_2),
      df_Subgraph_14_1_1_2
    )
    val df_Subgraph_9 = Subgraph_9.apply(
      Subgraph_9.config.Context(context.spark, context.config.Subgraph_9),
      df_Limit_1_1
    )
    val df_Subgraph_15_1_1_1 = Subgraph_15_1_1_1.apply(
      Subgraph_15_1_1_1.config
        .Context(context.spark, context.config.Subgraph_15_1_1_1),
      df_Subgraph_14_1_1_1
    )
    val df_Script_2 = Script_2(context, df_Subgraph_11)
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
      .set("prophecy.metadata.pipeline.uri",                     "pipelines/TestSubgraphPerf")
    spark.conf.set("spark_config1",                              "value1")
    spark.conf.set("spark_config2",                              "value2")
    spark.sparkContext.hadoopConfiguration.set("hadoop_config1", "asdasd")
    spark.sparkContext.hadoopConfiguration.set("hadoop_config2", "dasdasdasdad")
    registerUDFs(spark)
    MetricsCollector.instrument(spark, "pipelines/TestSubgraphPerf") {
      apply(context)
    }
  }

}
