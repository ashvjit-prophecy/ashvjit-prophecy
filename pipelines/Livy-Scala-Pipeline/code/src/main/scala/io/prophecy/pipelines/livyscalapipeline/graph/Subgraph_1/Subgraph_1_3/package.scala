package io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1

import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1.Subgraph_1_3.config._
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1.Subgraph_1_3.Subgraph_1_1_2
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1.Subgraph_1_3.Subgraph_1_2_1
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._
package object Subgraph_1_3 {

  def apply(context: Context, in0: DataFrame): DataFrame = {
    val df_Reformat_1_1_7   = Reformat_1_1_7(context,   in0)
    val df_Reformat_1_1_4_4 = Reformat_1_1_4_4(context, df_Reformat_1_1_7)
    val df_Reformat_1_1_1_4 = Reformat_1_1_1_4(context, df_Reformat_1_1_4_4)
    val df_Reformat_1_1_3_4 = Reformat_1_1_3_4(context, in0)
    val df_SetOperation_1_4 =
      SetOperation_1_4(context, df_Reformat_1_1_7, df_Reformat_1_1_3_4)
    val df_SetOperation_1_1_4 =
      SetOperation_1_1_4(context, df_Reformat_1_1_1_4, df_SetOperation_1_4)
    val df_Reformat_1_1_5_4   = Reformat_1_1_5_4(context,   df_Reformat_1_1_3_4)
    val df_Reformat_1_1_3_1_4 = Reformat_1_1_3_1_4(context, df_Reformat_1_1_5_4)
    val df_Reformat_1_1_5_1_4 =
      Reformat_1_1_5_1_4(context, df_Reformat_1_1_3_1_4)
    val df_Reformat_1_1_3_1_1_3 =
      Reformat_1_1_3_1_1_3(context, df_Reformat_1_1_5_1_4)
    val df_SetOperation_1_1_1_4 = SetOperation_1_1_1_4(context,
                                                       df_SetOperation_1_1_4,
                                                       df_Reformat_1_1_3_1_1_3
    )
    val df_Subgraph_1_1_2 = Subgraph_1_1_2.apply(
      Subgraph_1_1_2.config
        .Context(context.spark, context.config.Subgraph_1_1_2),
      df_Reformat_1_1_7
    )
    val df_Subgraph_1_2_1 = Subgraph_1_2_1.apply(
      Subgraph_1_2_1.config
        .Context(context.spark, context.config.Subgraph_1_2_1),
      df_Reformat_1_1_3_4
    )
    val df_Reformat_1_1_5_1_1_3 =
      Reformat_1_1_5_1_1_3(context, df_Subgraph_1_2_1)
    val df_SetOperation_1_1_1_3_2 = SetOperation_1_1_1_3_2(
      context,
      df_Subgraph_1_1_2,
      df_SetOperation_1_1_1_4,
      df_Subgraph_1_2_1
    )
    val df_Reformat_1_1_4_1_4 = Reformat_1_1_4_1_4(context, df_Reformat_1_1_1_4)
    val df_Reformat_1_1_1_1_3 =
      Reformat_1_1_1_1_3(context, df_Reformat_1_1_4_1_4)
    val df_Reformat_1_1_4_1_1_3 =
      Reformat_1_1_4_1_1_3(context, df_Reformat_1_1_1_1_3)
    val df_Limit_1_2 = Limit_1_2(context, df_SetOperation_1_1_1_3_2)
    df_Limit_1_2
  }

}
