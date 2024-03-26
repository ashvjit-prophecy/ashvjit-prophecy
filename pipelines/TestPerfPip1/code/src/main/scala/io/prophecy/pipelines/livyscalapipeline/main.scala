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
    val df_src_emr_s3_source = src_emr_s3_source(context)
    Lookup_1(context, df_src_emr_s3_source)
    val df_src_emr_s3_source_1 = src_emr_s3_source_1(context)
    val df_Reformat_2          = Reformat_2(context, df_src_emr_s3_source_1)
    val df_Subgraph_1_1 = Subgraph_1_1.apply(
      Subgraph_1_1.config.Context(context.spark, context.config.Subgraph_1_1),
      df_src_emr_s3_source_1
    )
    val df_ConfigUdfLookup_1   = ConfigUdfLookup_1(context, df_Reformat_2)
    val df_src_emr_s3_source_2 = src_emr_s3_source_2(context)
    val df_Filter_3            = Filter_3(context,          df_src_emr_s3_source_2)
    val df_OrderBy_3           = OrderBy_3(context,         df_Filter_3)
    val df_Subgraph_2_5 = Subgraph_2_5.apply(
      Subgraph_2_5.config.Context(context.spark, context.config.Subgraph_2_5),
      df_OrderBy_3
    )
    val df_Subgraph_2_1_5 = Subgraph_2_1_5.apply(
      Subgraph_2_1_5.config
        .Context(context.spark, context.config.Subgraph_2_1_5),
      df_Subgraph_2_5
    )
    val df_Subgraph_2_1_1_5 = Subgraph_2_1_1_5.apply(
      Subgraph_2_1_1_5.config
        .Context(context.spark, context.config.Subgraph_2_1_1_5),
      df_Subgraph_2_1_5
    )
    val df_Subgraph_2_1_1_1_5 = Subgraph_2_1_1_1_5.apply(
      Subgraph_2_1_1_1_5.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_5),
      df_Subgraph_2_1_1_5
    )
    val df_Subgraph_2_1_1_1_1_4 = Subgraph_2_1_1_1_1_4.apply(
      Subgraph_2_1_1_1_1_4.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_1_4),
      df_Subgraph_2_1_1_1_5
    )
    val df_Subgraph_2_2_3 = Subgraph_2_2_3.apply(
      Subgraph_2_2_3.config
        .Context(context.spark, context.config.Subgraph_2_2_3),
      df_Subgraph_2_1_1_1_1_4
    )
    val df_Subgraph_2_1_2_3 = Subgraph_2_1_2_3.apply(
      Subgraph_2_1_2_3.config
        .Context(context.spark, context.config.Subgraph_2_1_2_3),
      df_Subgraph_2_2_3
    )
    val df_Subgraph_2_1_1_2_3 = Subgraph_2_1_1_2_3.apply(
      Subgraph_2_1_1_2_3.config
        .Context(context.spark, context.config.Subgraph_2_1_1_2_3),
      df_Subgraph_2_1_2_3
    )
    val df_Subgraph_2_1_1_1_2_3 = Subgraph_2_1_1_1_2_3.apply(
      Subgraph_2_1_1_1_2_3.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_2_3),
      df_Subgraph_2_1_1_2_3
    )
    val df_src_emr_s3_source_3 = src_emr_s3_source_3(context)
    val df_Subgraph_1_2 = Subgraph_1_2.apply(
      Subgraph_1_2.config.Context(context.spark, context.config.Subgraph_1_2),
      df_src_emr_s3_source_3
    )
    val df_Limit_1_1    = Limit_1_1(context,    df_Subgraph_1_2)
    val df_Reformat_1_1 = Reformat_1_1(context, df_Limit_1_1)
    val df_Subgraph_2_4_1 = Subgraph_2_4_1.apply(
      Subgraph_2_4_1.config
        .Context(context.spark, context.config.Subgraph_2_4_1),
      df_Reformat_1_1
    )
    val df_Subgraph_2_1_4_1 = Subgraph_2_1_4_1.apply(
      Subgraph_2_1_4_1.config
        .Context(context.spark, context.config.Subgraph_2_1_4_1),
      df_Subgraph_2_4_1
    )
    val df_Filter_1          = Filter_1(context,          df_OrderBy_3)
    val df_OrderBy_1         = OrderBy_1(context,         df_Filter_1)
    val df_SetOperation_1    = SetOperation_1(context,    df_OrderBy_1, df_OrderBy_1)
    val df_SchemaTransform_1 = SchemaTransform_1(context, df_SetOperation_1)
    val df_Aggregate_1       = Aggregate_1(context,       df_SchemaTransform_1)
    val df_WindowFunction_1  = WindowFunction_1(context,  df_Aggregate_1)
    val df_Deduplicate_1     = Deduplicate_1(context,     df_WindowFunction_1)
    val df_ConfigUdfLookup   = ConfigUdfLookup(context,   df_OrderBy_3)
    val df_Subgraph_2_1_5_1 = Subgraph_2_1_5_1.apply(
      Subgraph_2_1_5_1.config
        .Context(context.spark, context.config.Subgraph_2_1_5_1),
      df_ConfigUdfLookup
    )
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
    val df_Subgraph_2_3 = Subgraph_2_3.apply(
      Subgraph_2_3.config.Context(context.spark, context.config.Subgraph_2_3),
      df_Reformat_1_1
    )
    val df_Subgraph_2_1_3 = Subgraph_2_1_3.apply(
      Subgraph_2_1_3.config
        .Context(context.spark, context.config.Subgraph_2_1_3),
      df_Subgraph_2_3
    )
    val df_Subgraph_2_1_1_3 = Subgraph_2_1_1_3.apply(
      Subgraph_2_1_1_3.config
        .Context(context.spark, context.config.Subgraph_2_1_1_3),
      df_Subgraph_2_1_3
    )
    val df_Subgraph_2_1_1_1_3 = Subgraph_2_1_1_1_3.apply(
      Subgraph_2_1_1_1_3.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_3),
      df_Subgraph_2_1_1_3
    )
    val df_Subgraph_2_1_1_1_1_2 = Subgraph_2_1_1_1_1_2.apply(
      Subgraph_2_1_1_1_1_2.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_1_2),
      df_Subgraph_2_1_1_1_3
    )
    val df_Subgraph_2_2_1 = Subgraph_2_2_1.apply(
      Subgraph_2_2_1.config
        .Context(context.spark, context.config.Subgraph_2_2_1),
      df_Subgraph_2_1_1_1_1_2
    )
    val df_Subgraph_2_1_2_1 = Subgraph_2_1_2_1.apply(
      Subgraph_2_1_2_1.config
        .Context(context.spark, context.config.Subgraph_2_1_2_1),
      df_Subgraph_2_2_1
    )
    val df_Subgraph_2_1_1_2_1 = Subgraph_2_1_1_2_1.apply(
      Subgraph_2_1_1_2_1.config
        .Context(context.spark, context.config.Subgraph_2_1_1_2_1),
      df_Subgraph_2_1_2_1
    )
    val df_Subgraph_2_4 = Subgraph_2_4.apply(
      Subgraph_2_4.config.Context(context.spark, context.config.Subgraph_2_4),
      df_Reformat_1_1
    )
    val df_Subgraph_2_4_2 = Subgraph_2_4_2.apply(
      Subgraph_2_4_2.config
        .Context(context.spark, context.config.Subgraph_2_4_2),
      df_Reformat_1_1
    )
    val df_Subgraph_2_1_4_2 = Subgraph_2_1_4_2.apply(
      Subgraph_2_1_4_2.config
        .Context(context.spark, context.config.Subgraph_2_1_4_2),
      df_Subgraph_2_4_2
    )
    val df_Subgraph_2_1_1_4_2 = Subgraph_2_1_1_4_2.apply(
      Subgraph_2_1_1_4_2.config
        .Context(context.spark, context.config.Subgraph_2_1_1_4_2),
      df_Subgraph_2_1_4_2
    )
    val df_Subgraph_2_1_1_1_4_2 = Subgraph_2_1_1_1_4_2.apply(
      Subgraph_2_1_1_1_4_2.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_4_2),
      df_Subgraph_2_1_1_4_2
    )
    val df_Subgraph_2_1_1_1_1_3_2 = Subgraph_2_1_1_1_1_3_2.apply(
      Subgraph_2_1_1_1_1_3_2.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_1_3_2),
      df_Subgraph_2_1_1_1_4_2
    )
    val df_Subgraph_2_2_2_2 = Subgraph_2_2_2_2.apply(
      Subgraph_2_2_2_2.config
        .Context(context.spark, context.config.Subgraph_2_2_2_2),
      df_Subgraph_2_1_1_1_1_3_2
    )
    val df_Limit_1         = Limit_1(context,         df_OrderBy_3)
    val df_Reformat_1      = Reformat_1(context,      df_Limit_1)
    val df_FlattenSchema_1 = FlattenSchema_1(context, df_Reformat_1)
    val (df_RowDistributor_1_out0, df_RowDistributor_1_out1) =
      RowDistributor_1(context, df_FlattenSchema_1)
    val df_Subgraph_2_4_3 = Subgraph_2_4_3.apply(
      Subgraph_2_4_3.config
        .Context(context.spark, context.config.Subgraph_2_4_3),
      df_Reformat_1_1
    )
    val df_Subgraph_2_1_4_3 = Subgraph_2_1_4_3.apply(
      Subgraph_2_1_4_3.config
        .Context(context.spark, context.config.Subgraph_2_1_4_3),
      df_Subgraph_2_4_3
    )
    val df_Subgraph_2_1_1_4_1 = Subgraph_2_1_1_4_1.apply(
      Subgraph_2_1_1_4_1.config
        .Context(context.spark, context.config.Subgraph_2_1_1_4_1),
      df_Subgraph_2_1_4_1
    )
    val df_Subgraph_2_1_1_1_4_1 = Subgraph_2_1_1_1_4_1.apply(
      Subgraph_2_1_1_1_4_1.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_4_1),
      df_Subgraph_2_1_1_4_1
    )
    val df_Subgraph_2_1_2_2_2 = Subgraph_2_1_2_2_2.apply(
      Subgraph_2_1_2_2_2.config
        .Context(context.spark, context.config.Subgraph_2_1_2_2_2),
      df_Subgraph_2_2_2_2
    )
    val df_Subgraph_2_1_1_2_2_2 = Subgraph_2_1_1_2_2_2.apply(
      Subgraph_2_1_1_2_2_2.config
        .Context(context.spark, context.config.Subgraph_2_1_1_2_2_2),
      df_Subgraph_2_1_2_2_2
    )
    val df_Subgraph_2_1_4 = Subgraph_2_1_4.apply(
      Subgraph_2_1_4.config
        .Context(context.spark, context.config.Subgraph_2_1_4),
      df_Subgraph_2_4
    )
    val df_Subgraph_2_1_1_4 = Subgraph_2_1_1_4.apply(
      Subgraph_2_1_1_4.config
        .Context(context.spark, context.config.Subgraph_2_1_1_4),
      df_Subgraph_2_1_4
    )
    val df_Subgraph_2_1_1_1_4 = Subgraph_2_1_1_1_4.apply(
      Subgraph_2_1_1_1_4.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_4),
      df_Subgraph_2_1_1_4
    )
    val df_Subgraph_2_1_1_1_1_3 = Subgraph_2_1_1_1_1_3.apply(
      Subgraph_2_1_1_1_1_3.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_1_3),
      df_Subgraph_2_1_1_1_4
    )
    val df_Subgraph_2_2_2 = Subgraph_2_2_2.apply(
      Subgraph_2_2_2.config
        .Context(context.spark, context.config.Subgraph_2_2_2),
      df_Subgraph_2_1_1_1_1_3
    )
    val df_Subgraph_2_1_2_2 = Subgraph_2_1_2_2.apply(
      Subgraph_2_1_2_2.config
        .Context(context.spark, context.config.Subgraph_2_1_2_2),
      df_Subgraph_2_2_2
    )
    val df_Subgraph_2 = Subgraph_2.apply(
      Subgraph_2.config.Context(context.spark, context.config.Subgraph_2),
      df_Reformat_1_1
    )
    val df_Subgraph_2_1_1_1_1_3_1 = Subgraph_2_1_1_1_1_3_1.apply(
      Subgraph_2_1_1_1_1_3_1.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_1_3_1),
      df_Subgraph_2_1_1_1_4_1
    )
    val df_Subgraph_2_2_2_1 = Subgraph_2_2_2_1.apply(
      Subgraph_2_2_2_1.config
        .Context(context.spark, context.config.Subgraph_2_2_2_1),
      df_Subgraph_2_1_1_1_1_3_1
    )
    val df_Subgraph_2_1_2_2_1 = Subgraph_2_1_2_2_1.apply(
      Subgraph_2_1_2_2_1.config
        .Context(context.spark, context.config.Subgraph_2_1_2_2_1),
      df_Subgraph_2_2_2_1
    )
    val df_Subgraph_2_1_1_2_2_1 = Subgraph_2_1_1_2_2_1.apply(
      Subgraph_2_1_1_2_2_1.config
        .Context(context.spark, context.config.Subgraph_2_1_1_2_2_1),
      df_Subgraph_2_1_2_2_1
    )
    val df_FlattenSchema_1_1 = FlattenSchema_1_1(context, df_Reformat_1_1)
    val df_Reformat_3        = Reformat_3(context,        df_FlattenSchema_1_1)
    val df_Subgraph_2_1_1_1_2_2_1 = Subgraph_2_1_1_1_2_2_1.apply(
      Subgraph_2_1_1_1_2_2_1.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_2_2_1),
      df_Subgraph_2_1_1_2_2_1
    )
    val df_Subgraph_2_1_5_9 = Subgraph_2_1_5_9.apply(
      Subgraph_2_1_5_9.config
        .Context(context.spark, context.config.Subgraph_2_1_5_9),
      df_Subgraph_2_1_5_1
    )
    val df_Filter_2 = Filter_2(context, df_Reformat_3)
    val df_Subgraph_2_1_1_1_2_2_2 = Subgraph_2_1_1_1_2_2_2.apply(
      Subgraph_2_1_1_1_2_2_2.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_2_2_2),
      df_Subgraph_2_1_1_2_2_2
    )
    val df_Subgraph_2_1_5_2 = Subgraph_2_1_5_2.apply(
      Subgraph_2_1_5_2.config
        .Context(context.spark, context.config.Subgraph_2_1_5_2),
      df_Reformat_1_1_4_5
    )
    val df_Subgraph_1 = Subgraph_1.apply(
      Subgraph_1.config.Context(context.spark, context.config.Subgraph_1),
      df_OrderBy_3
    )
    val df_Subgraph_2_1_1_2_2 = Subgraph_2_1_1_2_2.apply(
      Subgraph_2_1_1_2_2.config
        .Context(context.spark, context.config.Subgraph_2_1_1_2_2),
      df_Subgraph_2_1_2_2
    )
    val df_Subgraph_2_1_5_10 = Subgraph_2_1_5_10.apply(
      Subgraph_2_1_5_10.config
        .Context(context.spark, context.config.Subgraph_2_1_5_10),
      df_Subgraph_2_1_5_2
    )
    val df_Repartition_1 = Repartition_1(context, df_RowDistributor_1_out0)
    val df_Subgraph_2_1 = Subgraph_2_1.apply(
      Subgraph_2_1.config.Context(context.spark, context.config.Subgraph_2_1),
      df_Subgraph_2
    )
    val df_Subgraph_2_1_1 = Subgraph_2_1_1.apply(
      Subgraph_2_1_1.config
        .Context(context.spark, context.config.Subgraph_2_1_1),
      df_Subgraph_2_1
    )
    val df_Subgraph_2_1_1_1 = Subgraph_2_1_1_1.apply(
      Subgraph_2_1_1_1.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1),
      df_Subgraph_2_1_1
    )
    val df_Subgraph_2_1_1_1_1 = Subgraph_2_1_1_1_1.apply(
      Subgraph_2_1_1_1_1.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_1),
      df_Subgraph_2_1_1_1
    )
    val df_Subgraph_2_2 = Subgraph_2_2.apply(
      Subgraph_2_2.config.Context(context.spark, context.config.Subgraph_2_2),
      df_Subgraph_2_1_1_1_1
    )
    val df_Subgraph_2_1_2 = Subgraph_2_1_2.apply(
      Subgraph_2_1_2.config
        .Context(context.spark, context.config.Subgraph_2_1_2),
      df_Subgraph_2_2
    )
    val df_Subgraph_2_1_1_2 = Subgraph_2_1_1_2.apply(
      Subgraph_2_1_1_2.config
        .Context(context.spark, context.config.Subgraph_2_1_1_2),
      df_Subgraph_2_1_2
    )
    val df_Subgraph_2_1_1_1_2 = Subgraph_2_1_1_1_2.apply(
      Subgraph_2_1_1_1_2.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_2),
      df_Subgraph_2_1_1_2
    )
    val df_Subgraph_2_1_1_1_1_1 = Subgraph_2_1_1_1_1_1.apply(
      Subgraph_2_1_1_1_1_1.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_1_1),
      df_Subgraph_2_1_1_1_2
    )
    val df_Subgraph_2_1_1_4_3 = Subgraph_2_1_1_4_3.apply(
      Subgraph_2_1_1_4_3.config
        .Context(context.spark, context.config.Subgraph_2_1_1_4_3),
      df_Subgraph_2_1_4_3
    )
    val df_Subgraph_2_1_1_1_4_3 = Subgraph_2_1_1_1_4_3.apply(
      Subgraph_2_1_1_1_4_3.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_4_3),
      df_Subgraph_2_1_1_4_3
    )
    val df_Subgraph_2_1_1_1_1_3_3 = Subgraph_2_1_1_1_1_3_3.apply(
      Subgraph_2_1_1_1_1_3_3.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_1_3_3),
      df_Subgraph_2_1_1_1_4_3
    )
    val df_SQLStatement_1 =
      SQLStatement_1(context, df_Repartition_1, df_RowDistributor_1_out1)
    dest_livytest(context,    df_Reformat_1_1_3_1_1_4)
    val df_Subgraph_2_1_1_1_2_1 = Subgraph_2_1_1_1_2_1.apply(
      Subgraph_2_1_1_1_2_1.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_2_1),
      df_Subgraph_2_1_1_2_1
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
      df_src_emr_s3_source_3
    )
    val df_Reformat_1_1_4_1_5 = Reformat_1_1_4_1_5(context, df_Reformat_1_1_1_5)
    val df_Reformat_1_1_1_1_4 =
      Reformat_1_1_1_1_4(context, df_Reformat_1_1_4_1_5)
    val df_Reformat_1_1_4_1_1_4 =
      Reformat_1_1_4_1_1_4(context, df_Reformat_1_1_1_1_4)
    val df_Subgraph_2_1_1_1_2_2 = Subgraph_2_1_1_1_2_2.apply(
      Subgraph_2_1_1_1_2_2.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_2_2),
      df_Subgraph_2_1_1_2_2
    )
    val df_Subgraph_2_1_5_4 = Subgraph_2_1_5_4.apply(
      Subgraph_2_1_5_4.config
        .Context(context.spark, context.config.Subgraph_2_1_5_4),
      df_Reformat_1_1_4_1_5
    )
    val df_Subgraph_2_1_1_1_1_1_1 = Subgraph_2_1_1_1_1_1_1.apply(
      Subgraph_2_1_1_1_1_1_1.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_1_1_1),
      df_Subgraph_2_1_1_1_2_1
    )
    val df_Join_1 = Join_1(context, df_Deduplicate_1, df_Deduplicate_1)
    val df_Subgraph_2_2_2_3 = Subgraph_2_2_2_3.apply(
      Subgraph_2_2_2_3.config
        .Context(context.spark, context.config.Subgraph_2_2_2_3),
      df_Subgraph_2_1_1_1_1_3_3
    )
    val df_Subgraph_2_1_2_2_3 = Subgraph_2_1_2_2_3.apply(
      Subgraph_2_1_2_2_3.config
        .Context(context.spark, context.config.Subgraph_2_1_2_2_3),
      df_Subgraph_2_2_2_3
    )
    val df_Subgraph_2_1_1_2_2_3 = Subgraph_2_1_1_2_2_3.apply(
      Subgraph_2_1_1_2_2_3.config
        .Context(context.spark, context.config.Subgraph_2_1_1_2_2_3),
      df_Subgraph_2_1_2_2_3
    )
    val df_Subgraph_2_1_1_1_2_2_3 = Subgraph_2_1_1_1_2_2_3.apply(
      Subgraph_2_1_1_1_2_2_3.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_2_2_3),
      df_Subgraph_2_1_1_2_2_3
    )
    val df_Subgraph_2_1_5_8 = Subgraph_2_1_5_8.apply(
      Subgraph_2_1_5_8.config
        .Context(context.spark, context.config.Subgraph_2_1_5_8),
      df_SetOperation_1_5
    )
    val df_Subgraph_2_1_1_1_1_1_2 = Subgraph_2_1_1_1_1_1_2.apply(
      Subgraph_2_1_1_1_1_1_2.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_1_1_2),
      df_Subgraph_2_1_1_1_2_2
    )
    val df_Subgraph_2_1_5_7 = Subgraph_2_1_5_7.apply(
      Subgraph_2_1_5_7.config
        .Context(context.spark, context.config.Subgraph_2_1_5_7),
      df_ConfigUdfLookup_1
    )
    val df_T210Gem_10kLoc = T210Gem_10kLoc.apply(
      T210Gem_10kLoc.config
        .Context(context.spark, context.config.T210Gem_10kLoc),
      df_src_emr_s3_source_3
    )
    val df_Subgraph_2_1_5_6 = Subgraph_2_1_5_6.apply(
      Subgraph_2_1_5_6.config
        .Context(context.spark, context.config.Subgraph_2_1_5_6),
      df_ConfigUdfLookup_1
    )
    val df_Subgraph_2_1_5_3 = Subgraph_2_1_5_3.apply(
      Subgraph_2_1_5_3.config
        .Context(context.spark, context.config.Subgraph_2_1_5_3),
      df_Reformat_1_1_1_5
    )
    val df_Subgraph_2_1_1_1_1_1_2_2 = Subgraph_2_1_1_1_1_1_2_2.apply(
      Subgraph_2_1_1_1_1_1_2_2.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_1_1_2_2),
      df_Subgraph_2_1_1_1_2_2_2
    )
    val df_Script_1 = Script_1(context, df_SQLStatement_1)
    val df_Subgraph_2_1_1_1_1_1_2_1 = Subgraph_2_1_1_1_1_1_2_1.apply(
      Subgraph_2_1_1_1_1_1_2_1.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_1_1_2_1),
      df_Subgraph_2_1_1_1_2_2_1
    )
    val df_Subgraph_2_1_5_5 = Subgraph_2_1_5_5.apply(
      Subgraph_2_1_5_5.config
        .Context(context.spark, context.config.Subgraph_2_1_5_5),
      df_Reformat_1_1_1_1_4
    )
    val df_Limit_2 = Limit_2(context, df_Filter_2)
    val df_Subgraph_2_1_1_1_1_1_3 = Subgraph_2_1_1_1_1_1_3.apply(
      Subgraph_2_1_1_1_1_1_3.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_1_1_3),
      df_Subgraph_2_1_1_1_2_3
    )
    val df_Subgraph_2_1_1_1_1_1_2_3 = Subgraph_2_1_1_1_1_1_2_3.apply(
      Subgraph_2_1_1_1_1_1_2_3.config
        .Context(context.spark, context.config.Subgraph_2_1_1_1_1_1_2_3),
      df_Subgraph_2_1_1_1_2_2_3
    )
    val df_Script_2 = Script_2(context, df_Script_1)
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
    spark.conf.set("prophecy.metadata.pipeline.uri",             "pipelines/TestPerfPip1")
    spark.conf.set("spark_config1",                              "value1")
    spark.conf.set("spark_config2",                              "value2")
    spark.sparkContext.hadoopConfiguration.set("hadoop_config1", "asdasd")
    spark.sparkContext.hadoopConfiguration.set("hadoop_config2", "dasdasdasdad")
    registerUDFs(spark)
    MetricsCollector.instrument(spark, "pipelines/TestPerfPip1") {
      apply(context)
    }
  }

}
