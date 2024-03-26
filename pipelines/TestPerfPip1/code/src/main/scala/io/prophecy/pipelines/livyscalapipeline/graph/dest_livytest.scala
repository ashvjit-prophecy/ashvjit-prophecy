package io.prophecy.pipelines.livyscalapipeline.graph

import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.config.Context
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object dest_livytest {

  def apply(context: Context, in: DataFrame): Unit =
    in.write
      .format("parquet")
      .mode("overwrite")
      .save("file:/storage/out/livytest_outashkscluster")

}
