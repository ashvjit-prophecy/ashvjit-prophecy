package io.prophecy.pipelines.testbasicpipelinejob.graph

import io.prophecy.libs._
import io.prophecy.pipelines.testbasicpipelinejob.config.Context
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object emr_hdfs_target_1 {

  def apply(context: Context): DataFrame =
    context.spark.read
      .format("parquet")
      .load(
        "hdfs://ip-10-0-0-5.us-west-2.compute.internal:8020/tmp/test_dataset_location/"
      )

}
