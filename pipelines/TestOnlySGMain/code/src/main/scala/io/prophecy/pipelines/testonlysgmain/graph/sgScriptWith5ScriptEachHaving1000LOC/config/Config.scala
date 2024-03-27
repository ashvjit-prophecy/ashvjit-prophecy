package io.prophecy.pipelines.testonlysgmain.graph.sgScriptWith5ScriptEachHaving1000LOC.config

import io.prophecy.libs._
import pureconfig._
import pureconfig.generic.ProductHint
import org.apache.spark.sql.SparkSession

object Config {

  implicit val confHint: ProductHint[Config] =
    ProductHint[Config](ConfigFieldMapping(CamelCase, CamelCase))

}

case class Config(
  var Subgraph_1:       SUBGRAPH_1 = SUBGRAPH_1(),
  var sgwith2SG2gem:    Sgwith2SG2gem = Sgwith2SG2gem(),
  var Subgraph_2:       SUBGRAPH_2 = SUBGRAPH_2(),
  var Subgraph_3:       SUBGRAPH_3 = SUBGRAPH_3(),
  var Subgraph_4:       SUBGRAPH_4 = SUBGRAPH_4(),
  var Subgraph_5:       SUBGRAPH_5 = SUBGRAPH_5(),
  var sgwith2SG2gem_1:  Sgwith2SG2gem_1 = Sgwith2SG2gem_1(),
  var sgwith2SG2gem_2:  Sgwith2SG2gem_2 = Sgwith2SG2gem_2(),
  var sgwith2SG2gem_3:  Sgwith2SG2gem_3 = Sgwith2SG2gem_3(),
  var sgwith2SG2gem_4:  Sgwith2SG2gem_4 = Sgwith2SG2gem_4(),
  var sgwith2SG2gem_5:  Sgwith2SG2gem_5 = Sgwith2SG2gem_5(),
  var sgwith2SG2gem_6:  Sgwith2SG2gem_6 = Sgwith2SG2gem_6(),
  var sgwith2SG2gem_7:  Sgwith2SG2gem_7 = Sgwith2SG2gem_7(),
  var sgwith2SG2gem_8:  Sgwith2SG2gem_8 = Sgwith2SG2gem_8(),
  var Subgraph_6:       SUBGRAPH_6 = SUBGRAPH_6(),
  var Subgraph_7:       SUBGRAPH_7 = SUBGRAPH_7(),
  var Subgraph_8:       SUBGRAPH_8 = SUBGRAPH_8(),
  var Subgraph_9:       SUBGRAPH_9 = SUBGRAPH_9(),
  var Subgraph_10:      SUBGRAPH_10 = SUBGRAPH_10(),
  var Subgraph_11:      SUBGRAPH_11 = SUBGRAPH_11(),
  var sgwith2SG2gem_9:  Sgwith2SG2gem_9 = Sgwith2SG2gem_9(),
  var sgwith2SG2gem_10: Sgwith2SG2gem_10 = Sgwith2SG2gem_10(),
  var sgwith2SG2gem_11: Sgwith2SG2gem_11 = Sgwith2SG2gem_11(),
  var sgwith2SG2gem_12: Sgwith2SG2gem_12 = Sgwith2SG2gem_12(),
  var sgwith2SG2gem_13: Sgwith2SG2gem_13 = Sgwith2SG2gem_13(),
  var sgwith2SG2gem_14: Sgwith2SG2gem_14 = Sgwith2SG2gem_14(),
  var sgwith2SG2gem_15: Sgwith2SG2gem_15 = Sgwith2SG2gem_15(),
  var sgwith2SG2gem_16: Sgwith2SG2gem_16 = Sgwith2SG2gem_16(),
  var sgwith2SG2gem_17: Sgwith2SG2gem_17 = Sgwith2SG2gem_17(),
  var sgwith2SG2gem_18: Sgwith2SG2gem_18 = Sgwith2SG2gem_18(),
  var Subgraph_12:      SUBGRAPH_12 = SUBGRAPH_12(),
  var sg10InsideSG:     Sg10InsideSG = Sg10InsideSG(),
  var sg10InsideSG_1:   Sg10InsideSG_1 = Sg10InsideSG_1(),
  var sgScriptWith5ScriptEachHaving1000LOC: SgScriptWith5ScriptEachHaving1000LOC =
    SgScriptWith5ScriptEachHaving1000LOC(),
  var sg10InsideSG_2: Sg10InsideSG_2 = Sg10InsideSG_2(),
  var sg10InsideSG_3: Sg10InsideSG_3 = Sg10InsideSG_3(),
  var sg10InsideSG_4: Sg10InsideSG_4 = Sg10InsideSG_4(),
  var sg10InsideSG_5: Sg10InsideSG_5 = Sg10InsideSG_5(),
  var sgScriptWith5ScriptEachHaving1000LOC_1: SgScriptWith5ScriptEachHaving1000LOC_1 =
    SgScriptWith5ScriptEachHaving1000LOC_1()
) extends ConfigBase

case class Context(spark: SparkSession, config: Config)
