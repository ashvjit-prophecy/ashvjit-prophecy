package io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1.Subgraph_1_1

import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1.Subgraph_1_1.Subgraph_1_2.config._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._
package object Subgraph_1_2 {

  def apply(context: Context, in0: DataFrame): DataFrame = {
    val df_Reformat_1_1_6   = Reformat_1_1_6(context,   in0)
    val df_Reformat_1_1_4_3 = Reformat_1_1_4_3(context, df_Reformat_1_1_6)
    val df_Reformat_1_1_1_3 = Reformat_1_1_1_3(context, df_Reformat_1_1_4_3)
    val df_Reformat_1_1_3_3 = Reformat_1_1_3_3(context, in0)
    val df_SetOperation_1_3 =
      SetOperation_1_3(context, df_Reformat_1_1_6, df_Reformat_1_1_3_3)
    val df_SetOperation_1_1_3 =
      SetOperation_1_1_3(context, df_Reformat_1_1_1_3, df_SetOperation_1_3)
    val df_Reformat_1_1_5_3   = Reformat_1_1_5_3(context,   df_Reformat_1_1_3_3)
    val df_Reformat_1_1_3_1_3 = Reformat_1_1_3_1_3(context, df_Reformat_1_1_5_3)
    val df_Reformat_1_1_4_1_3 = Reformat_1_1_4_1_3(context, df_Reformat_1_1_1_3)
    val df_Reformat_1_1_1_1_2 =
      Reformat_1_1_1_1_2(context, df_Reformat_1_1_4_1_3)
    val df_Reformat_1_1_5_1_3 =
      Reformat_1_1_5_1_3(context, df_Reformat_1_1_3_1_3)
    val df_Reformat_1_1_3_1_1_2 =
      Reformat_1_1_3_1_1_2(context, df_Reformat_1_1_5_1_3)
    val df_Reformat_1_1_5_1_1_2 =
      Reformat_1_1_5_1_1_2(context, df_Reformat_1_1_3_1_1_2)
    val df_SetOperation_1_1_1_2 = SetOperation_1_1_1_2(context,
                                                       df_SetOperation_1_1_3,
                                                       df_Reformat_1_1_3_1_1_2
    )
    val df_Reformat_1_1_4_1_1_2 =
      Reformat_1_1_4_1_1_2(context, df_Reformat_1_1_1_1_2)
    df_SetOperation_1_1_1_2
  }

}
