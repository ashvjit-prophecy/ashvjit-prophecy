package io.prophecy.pipelines.livysmallpipeline.graph

import io.prophecy.libs._
import io.prophecy.pipelines.livysmallpipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livysmallpipeline.graph.`21Gems1000LOC`.config._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._
package object `21Gems1000LOC` {

  def apply(context: Context, in0: DataFrame): DataFrame = {
    val df_Reformat_1_1   = Reformat_1_1(context,   in0)
    val df_Reformat_1_1_1 = Reformat_1_1_1(context, df_Reformat_1_1)
    val df_Filter_1_1     = Filter_1_1(context,     df_Reformat_1_1_1)
    val df_OrderBy_1_1_1  = OrderBy_1_1_1(context,  df_Filter_1_1)
    val df_OrderBy_1_1    = OrderBy_1_1(context,    df_OrderBy_1_1_1)
    val df_SetOperation_1_1 =
      SetOperation_1_1(context, df_OrderBy_1_1, df_OrderBy_1_1)
    val df_Limit_1_1         = Limit_1_1(context,         df_SetOperation_1_1)
    val df_Reformat_1        = Reformat_1(context,        in0)
    val df_Reformat_1_2      = Reformat_1_2(context,      df_Reformat_1)
    val df_Filter_1          = Filter_1(context,          df_Reformat_1_2)
    val df_OrderBy_1_2       = OrderBy_1_2(context,       df_Filter_1)
    val df_OrderBy_1         = OrderBy_1(context,         df_OrderBy_1_2)
    val df_SetOperation_1    = SetOperation_1(context,    df_OrderBy_1,     df_OrderBy_1)
    val df_FlattenSchema_1_1 = FlattenSchema_1_1(context, df_Limit_1_1)
    val df_Repartition_1_1   = Repartition_1_1(context,   df_FlattenSchema_1_1)
    val df_SQLStatement1_1   = SQLStatement1_1(context,   df_Repartition_1_1)
    val df_Limit_1           = Limit_1(context,           df_SetOperation_1)
    val df_FlattenSchema_1   = FlattenSchema_1(context,   df_Limit_1)
    val df_Repartition_1     = Repartition_1(context,     df_FlattenSchema_1)
    val df_SQLStatement1     = SQLStatement1(context,     df_Repartition_1)
    val df_Join1             = Join1(context,             df_SQLStatement1, df_SQLStatement1_1)
    val df_Script_1          = Script_1(context,          df_Limit_1_1)
    df_Join1
  }

}
