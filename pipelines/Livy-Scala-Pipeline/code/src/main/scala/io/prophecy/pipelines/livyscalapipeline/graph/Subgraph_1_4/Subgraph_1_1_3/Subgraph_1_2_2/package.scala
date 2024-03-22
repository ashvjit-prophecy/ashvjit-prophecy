package io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1_4.Subgraph_1_1_3

import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1_4.Subgraph_1_1_3.Subgraph_1_2_2.config._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._
package object Subgraph_1_2_2 {

  def apply(context: Context, in0: DataFrame): DataFrame = {
    val df_Reformat_1_1_3_3_2 = Reformat_1_1_3_3_2(context, in0)
    val df_Reformat_1_1_5_3_2 =
      Reformat_1_1_5_3_2(context, df_Reformat_1_1_3_3_2)
    val df_Reformat_1_1_3_1_3_2 =
      Reformat_1_1_3_1_3_2(context, df_Reformat_1_1_5_3_2)
    val df_Reformat_1_1_5_1_3_2 =
      Reformat_1_1_5_1_3_2(context, df_Reformat_1_1_3_1_3_2)
    val df_Reformat_1_1_6_2   = Reformat_1_1_6_2(context,   in0)
    val df_Reformat_1_1_4_3_2 = Reformat_1_1_4_3_2(context, df_Reformat_1_1_6_2)
    val df_Reformat_1_1_1_3_2 =
      Reformat_1_1_1_3_2(context, df_Reformat_1_1_4_3_2)
    val df_Reformat_1_1_4_1_3_2 =
      Reformat_1_1_4_1_3_2(context, df_Reformat_1_1_1_3_2)
    val df_Reformat_1_1_1_1_2_2 =
      Reformat_1_1_1_1_2_2(context, df_Reformat_1_1_4_1_3_2)
    val df_Reformat_1_1_4_1_1_2_2 =
      Reformat_1_1_4_1_1_2_2(context, df_Reformat_1_1_1_1_2_2)
    val df_SetOperation_1_3_2 =
      SetOperation_1_3_2(context, df_Reformat_1_1_6_2, df_Reformat_1_1_3_3_2)
    val df_SetOperation_1_1_3_2 = SetOperation_1_1_3_2(context,
                                                       df_Reformat_1_1_1_3_2,
                                                       df_SetOperation_1_3_2
    )
    val df_Reformat_1_1_3_1_1_2_2 =
      Reformat_1_1_3_1_1_2_2(context, df_Reformat_1_1_5_1_3_2)
    val df_SetOperation_1_1_1_2_2 = SetOperation_1_1_1_2_2(
      context,
      df_SetOperation_1_1_3_2,
      df_Reformat_1_1_3_1_1_2_2
    )
    val df_Reformat_1_1_5_1_1_2_2 =
      Reformat_1_1_5_1_1_2_2(context, df_Reformat_1_1_3_1_1_2_2)
    df_SetOperation_1_1_1_2_2
  }

}
