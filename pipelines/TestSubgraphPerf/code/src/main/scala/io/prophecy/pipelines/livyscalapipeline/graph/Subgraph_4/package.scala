package io.prophecy.pipelines.livyscalapipeline.graph

import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_4.config._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._
package object Subgraph_4 {

  def apply(context: Context, in: DataFrame): DataFrame = {
    val df_Reformat_1_1_3_1_5 = Reformat_1_1_3_1_5(context, in)
    val df_Reformat_1_1_5_1_5 =
      Reformat_1_1_5_1_5(context, df_Reformat_1_1_3_1_5)
    df_Reformat_1_1_5_1_5
  }

}
