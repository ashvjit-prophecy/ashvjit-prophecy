package io.prophecy.pipelines.livyscalapipeline.graph

import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2.config._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._
package object Subgraph_2 {

  def apply(context: Context, in0: DataFrame): DataFrame = {
    val df_Reformat_4 = Reformat_4(context, in0)
    val df_Filter_4   = Filter_4(context,   df_Reformat_4)
    df_Filter_4
  }

}
