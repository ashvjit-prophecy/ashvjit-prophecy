package io.prophecy.pipelines.testonlysgmain.graph.sg10InsideSG_4

import io.prophecy.libs._
import io.prophecy.pipelines.testonlysgmain.udfs.PipelineInitCode._
import io.prophecy.pipelines.testonlysgmain.graph.sg10InsideSG_4.Subgraph_16.config._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._
package object Subgraph_16 {

  def apply(context: Context, in0: DataFrame): DataFrame = {
    val df_Filter_7 = Filter_7(context, in0)
    df_Filter_7
  }

}