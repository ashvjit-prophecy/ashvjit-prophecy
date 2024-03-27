package io.prophecy.pipelines.testonlysgmain.graph.sg10InsideSG_8

import io.prophecy.libs._
import io.prophecy.pipelines.testonlysgmain.udfs.PipelineInitCode._
import io.prophecy.pipelines.testonlysgmain.graph.sg10InsideSG_8.Subgraph_15.config._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._
package object Subgraph_15 {

  def apply(context: Context, in0: DataFrame): DataFrame = {
    val df_Limit_2 = Limit_2(context, in0)
    df_Limit_2
  }

}
