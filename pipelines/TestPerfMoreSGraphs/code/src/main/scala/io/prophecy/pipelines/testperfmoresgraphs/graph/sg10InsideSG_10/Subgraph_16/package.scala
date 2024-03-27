package io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_10

import io.prophecy.libs._
import io.prophecy.pipelines.testperfmoresgraphs.udfs.PipelineInitCode._
import io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_10.Subgraph_16.config._
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
