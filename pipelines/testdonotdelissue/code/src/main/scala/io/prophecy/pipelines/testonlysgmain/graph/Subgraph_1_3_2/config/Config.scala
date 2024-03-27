package io.prophecy.pipelines.testonlysgmain.graph.Subgraph_1_3_2.config

import io.prophecy.libs._
import pureconfig._
import pureconfig.generic.ProductHint
import org.apache.spark.sql.SparkSession
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_1_3_2.Subgraph_2_4_2.config.{
  Config => Subgraph_2_4_2_Config
}
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_1_3_2.Subgraph_2_1_3_2.config.{
  Config => Subgraph_2_1_3_2_Config
}

object Config {

  implicit val confHint: ProductHint[Config] =
    ProductHint[Config](ConfigFieldMapping(CamelCase, CamelCase))

}

case class Config(
  var Subgraph_2_4_2:   Subgraph_2_4_2_Config = Subgraph_2_4_2_Config(),
  var Subgraph_2_1_3_2: Subgraph_2_1_3_2_Config = Subgraph_2_1_3_2_Config()
) extends ConfigBase

case class Context(spark: SparkSession, config: Config)
