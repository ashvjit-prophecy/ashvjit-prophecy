package io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_11

import io.prophecy.libs._
import io.prophecy.pipelines.testperfmoresgraphs.udfs.PipelineInitCode._
import io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_11.Subgraph_21.config._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._
package object Subgraph_21 {

  def apply(context: Context, in0: DataFrame): DataFrame = {
    val df_Limit_5 = Limit_5(context, in0)
    df_Limit_5
  }

}