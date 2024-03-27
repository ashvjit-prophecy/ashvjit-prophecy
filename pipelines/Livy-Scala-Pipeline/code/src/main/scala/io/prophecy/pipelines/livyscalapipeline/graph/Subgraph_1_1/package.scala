package io.prophecy.pipelines.livyscalapipeline.graph

import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1_1.config._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._
package object Subgraph_1_1 {

  def apply(context: Context, in0: DataFrame): DataFrame = {
    val df_src_emr_s3_source = src_emr_s3_source(context)
    Lookup_1_1(context, df_src_emr_s3_source)
    val df_Reformat_2_1 = Reformat_2_1(context, in0)
    val df_Filter_2     = Filter_2(context,     df_Reformat_2_1)
    val df_OrderBy_2    = OrderBy_2(context,    df_Filter_2)
    val df_Limit_2      = Limit_2(context,      df_OrderBy_2)
    df_Limit_2
  }

}
