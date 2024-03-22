package io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1_4_1.Subgraph_1_3_1_1

import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1_4_1.Subgraph_1_3_1_1.Subgraph_1_2_1_1_1.config._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._
package object Subgraph_1_2_1_1_1 {

  def apply(context: Context, in0: DataFrame): DataFrame = {
    val df_Reformat_1_1_3_3_1_1_1 = Reformat_1_1_3_3_1_1_1(context, in0)
    val df_Reformat_1_1_5_3_1_1_1 =
      Reformat_1_1_5_3_1_1_1(context, df_Reformat_1_1_3_3_1_1_1)
    val df_Reformat_1_1_3_1_3_1_1_1 =
      Reformat_1_1_3_1_3_1_1_1(context, df_Reformat_1_1_5_3_1_1_1)
    val df_Reformat_1_1_5_1_3_1_1_1 =
      Reformat_1_1_5_1_3_1_1_1(context, df_Reformat_1_1_3_1_3_1_1_1)
    val df_Reformat_1_1_3_1_1_2_1_1_1 =
      Reformat_1_1_3_1_1_2_1_1_1(context, df_Reformat_1_1_5_1_3_1_1_1)
    val df_Reformat_1_1_5_1_1_2_1_1_1 =
      Reformat_1_1_5_1_1_2_1_1_1(context, df_Reformat_1_1_3_1_1_2_1_1_1)
    val df_Reformat_1_1_6_1_1_1 = Reformat_1_1_6_1_1_1(context, in0)
    val df_Reformat_1_1_4_3_1_1_1 =
      Reformat_1_1_4_3_1_1_1(context, df_Reformat_1_1_6_1_1_1)
    val df_Reformat_1_1_1_3_1_1_1 =
      Reformat_1_1_1_3_1_1_1(context, df_Reformat_1_1_4_3_1_1_1)
    val df_SetOperation_1_3_1_1_1 = SetOperation_1_3_1_1_1(
      context,
      df_Reformat_1_1_6_1_1_1,
      df_Reformat_1_1_3_3_1_1_1
    )
    val df_SetOperation_1_1_3_1_1_1 = SetOperation_1_1_3_1_1_1(
      context,
      df_Reformat_1_1_1_3_1_1_1,
      df_SetOperation_1_3_1_1_1
    )
    val df_SetOperation_1_1_1_2_1_1_1 = SetOperation_1_1_1_2_1_1_1(
      context,
      df_SetOperation_1_1_3_1_1_1,
      df_Reformat_1_1_3_1_1_2_1_1_1
    )
    val df_Reformat_1_1_4_1_3_1_1_1 =
      Reformat_1_1_4_1_3_1_1_1(context, df_Reformat_1_1_1_3_1_1_1)
    val df_Reformat_1_1_1_1_2_1_1_1 =
      Reformat_1_1_1_1_2_1_1_1(context, df_Reformat_1_1_4_1_3_1_1_1)
    val df_Reformat_1_1_4_1_1_2_1_1_1 =
      Reformat_1_1_4_1_1_2_1_1_1(context, df_Reformat_1_1_1_1_2_1_1_1)
    df_SetOperation_1_1_1_2_1_1_1
  }

}
