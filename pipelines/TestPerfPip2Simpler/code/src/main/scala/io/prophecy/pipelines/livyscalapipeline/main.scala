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
    val df_annual_1_1 = annual_1_1(context)
    val df_Reformat_2 = Reformat_2(context, df_annual_1_1)
    val df_Subgraph_1_1 = Subgraph_1_1.apply(
      Subgraph_1_1.config.Context(context.spark, context.config.Subgraph_1_1),
      df_annual_1_1
    )
    val df_ConfigUdfLookup_1 = ConfigUdfLookup_1(context, df_Reformat_2)
    val df_annual_2          = annual_2(context)
    val df_Subgraph_1_2 = Subgraph_1_2.apply(
      Subgraph_1_2.config.Context(context.spark, context.config.Subgraph_1_2),
      df_annual_2
    )
    val df_Limit_1_1 = Limit_1_1(context, df_Subgraph_1_2)
    val df_Reformat_1_1_4_1_1_4_1_8 =
      Reformat_1_1_4_1_1_4_1_8(context, df_Limit_1_1)
    val df_annual             = annual(context)
    val df_Filter_3           = Filter_3(context,           df_annual)
    val df_OrderBy_3          = OrderBy_3(context,          df_Filter_3)
    val df_ConfigUdfLookup    = ConfigUdfLookup(context,    df_OrderBy_3)
    val df_Reformat_1_1_4_5   = Reformat_1_1_4_5(context,   df_ConfigUdfLookup)
    val df_Reformat_1_1_1_5   = Reformat_1_1_1_5(context,   df_Reformat_1_1_4_5)
    val df_Reformat_1_1_3_5   = Reformat_1_1_3_5(context,   df_OrderBy_3)
    val df_Reformat_1_1_3_5_1 = Reformat_1_1_3_5_1(context, df_OrderBy_3)
    val df_SetOperation_1_5 =
      SetOperation_1_5(context, df_Reformat_1_1_3_5_1, df_Reformat_1_1_3_5)
    val df_SetOperation_1_1_5 =
      SetOperation_1_1_5(context, df_Reformat_1_1_1_5, df_SetOperation_1_5)
    val df_Reformat_1_1_5_5   = Reformat_1_1_5_5(context,   df_Reformat_1_1_3_5)
    val df_Reformat_1_1_3_1_5 = Reformat_1_1_3_1_5(context, df_Reformat_1_1_5_5)
    val df_Reformat_1_1_5_1_5 =
      Reformat_1_1_5_1_5(context, df_Reformat_1_1_3_1_5)
    val df_Reformat_1_1_3_1_1_4 =
      Reformat_1_1_3_1_1_4(context, df_Reformat_1_1_5_1_5)
    val df_SetOperation_1_1_1_5 = SetOperation_1_1_1_5(context,
                                                       df_SetOperation_1_1_5,
                                                       df_Reformat_1_1_3_1_1_4
    )
    val df_Reformat_1_1_4_1_1_4_1_4 =
      Reformat_1_1_4_1_1_4_1_4(context, df_SetOperation_1_1_1_5)
    val df_Reformat_1_1_4_1_1_4_1_1_3 =
      Reformat_1_1_4_1_1_4_1_1_3(context, df_Reformat_1_1_4_1_1_4_1_4)
    val df_Reformat_1_1_4_1_1_4_1_2_2 =
      Reformat_1_1_4_1_1_4_1_2_2(context, df_Reformat_1_1_4_1_1_4_1_1_3)
    val df_Filter_1          = Filter_1(context,          df_OrderBy_3)
    val df_OrderBy_1         = OrderBy_1(context,         df_Filter_1)
    val df_SetOperation_1    = SetOperation_1(context,    df_OrderBy_1, df_OrderBy_1)
    val df_SchemaTransform_1 = SchemaTransform_1(context, df_SetOperation_1)
    val df_Aggregate_1       = Aggregate_1(context,       df_SchemaTransform_1)
    val df_WindowFunction_1  = WindowFunction_1(context,  df_Aggregate_1)
    val df_Deduplicate_1     = Deduplicate_1(context,     df_WindowFunction_1)
    val df_Limit_1           = Limit_1(context,           df_OrderBy_3)
    val df_Reformat_1        = Reformat_1(context,        df_Limit_1)
    val df_FlattenSchema_1   = FlattenSchema_1(context,   df_Reformat_1)
    val (df_RowDistributor_1_out0, df_RowDistributor_1_out1) = {
      val (df_RowDistributor_1_out0_temp, df_RowDistributor_1_out1_temp) =
        RowDistributor_1(context, df_FlattenSchema_1)
      (df_RowDistributor_1_out0_temp.cache(),
       df_RowDistributor_1_out1_temp.cache()
      )
    }
    val df_Repartition_1 =
      Repartition_1(context, df_RowDistributor_1_out0).cache()
    val df_SQLStatement_1 =
      SQLStatement_1(context, df_Repartition_1, df_RowDistributor_1_out1)
    val df_Script_1 = Script_1(context, df_SQLStatement_1)
    val df_Script_2 = Script_2(context, df_Script_1)
    val df_Reformat_1_1_4_1_1_4_1_7 =
      Reformat_1_1_4_1_1_4_1_7(context, df_Script_2)
    val df_Reformat_1_1_4_1_1_4_1_1_6 =
      Reformat_1_1_4_1_1_4_1_1_6(context, df_Reformat_1_1_4_1_1_4_1_7)
    val df_Reformat_1_1_4_1_1_4_1_2_5 =
      Reformat_1_1_4_1_1_4_1_2_5(context, df_Reformat_1_1_4_1_1_4_1_1_6)
    val df_Reformat_1_1_4_1_1_4_1_1_1_5 =
      Reformat_1_1_4_1_1_4_1_1_1_5(context, df_Reformat_1_1_4_1_1_4_1_2_5)
    val df_Reformat_1_1_4_1_1_4_1_3_4 =
      Reformat_1_1_4_1_1_4_1_3_4(context, df_Reformat_1_1_4_1_1_4_1_1_1_5)
    val df_Reformat_1_1_4_1_1_4_1_1_2_4 =
      Reformat_1_1_4_1_1_4_1_1_2_4(context, df_Reformat_1_1_4_1_1_4_1_3_4)
    val df_Reformat_1_1_4_1_5 = Reformat_1_1_4_1_5(context, df_Reformat_1_1_1_5)
    val df_Reformat_1_1_1_1_4 =
      Reformat_1_1_1_1_4(context, df_Reformat_1_1_4_1_5)
    val df_Reformat_1_1_4_1_1_4 =
      Reformat_1_1_4_1_1_4(context, df_Reformat_1_1_1_1_4)
    val df_Reformat_1_1_4_1_1_4_1 =
      Reformat_1_1_4_1_1_4_1(context, df_Reformat_1_1_4_1_1_4)
    val df_Reformat_1_1_4_1_1_4_1_1 =
      Reformat_1_1_4_1_1_4_1_1(context, df_Reformat_1_1_4_1_1_4_1)
    val df_Reformat_1_1_4_1_1_4_1_2 =
      Reformat_1_1_4_1_1_4_1_2(context, df_Reformat_1_1_4_1_1_4_1_1)
    val df_Reformat_1_1_4_1_1_4_1_1_1 =
      Reformat_1_1_4_1_1_4_1_1_1(context, df_Reformat_1_1_4_1_1_4_1_2)
    val df_Reformat_1_1_4_1_1_4_1_3 =
      Reformat_1_1_4_1_1_4_1_3(context, df_Reformat_1_1_4_1_1_4_1_1_1)
    val df_Reformat_1_1_4_1_1_4_1_1_2 =
      Reformat_1_1_4_1_1_4_1_1_2(context, df_Reformat_1_1_4_1_1_4_1_3)
    val df_Reformat_1_1_4_1_1_4_1_2_1 =
      Reformat_1_1_4_1_1_4_1_2_1(context, df_Reformat_1_1_4_1_1_4_1_1_2)
    val df_Reformat_1_1_4_1_1_4_1_2_1_5 =
      Reformat_1_1_4_1_1_4_1_2_1_5(context, df_Reformat_1_1_4_1_1_4_1_1_2_4)
    val df_Reformat_1_1_4_1_1_4_1_1_1_1_5 =
      Reformat_1_1_4_1_1_4_1_1_1_1_5(context, df_Reformat_1_1_4_1_1_4_1_2_1_5)
    val df_Reformat_1_1_4_1_1_4_1_2_1_1_4 =
      Reformat_1_1_4_1_1_4_1_2_1_1_4(context, df_Reformat_1_1_4_1_1_4_1_1_1_1_5)
    val df_Reformat_1_1_4_1_1_4_1_1_1_1_1_4 = Reformat_1_1_4_1_1_4_1_1_1_1_1_4(
      context,
      df_Reformat_1_1_4_1_1_4_1_2_1_1_4
    )
    val df_Join_1 = Join_1(context, df_Deduplicate_1, df_Deduplicate_1)
    val df_Reformat_1_1_4_1_1_4_1_6 =
      Reformat_1_1_4_1_1_4_1_6(context, df_Join_1)
    val df_Reformat_1_1_4_1_1_4_1_1_5 =
      Reformat_1_1_4_1_1_4_1_1_5(context, df_Reformat_1_1_4_1_1_4_1_6)
    val df_Reformat_1_1_4_1_1_4_1_2_4 =
      Reformat_1_1_4_1_1_4_1_2_4(context, df_Reformat_1_1_4_1_1_4_1_1_5)
    val df_Reformat_1_1_4_1_1_4_1_1_1_4 =
      Reformat_1_1_4_1_1_4_1_1_1_4(context, df_Reformat_1_1_4_1_1_4_1_2_4)
    val df_Reformat_1_1_4_1_1_4_1_3_3 =
      Reformat_1_1_4_1_1_4_1_3_3(context, df_Reformat_1_1_4_1_1_4_1_1_1_4)
    val df_Reformat_1_1_4_1_1_4_1_1_2_3 =
      Reformat_1_1_4_1_1_4_1_1_2_3(context, df_Reformat_1_1_4_1_1_4_1_3_3)
    val df_Reformat_1_1_4_1_1_4_1_1_1_1 =
      Reformat_1_1_4_1_1_4_1_1_1_1(context, df_Reformat_1_1_4_1_1_4_1_2_1)
    val df_Reformat_1_1_4_1_1_4_1_2_1_1 =
      Reformat_1_1_4_1_1_4_1_2_1_1(context, df_Reformat_1_1_4_1_1_4_1_1_1_1)
    val df_Reformat_1_1      = Reformat_1_1(context,      df_Limit_1_1).cache()
    val df_FlattenSchema_1_1 = FlattenSchema_1_1(context, df_Reformat_1_1)
    val df_Reformat_1_1_4_1_1_4_1_5 =
      Reformat_1_1_4_1_1_4_1_5(context, df_FlattenSchema_1_1)
    val df_Reformat_1_1_4_1_1_4_1_1_4 =
      Reformat_1_1_4_1_1_4_1_1_4(context, df_Reformat_1_1_4_1_1_4_1_5)
    val df_Reformat_1_1_4_1_1_4_1_2_3 =
      Reformat_1_1_4_1_1_4_1_2_3(context, df_Reformat_1_1_4_1_1_4_1_1_4)
    val df_Reformat_1_1_4_1_1_4_1_1_1_3 =
      Reformat_1_1_4_1_1_4_1_1_1_3(context, df_Reformat_1_1_4_1_1_4_1_2_3)
    val df_Reformat_1_1_4_1_1_4_1_3_2 =
      Reformat_1_1_4_1_1_4_1_3_2(context, df_Reformat_1_1_4_1_1_4_1_1_1_3)
    val df_Reformat_1_1_4_1_1_4_1_1_2_2 =
      Reformat_1_1_4_1_1_4_1_1_2_2(context, df_Reformat_1_1_4_1_1_4_1_3_2)
    val df_Reformat_1_1_4_1_1_4_1_2_1_3 =
      Reformat_1_1_4_1_1_4_1_2_1_3(context, df_Reformat_1_1_4_1_1_4_1_1_2_2)
    val df_Reformat_1_1_4_1_1_4_1_1_1_1_3 =
      Reformat_1_1_4_1_1_4_1_1_1_1_3(context, df_Reformat_1_1_4_1_1_4_1_2_1_3)
    val df_Reformat_1_1_4_1_1_4_1_2_1_1_2 =
      Reformat_1_1_4_1_1_4_1_2_1_1_2(context, df_Reformat_1_1_4_1_1_4_1_1_1_1_3)
    val df_Script_3     = Script_3(context,     df_annual_2)
    val df_Script_3_1   = Script_3_1(context,   df_Script_3)
    val df_Script_3_1_1 = Script_3_1_1(context, df_Script_3_1)
    val df_Reformat_1_1_4_1_1_4_1_2_1_4 =
      Reformat_1_1_4_1_1_4_1_2_1_4(context, df_Reformat_1_1_4_1_1_4_1_1_2_3)
    val df_Reformat_1_1_4_1_1_4_1_1_1_2 =
      Reformat_1_1_4_1_1_4_1_1_1_2(context, df_Reformat_1_1_4_1_1_4_1_2_2)
    val df_Reformat_1_1_4_1_1_4_1_3_1 =
      Reformat_1_1_4_1_1_4_1_3_1(context, df_Reformat_1_1_4_1_1_4_1_1_1_2)
    val df_Reformat_3_2_1 = if (context.config.c_string == "will.i.am") {
      val df_Removeme = Removeme(context, df_ConfigUdfLookup)
      Reformat_3_2_1(context, df_Removeme)
    } else
      null
    val df_Skipme =
      if (context.config.c_string == "will.i.am")
        Skipme(context, df_ConfigUdfLookup)
      else df_ConfigUdfLookup
    val df_Reformat_3_1 = Reformat_3_1(context, df_Skipme)
    val df_Reformat_1_1_4_1_1_4_1_1_7 =
      Reformat_1_1_4_1_1_4_1_1_7(context, df_Reformat_1_1_4_1_1_4_1_8)
    val df_Reformat_1_1_4_1_1_4_1_2_6 =
      Reformat_1_1_4_1_1_4_1_2_6(context, df_Reformat_1_1_4_1_1_4_1_1_7)
    val df_Reformat_1_1_4_1_1_4_1_1_1_6 =
      Reformat_1_1_4_1_1_4_1_1_1_6(context, df_Reformat_1_1_4_1_1_4_1_2_6)
    val df_Reformat_1_1_4_1_1_4_1_3_5 =
      Reformat_1_1_4_1_1_4_1_3_5(context, df_Reformat_1_1_4_1_1_4_1_1_1_6)
    val df_Reformat_1_1_4_1_1_4_1_1_2_5 =
      Reformat_1_1_4_1_1_4_1_1_2_5(context, df_Reformat_1_1_4_1_1_4_1_3_5)
    val df_Reformat_1_1_4_1_1_4_1_2_1_6 =
      Reformat_1_1_4_1_1_4_1_2_1_6(context, df_Reformat_1_1_4_1_1_4_1_1_2_5)
        .cache()
    val df_Reformat_1_1_4_1_1_4_1_1_1_1_6 =
      Reformat_1_1_4_1_1_4_1_1_1_1_6(context, df_Reformat_1_1_4_1_1_4_1_2_1_6)
    val df_Reformat_1_1_4_1_1_4_1_2_1_1_5 =
      Reformat_1_1_4_1_1_4_1_2_1_1_5(context, df_Reformat_1_1_4_1_1_4_1_1_1_1_6)
    val df_Reformat_1_1_4_1_1_4_1_1_1_1_1_5 = Reformat_1_1_4_1_1_4_1_1_1_1_1_5(
      context,
      df_Reformat_1_1_4_1_1_4_1_2_1_1_5
    )
    val df_Reformat_1_1_4_1_1_4_1_1_2_1 =
      Reformat_1_1_4_1_1_4_1_1_2_1(context, df_Reformat_1_1_4_1_1_4_1_3_1)
    val df_Reformat_1_1_4_1_1_4_1_2_1_2 =
      Reformat_1_1_4_1_1_4_1_2_1_2(context, df_Reformat_1_1_4_1_1_4_1_1_2_1)
    val df_Reformat_1_1_4_1_1_4_1_1_1_1_2 =
      Reformat_1_1_4_1_1_4_1_1_1_1_2(context, df_Reformat_1_1_4_1_1_4_1_2_1_2)
    val df_Reformat_1_1_4_1_1_4_1_2_1_1_1 =
      Reformat_1_1_4_1_1_4_1_2_1_1_1(context, df_Reformat_1_1_4_1_1_4_1_1_1_1_2)
    val df_Reformat_1_1_4_1_1_4_1_1_1_1_1_1 = Reformat_1_1_4_1_1_4_1_1_1_1_1_1(
      context,
      df_Reformat_1_1_4_1_1_4_1_2_1_1_1
    )
    val df_Subgraph_1 = Subgraph_1.apply(
      Subgraph_1.config.Context(context.spark, context.config.Subgraph_1),
      df_OrderBy_3
    )
    val df_Reformat_1_1_4_1_1_4_1_1_1_1_1_2 = Reformat_1_1_4_1_1_4_1_1_1_1_1_2(
      context,
      df_Reformat_1_1_4_1_1_4_1_2_1_1_2
    )
    val df_Reformat_1_1_4_1_1_4_1_1_1_1_1 =
      Reformat_1_1_4_1_1_4_1_1_1_1_1(context, df_Reformat_1_1_4_1_1_4_1_2_1_1)
    val df_Reformat_1_1_4_1_1_4_1_1_1_1_4 =
      Reformat_1_1_4_1_1_4_1_1_1_1_4(context, df_Reformat_1_1_4_1_1_4_1_2_1_4)
    dest_livytest(context,                    df_Reformat_1_1_3_1_1_4)
    val df_Subgraph_2 =
      if (context.config.c_string == "will.i.am")
        Subgraph_2.apply(
          Subgraph_2.config.Context(context.spark, context.config.Subgraph_2),
          df_Reformat_1_1_1_5
        )
      else df_Reformat_1_1_1_5
    val df_Reformat_3 = Reformat_3(context, df_Subgraph_2)
    val df_Reformat_1_1_4_1_1_4_1_2_1_1_3 =
      Reformat_1_1_4_1_1_4_1_2_1_1_3(context, df_Reformat_1_1_4_1_1_4_1_1_1_1_4)
    val df_Reformat_1_1_4_1_1_4_1_1_1_1_1_3 = Reformat_1_1_4_1_1_4_1_1_1_1_1_3(
      context,
      df_Reformat_1_1_4_1_1_4_1_2_1_1_3
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
    spark.conf
      .set("prophecy.metadata.pipeline.uri",                     "pipelines/TestPerfPip2Simpler")
    spark.conf.set("spark_config1",                              "value1")
    spark.conf.set("spark_config2",                              "value2")
    spark.sparkContext.hadoopConfiguration.set("hadoop_config1", "asdasd")
    spark.sparkContext.hadoopConfiguration.set("hadoop_config2", "dasdasdasdad")
    registerUDFs(spark)
    MetricsCollector.instrument(spark, "pipelines/TestPerfPip2Simpler") {
      apply(context)
    }
  }

}
