package io.prophecy.pipelines.livysmallpipeline.graph

import io.prophecy.libs._
import io.prophecy.pipelines.livysmallpipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livysmallpipeline.graph.sg100gems.config._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._
package object sg100gems {

  def apply(context: Context, in0: DataFrame): Subgraph8 = {
    val df_Reformat_1_3_3     = Reformat_1_3_3(context,     in0)
    val df_Reformat_1_1_2_1_3 = Reformat_1_1_2_1_3(context, df_Reformat_1_3_3)
    val df_Reformat_1_1_3_3   = Reformat_1_1_3_3(context,   df_Reformat_1_1_2_1_3)
    val df_Filter_1_1_3       = Filter_1_1_3(context,       df_Reformat_1_1_3_3)
    val df_OrderBy_1_1_3      = OrderBy_1_1_3(context,      df_Filter_1_1_3)
    val df_SetOperation_1_1_3 =
      SetOperation_1_1_3(context, df_OrderBy_1_1_3, df_OrderBy_1_1_3)
    val df_SchemaTransform_1_2_3 =
      SchemaTransform_1_2_3(context, df_SetOperation_1_1_3)
    val df_Reformat_1_2     = Reformat_1_2(context,     in0)
    val df_Reformat_1_1_2   = Reformat_1_1_2(context,   df_Reformat_1_2)
    val df_Reformat_1_1_1   = Reformat_1_1_1(context,   df_Reformat_1_1_2)
    val df_Filter_1_1       = Filter_1_1(context,       df_Reformat_1_1_1)
    val df_OrderBy_1_1      = OrderBy_1_1(context,      df_Filter_1_1)
    val df_Reformat_1_3_3_1 = Reformat_1_3_3_1(context, in0)
    val df_Reformat_1_1_2_1_3_1 =
      Reformat_1_1_2_1_3_1(context, df_Reformat_1_3_3_1)
    val df_Reformat_1_1_3_3_1 =
      Reformat_1_1_3_3_1(context, df_Reformat_1_1_2_1_3_1)
    val df_Filter_1_1_3_1  = Filter_1_1_3_1(context,  df_Reformat_1_1_3_3_1)
    val df_OrderBy_1_1_3_1 = OrderBy_1_1_3_1(context, df_Filter_1_1_3_1)
    val df_SetOperation_1_1_3_1 =
      SetOperation_1_1_3_1(context, df_OrderBy_1_1_3_1, df_OrderBy_1_1_3_1)
    val df_SchemaTransform_1_2_3_1 =
      SchemaTransform_1_2_3_1(context, df_SetOperation_1_1_3_1)
    val df_Limit_1_2_3_1       = Limit_1_2_3_1(context,       df_SchemaTransform_1_2_3_1)
    val df_Repartition_1_2_3_1 = Repartition_1_2_3_1(context, df_Limit_1_2_3_1)
    val df_SQLStatement_1_2_3_1 =
      SQLStatement_1_2_3_1(context, df_Repartition_1_2_3_1)
    val df_SchemaTransform_1_1_1_3_1 =
      SchemaTransform_1_1_1_3_1(context, df_SQLStatement_1_2_3_1)
    val df_Limit_1_1_1_3_1 =
      Limit_1_1_1_3_1(context, df_SchemaTransform_1_1_1_3_1)
    val df_Repartition_1_1_1_3_1 =
      Repartition_1_1_1_3_1(context, df_Limit_1_1_1_3_1)
    val df_SQLStatement_1_1_1_3_1 =
      SQLStatement_1_1_1_3_1(context, df_Repartition_1_1_1_3_1)
    val df_Reformat_1_2_1_3_1 =
      Reformat_1_2_1_3_1(context, df_SQLStatement_1_1_1_3_1)
    val df_Reformat_1_3_2     = Reformat_1_3_2(context,     in0)
    val df_Reformat_1_1_2_1_2 = Reformat_1_1_2_1_2(context, df_Reformat_1_3_2)
    val df_Reformat_1_1_3_2   = Reformat_1_1_3_2(context,   df_Reformat_1_1_2_1_2)
    val df_Filter_1_1_2       = Filter_1_1_2(context,       df_Reformat_1_1_3_2)
    val df_OrderBy_1_1_2      = OrderBy_1_1_2(context,      df_Filter_1_1_2)
    val df_SetOperation_1_1_2 =
      SetOperation_1_1_2(context, df_OrderBy_1_1_2, df_OrderBy_1_1_2)
    val df_SchemaTransform_1_2_2 =
      SchemaTransform_1_2_2(context, df_SetOperation_1_1_2)
    val df_Limit_1_2_2       = Limit_1_2_2(context,       df_SchemaTransform_1_2_2)
    val df_Repartition_1_2_2 = Repartition_1_2_2(context, df_Limit_1_2_2)
    val df_SQLStatement_1_2_2 =
      SQLStatement_1_2_2(context, df_Repartition_1_2_2)
    val df_SchemaTransform_1_1_1_2 =
      SchemaTransform_1_1_1_2(context, df_SQLStatement_1_2_2)
    val df_Limit_1_1_1_2       = Limit_1_1_1_2(context,       df_SchemaTransform_1_1_1_2)
    val df_Repartition_1_1_1_2 = Repartition_1_1_1_2(context, df_Limit_1_1_1_2)
    val df_SQLStatement_1_1_1_2 =
      SQLStatement_1_1_1_2(context, df_Repartition_1_1_1_2)
    val df_Reformat_1_2_1_2   = Reformat_1_2_1_2(context,   df_SQLStatement_1_1_1_2)
    val df_Reformat_1_3_1     = Reformat_1_3_1(context,     in0)
    val df_Reformat_1_1_2_1_1 = Reformat_1_1_2_1_1(context, df_Reformat_1_3_1)
    val df_Reformat_1_1_3_1   = Reformat_1_1_3_1(context,   df_Reformat_1_1_2_1_1)
    val df_Filter_1_1_1       = Filter_1_1_1(context,       df_Reformat_1_1_3_1)
    val df_OrderBy_1_1_1      = OrderBy_1_1_1(context,      df_Filter_1_1_1)
    val df_SetOperation_1_1_1 =
      SetOperation_1_1_1(context, df_OrderBy_1_1_1, df_OrderBy_1_1_1)
    val df_SchemaTransform_1_2_1 =
      SchemaTransform_1_2_1(context, df_SetOperation_1_1_1)
    val df_Limit_1_2_1       = Limit_1_2_1(context,       df_SchemaTransform_1_2_1)
    val df_Repartition_1_2_1 = Repartition_1_2_1(context, df_Limit_1_2_1)
    val df_SQLStatement_1_2_1 =
      SQLStatement_1_2_1(context, df_Repartition_1_2_1)
    val df_SchemaTransform_1_1_1_1 =
      SchemaTransform_1_1_1_1(context, df_SQLStatement_1_2_1)
    val df_Limit_1_1_1_1 = Limit_1_1_1_1(context, df_SchemaTransform_1_1_1_1)
    val df_SetOperation_1_1 =
      SetOperation_1_1(context, df_OrderBy_1_1, df_OrderBy_1_1)
    val df_Limit_1_2_3       = Limit_1_2_3(context,       df_SchemaTransform_1_2_3)
    val df_Repartition_1_2_3 = Repartition_1_2_3(context, df_Limit_1_2_3)
    val df_SQLStatement_1_2_3 =
      SQLStatement_1_2_3(context, df_Repartition_1_2_3)
    val df_SchemaTransform_1_1_1_3 =
      SchemaTransform_1_1_1_3(context, df_SQLStatement_1_2_3)
    val df_Limit_1_1_1_3       = Limit_1_1_1_3(context,       df_SchemaTransform_1_1_1_3)
    val df_Repartition_1_1_1_3 = Repartition_1_1_1_3(context, df_Limit_1_1_1_3)
    val df_SchemaTransform_1_1 =
      SchemaTransform_1_1(context, df_SetOperation_1_1)
    val df_Limit_1_2        = Limit_1_2(context,        df_SchemaTransform_1_1)
    val df_Repartition_1_1  = Repartition_1_1(context,  df_Limit_1_2)
    val df_SQLStatement_1_1 = SQLStatement_1_1(context, df_Repartition_1_1)
    val df_SchemaTransform_1_1_1 =
      SchemaTransform_1_1_1(context, df_SQLStatement_1_1)
    val df_Limit_1_1_1         = Limit_1_1_1(context,         df_SchemaTransform_1_1_1)
    val df_Repartition_1_1     = Repartition_1_1(context,     df_Limit_1_1_1)
    val df_SQLStatement_1_1_1  = SQLStatement_1_1_1(context,  df_Repartition_1_1)
    val df_Repartition_1_1_1_1 = Repartition_1_1_1_1(context, df_Limit_1_1_1_1)
    val df_SQLStatement_1_1_1_1 =
      SQLStatement_1_1_1_1(context, df_Repartition_1_1_1_1)
    val df_Reformat_1_2_1_1 = Reformat_1_2_1_1(context, df_SQLStatement_1_1_1_1)
    val df_Reformat_1_3_3_2 = Reformat_1_3_3_2(context, in0)
    val df_Reformat_1_1_2_1_3_2 =
      Reformat_1_1_2_1_3_2(context, df_Reformat_1_3_3_2)
    val df_Reformat_1_1_3_3_2 =
      Reformat_1_1_3_3_2(context, df_Reformat_1_1_2_1_3_2)
    val df_Filter_1_1_3_2  = Filter_1_1_3_2(context,  df_Reformat_1_1_3_3_2)
    val df_OrderBy_1_1_3_2 = OrderBy_1_1_3_2(context, df_Filter_1_1_3_2)
    val df_SetOperation_1_1_3_2 =
      SetOperation_1_1_3_2(context, df_OrderBy_1_1_3_2, df_OrderBy_1_1_3_2)
    val df_SchemaTransform_1_2_3_2 =
      SchemaTransform_1_2_3_2(context, df_SetOperation_1_1_3_2)
    val df_Limit_1_2_3_2       = Limit_1_2_3_2(context,       df_SchemaTransform_1_2_3_2)
    val df_Repartition_1_2_3_2 = Repartition_1_2_3_2(context, df_Limit_1_2_3_2)
    val df_SQLStatement_1_2_3_2 =
      SQLStatement_1_2_3_2(context, df_Repartition_1_2_3_2)
    val df_SchemaTransform_1_1_1_3_2 =
      SchemaTransform_1_1_1_3_2(context, df_SQLStatement_1_2_3_2)
    val df_Limit_1_1_1_3_2 =
      Limit_1_1_1_3_2(context, df_SchemaTransform_1_1_1_3_2)
    val df_Repartition_1_1_1_3_2 =
      Repartition_1_1_1_3_2(context, df_Limit_1_1_1_3_2)
    val df_Reformat_1_3     = Reformat_1_3(context,     in0)
    val df_Reformat_1_1_2_1 = Reformat_1_1_2_1(context, df_Reformat_1_3)
    val df_Reformat_1_1_3   = Reformat_1_1_3(context,   df_Reformat_1_1_2_1)
    val df_Filter_1_1       = Filter_1_1(context,       df_Reformat_1_1_3)
    val df_OrderBy_1_1      = OrderBy_1_1(context,      df_Filter_1_1)
    val df_SetOperation_1_1 =
      SetOperation_1_1(context, df_OrderBy_1_1, df_OrderBy_1_1)
    val df_SchemaTransform_1_2 =
      SchemaTransform_1_2(context, df_SetOperation_1_1)
    val df_Limit_1_2        = Limit_1_2(context,        df_SchemaTransform_1_2)
    val df_Repartition_1_2  = Repartition_1_2(context,  df_Limit_1_2)
    val df_SQLStatement_1_2 = SQLStatement_1_2(context, df_Repartition_1_2)
    val df_SchemaTransform_1_1_1 =
      SchemaTransform_1_1_1(context, df_SQLStatement_1_2)
    val df_Limit_1_1_1 = Limit_1_1_1(context, df_SchemaTransform_1_1_1)
    val df_SQLStatement_1_1_1_3_2 =
      SQLStatement_1_1_1_3_2(context, df_Repartition_1_1_1_3_2)
    val df_Reformat_1_2_1_3_2 =
      Reformat_1_2_1_3_2(context, df_SQLStatement_1_1_1_3_2)
    val df_SQLStatement_1_1_1_3 =
      SQLStatement_1_1_1_3(context, df_Repartition_1_1_1_3)
    val df_Reformat_1_2_1_3  = Reformat_1_2_1_3(context,  df_SQLStatement_1_1_1_3)
    val df_Repartition_1_1_1 = Repartition_1_1_1(context, df_Limit_1_1_1)
    val df_SQLStatement_1_1_1 =
      SQLStatement_1_1_1(context, df_Repartition_1_1_1)
    val df_Reformat_1_2_1   = Reformat_1_2_1(context,   df_SQLStatement_1_1_1)
    val df_Reformat_1_1_1   = Reformat_1_1_1(context,   df_Reformat_1_2_1)
    val df_Reformat_1_2_1_1 = Reformat_1_2_1_1(context, df_SQLStatement_1_1_1)
    (df_Reformat_1_1_1,
     df_Reformat_1_2_1_1,
     df_Reformat_1_2_1_1,
     df_Reformat_1_2_1_2,
     df_Reformat_1_2_1_3,
     df_Reformat_1_2_1_3_1,
     df_Reformat_1_2_1_3_2,
     df_Reformat_1_2_1_3_2
    )
  }

}
