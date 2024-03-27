package io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_12

import io.prophecy.libs._
import io.prophecy.pipelines.testperfmoresgraphs.udfs.PipelineInitCode._
import io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_12.Subgraph_14.config._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._
package object Subgraph_14 {

  def apply(context: Context, in0: DataFrame): DataFrame = {
    val df_Filter_6 = Filter_6(context, in0)
    df_Filter_6
  }

}
