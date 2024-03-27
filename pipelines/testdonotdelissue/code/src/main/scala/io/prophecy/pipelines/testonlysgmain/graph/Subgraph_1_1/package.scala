package io.prophecy.pipelines.testonlysgmain.graph

import io.prophecy.libs._
import io.prophecy.pipelines.testonlysgmain.udfs.PipelineInitCode._
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_1_1.config._
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_1_1.Subgraph_2_2
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_1_1.Subgraph_2_1_1
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._
package object Subgraph_1_1 {

  def apply(context: Context, in0: DataFrame): DataFrame = {
    val df_Reformat_1_1 = Reformat_1_1(context, in0)
    val df_Filter_1_1   = Filter_1_1(context,   df_Reformat_1_1)
    val df_Subgraph_2_2 = Subgraph_2_2.apply(
      Subgraph_2_2.config.Context(context.spark, context.config.Subgraph_2_2),
      df_Filter_1_1
    )
    val df_Subgraph_2_1_1 = Subgraph_2_1_1.apply(
      Subgraph_2_1_1.config
        .Context(context.spark, context.config.Subgraph_2_1_1),
      df_Subgraph_2_2
    )
    df_Subgraph_2_1_1
  }

}
