package io.prophecy.pipelines.testonlysgmain.graph.Subgraph_1_1

import io.prophecy.libs._
import io.prophecy.pipelines.testonlysgmain.udfs.PipelineInitCode._
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_1_1.Subgraph_2_2.config._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._
package object Subgraph_2_2 {

  def apply(context: Context, in0: DataFrame): DataFrame = {
    val df_Reformat_2_2 = Reformat_2_2(context, in0)
    df_Reformat_2_2
  }

}
