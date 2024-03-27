package io.prophecy.pipelines.livyscalapipeline.graph

import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_2.config._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._
package object Subgraph_2_1_1_2 {

  def apply(context: Context, in0: DataFrame): DataFrame = {
    val df_Reformat_3_1_1_2 = Reformat_3_1_1_2(context, in0)
    df_Reformat_3_1_1_2
  }

}