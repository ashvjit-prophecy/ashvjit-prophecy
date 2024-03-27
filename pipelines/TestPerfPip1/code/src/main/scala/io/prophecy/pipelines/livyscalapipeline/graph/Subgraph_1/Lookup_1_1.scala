package io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1

import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1.config.Context
import io.prophecy.pipelines.livyscalapipeline.udfs.UDFs._
import io.prophecy.pipelines.livyscalapipeline.udfs.PipelineInitCode._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object Lookup_1_1 {

  def apply(context: Context, in0: DataFrame): Unit =
    createLookup("LookupTest1",
                 in0,
                 context.spark,
                 List("variable", "unit"),
                 "value"
    )

}
