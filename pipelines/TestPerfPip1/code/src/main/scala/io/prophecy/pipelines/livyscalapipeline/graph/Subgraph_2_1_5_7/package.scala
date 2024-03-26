package io.prophecy.pipelines.livyscalapipeline.graph

import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_5_7.config._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._
package object Subgraph_2_1_5_7 {

  def apply(context: Context, in0: DataFrame): DataFrame = {
    val df_Reformat_4_1_5_7 = Reformat_4_1_5_7(context, in0)
    val df_Filter_4_1_5_7   = Filter_4_1_5_7(context,   df_Reformat_4_1_5_7)
    df_Filter_4_1_5_7
  }

}
