package io.prophecy.pipelines.livyscalapipeline.graph

import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_15_1_1_2_1.config._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._
package object Subgraph_15_1_1_2_1 {

  def apply(context: Context, in0: DataFrame): DataFrame = {
    val df_Reformat_6_1_1_2_1 = Reformat_6_1_1_2_1(context, in0)
    df_Reformat_6_1_1_2_1
  }

}
