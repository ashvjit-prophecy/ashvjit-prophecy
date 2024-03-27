package io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_10.Subgraph_15

import io.prophecy.libs._
import io.prophecy.pipelines.testperfmoresgraphs.udfs.PipelineInitCode._
import io.prophecy.pipelines.testperfmoresgraphs.udfs.UDFs._
import io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_10.Subgraph_15.config.Context
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object Limit_2 {
  def apply(context: Context, in: DataFrame): DataFrame = in.limit(10)
}
