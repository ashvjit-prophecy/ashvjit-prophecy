package io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG.Subgraph_21.config

import io.prophecy.libs._
import pureconfig._
import pureconfig.generic.ProductHint
import org.apache.spark.sql.SparkSession

object Config {

  implicit val confHint: ProductHint[Config] =
    ProductHint[Config](ConfigFieldMapping(CamelCase, CamelCase))

}

case class Config() extends ConfigBase
case class Context(spark: SparkSession, config: Config)
