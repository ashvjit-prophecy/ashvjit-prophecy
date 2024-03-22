package io.prophecy.pipelines.livyscalapipeline.graph

import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1.config._
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1.Subgraph_1_1
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1.Subgraph_1_3
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._
package object Subgraph_1 {

  def apply(context: Context, in0: DataFrame): DataFrame = {
    val df_Reformat_1_1     = Reformat_1_1(context,     in0)
    val df_Reformat_1_1_4   = Reformat_1_1_4(context,   df_Reformat_1_1)
    val df_Reformat_1_1_1   = Reformat_1_1_1(context,   df_Reformat_1_1_4)
    val df_Reformat_1_1_4_1 = Reformat_1_1_4_1(context, df_Reformat_1_1_1)
    val df_Reformat_1_1_3   = Reformat_1_1_3(context,   in0)
    val df_Reformat_1_1_5   = Reformat_1_1_5(context,   df_Reformat_1_1_3)
    val df_Reformat_1_1_3_1 = Reformat_1_1_3_1(context, df_Reformat_1_1_5)
    val df_Reformat_1_1_5_1 = Reformat_1_1_5_1(context, df_Reformat_1_1_3_1)
    val df_SetOperation_1 =
      SetOperation_1(context, df_Reformat_1_1, df_Reformat_1_1_3)
    val df_SetOperation_1_1 =
      SetOperation_1_1(context, df_Reformat_1_1_1, df_SetOperation_1)
    val df_Reformat_1_1_3_1_1 = Reformat_1_1_3_1_1(context, df_Reformat_1_1_5_1)
    val df_SetOperation_1_1_1 =
      SetOperation_1_1_1(context, df_SetOperation_1_1, df_Reformat_1_1_3_1_1)
    val df_Subgraph_1_1 = Subgraph_1_1.apply(
      Subgraph_1_1.config.Context(context.spark, context.config.Subgraph_1_1),
      df_Reformat_1_1_1
    )
    val df_Subgraph_1_3 = Subgraph_1_3.apply(
      Subgraph_1_3.config.Context(context.spark, context.config.Subgraph_1_3),
      df_Reformat_1_1_3_1
    )
    val df_SetOperation_1_1_1_3 = SetOperation_1_1_1_3(context,
                                                       df_Subgraph_1_1,
                                                       df_SetOperation_1_1_1,
                                                       df_Subgraph_1_3
    )
    val df_Limit_1            = Limit_1(context,            df_SetOperation_1_1_1_3)
    val df_Reformat_1_1_1_1   = Reformat_1_1_1_1(context,   df_Reformat_1_1_4_1)
    val df_Reformat_1_1_5_1_1 = Reformat_1_1_5_1_1(context, df_Subgraph_1_3)
    val df_Reformat_1_1_4_1_1 = Reformat_1_1_4_1_1(context, df_Reformat_1_1_1_1)
    df_Limit_1
  }

}
