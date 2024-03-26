package io.prophecy.pipelines.livyscalapipeline.graph.`210Gem_10kLoc`

import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livyscalapipeline.graph.`210Gem_10kLoc`.Subgraph_2_1.config._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._
package object Subgraph_2_1 {

  def apply(context: Context, in0: DataFrame): DataFrame = {
    val df_Reformat_1_3   = Reformat_1_3(context,   in0)
    val df_Reformat_1_2_1 = Reformat_1_2_1(context, df_Reformat_1_3)
    val df_Filter_1_2     = Filter_1_2(context,     df_Reformat_1_2_1)
    val df_OrderBy_1_2_1  = OrderBy_1_2_1(context,  df_Filter_1_2)
    val df_OrderBy_1_3    = OrderBy_1_3(context,    df_OrderBy_1_2_1)
    val df_SetOperation_1_2 =
      SetOperation_1_2(context, df_OrderBy_1_3, df_OrderBy_1_3)
    val df_Limit_1_2         = Limit_1_2(context,         df_SetOperation_1_2)
    val df_FlattenSchema_1_2 = FlattenSchema_1_2(context, df_Limit_1_2)
    val df_Repartition_1_2   = Repartition_1_2(context,   df_FlattenSchema_1_2)
    val df_Reformat_1_1_2    = Reformat_1_1_2(context,    in0)
    val df_Reformat_1_1_1_1  = Reformat_1_1_1_1(context,  df_Reformat_1_1_2)
    val df_Filter_1_1_1      = Filter_1_1_1(context,      df_Reformat_1_1_1_1)
    val df_OrderBy_1_1_1_1   = OrderBy_1_1_1_1(context,   df_Filter_1_1_1)
    val df_OrderBy_1_1_2     = OrderBy_1_1_2(context,     df_OrderBy_1_1_1_1)
    val df_SetOperation_1_1_1 =
      SetOperation_1_1_1(context, df_OrderBy_1_1_2, df_OrderBy_1_1_2)
    val df_Limit_1_1_1         = Limit_1_1_1(context,         df_SetOperation_1_1_1)
    val df_FlattenSchema_1_1_1 = FlattenSchema_1_1_1(context, df_Limit_1_1_1)
    val df_Repartition_1_1_1 =
      Repartition_1_1_1(context, df_FlattenSchema_1_1_1)
    val df_SQLStatement1_1_1 = SQLStatement1_1_1(context, df_Repartition_1_1_1)
    val df_SQLStatement1_2   = SQLStatement1_2(context,   df_Repartition_1_2)
    val df_Join1_1           = Join1_1(context,           df_SQLStatement1_2, df_SQLStatement1_1_1)
    val df_Script_1_1        = Script_1_1(context,        df_Limit_1_1_1)
    df_Join1_1
  }

}
