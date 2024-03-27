package io.prophecy.pipelines.testonlysgmain.config

import pureconfig._
import pureconfig.generic.ProductHint
import io.prophecy.libs._
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_1.config.{
  Config => Subgraph_1_Config
}
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_1_1.config.{
  Config => Subgraph_1_1_Config
}
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_1_3.config.{
  Config => Subgraph_1_3_Config
}
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_1_3_1.config.{
  Config => Subgraph_1_3_1_Config
}
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_1_4.config.{
  Config => Subgraph_1_4_Config
}
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_1_2_1.config.{
  Config => Subgraph_1_2_1_Config
}
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_1_1_1.config.{
  Config => Subgraph_1_1_1_Config
}
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_1_3_2.config.{
  Config => Subgraph_1_3_2_Config
}
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_1_3_1_1.config.{
  Config => Subgraph_1_3_1_1_Config
}

case class Config(
  var Subgraph_1:       Subgraph_1_Config = Subgraph_1_Config(),
  var Subgraph_1_3:     Subgraph_1_3_Config = Subgraph_1_3_Config(),
  var Subgraph_1_3_2:   Subgraph_1_3_2_Config = Subgraph_1_3_2_Config(),
  var Subgraph_1_3_1_1: Subgraph_1_3_1_1_Config = Subgraph_1_3_1_1_Config(),
  var Subgraph_1_2_1:   Subgraph_1_2_1_Config = Subgraph_1_2_1_Config(),
  var Subgraph_1_1_1:   Subgraph_1_1_1_Config = Subgraph_1_1_1_Config(),
  var Subgraph_1_4:     Subgraph_1_4_Config = Subgraph_1_4_Config(),
  var Subgraph_1_1:     Subgraph_1_1_Config = Subgraph_1_1_Config(),
  var Subgraph_1_3_1:   Subgraph_1_3_1_Config = Subgraph_1_3_1_Config()
) extends ConfigBase
