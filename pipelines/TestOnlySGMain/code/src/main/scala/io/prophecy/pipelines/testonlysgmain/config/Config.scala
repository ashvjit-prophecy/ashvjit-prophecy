package io.prophecy.pipelines.testonlysgmain.config

import pureconfig._
import pureconfig.generic.ProductHint
import io.prophecy.libs._
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_2.config.{
  Config => Subgraph_2_Config
}
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_3.config.{
  Config => Subgraph_3_Config
}
import io.prophecy.pipelines.testonlysgmain.graph.sgwith2SG2gem_8.config.{
  Config => sgwith2SG2gem_8_Config
}
import io.prophecy.pipelines.testonlysgmain.graph.sgwith2SG2gem_7.config.{
  Config => sgwith2SG2gem_7_Config
}
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_1.config.{
  Config => Subgraph_1_Config
}
import io.prophecy.pipelines.testonlysgmain.graph.sgwith2SG2gem.config.{
  Config => sgwith2SG2gem_Config
}
import io.prophecy.pipelines.testonlysgmain.graph.sgwith2SG2gem_1.config.{
  Config => sgwith2SG2gem_1_Config
}
import io.prophecy.pipelines.testonlysgmain.graph.sgwith2SG2gem_2.config.{
  Config => sgwith2SG2gem_2_Config
}
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_4.config.{
  Config => Subgraph_4_Config
}
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_5.config.{
  Config => Subgraph_5_Config
}
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_6.config.{
  Config => Subgraph_6_Config
}
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_7.config.{
  Config => Subgraph_7_Config
}
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_8.config.{
  Config => Subgraph_8_Config
}
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_9.config.{
  Config => Subgraph_9_Config
}
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_10.config.{
  Config => Subgraph_10_Config
}
import io.prophecy.pipelines.testonlysgmain.graph.Subgraph_11.config.{
  Config => Subgraph_11_Config
}
import io.prophecy.pipelines.testonlysgmain.graph.sgwith2SG2gem_3.config.{
  Config => sgwith2SG2gem_3_Config
}
import io.prophecy.pipelines.testonlysgmain.graph.sgwith2SG2gem_4.config.{
  Config => sgwith2SG2gem_4_Config
}
import io.prophecy.pipelines.testonlysgmain.graph.sgwith2SG2gem_5.config.{
  Config => sgwith2SG2gem_5_Config
}
import io.prophecy.pipelines.testonlysgmain.graph.sgwith2SG2gem_6.config.{
  Config => sgwith2SG2gem_6_Config
}

case class Config(
  var Subgraph_1:      Subgraph_1_Config = Subgraph_1_Config(),
  var sgwith2SG2gem:   sgwith2SG2gem_Config = sgwith2SG2gem_Config(),
  var Subgraph_2:      Subgraph_2_Config = Subgraph_2_Config(),
  var Subgraph_3:      Subgraph_3_Config = Subgraph_3_Config(),
  var Subgraph_4:      Subgraph_4_Config = Subgraph_4_Config(),
  var Subgraph_5:      Subgraph_5_Config = Subgraph_5_Config(),
  var sgwith2SG2gem_1: sgwith2SG2gem_1_Config = sgwith2SG2gem_1_Config(),
  var sgwith2SG2gem_2: sgwith2SG2gem_2_Config = sgwith2SG2gem_2_Config(),
  var sgwith2SG2gem_3: sgwith2SG2gem_3_Config = sgwith2SG2gem_3_Config(),
  var sgwith2SG2gem_4: sgwith2SG2gem_4_Config = sgwith2SG2gem_4_Config(),
  var sgwith2SG2gem_5: sgwith2SG2gem_5_Config = sgwith2SG2gem_5_Config(),
  var sgwith2SG2gem_6: sgwith2SG2gem_6_Config = sgwith2SG2gem_6_Config(),
  var sgwith2SG2gem_7: sgwith2SG2gem_7_Config = sgwith2SG2gem_7_Config(),
  var sgwith2SG2gem_8: sgwith2SG2gem_8_Config = sgwith2SG2gem_8_Config(),
  var Subgraph_6:      Subgraph_6_Config = Subgraph_6_Config(),
  var Subgraph_7:      Subgraph_7_Config = Subgraph_7_Config(),
  var Subgraph_8:      Subgraph_8_Config = Subgraph_8_Config(),
  var Subgraph_9:      Subgraph_9_Config = Subgraph_9_Config(),
  var Subgraph_10:     Subgraph_10_Config = Subgraph_10_Config(),
  var Subgraph_11:     Subgraph_11_Config = Subgraph_11_Config()
) extends ConfigBase
