package io.prophecy.pipelines.testonlysgmain.graph.Subgraph_1_3.Subgraph_2_4.config

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