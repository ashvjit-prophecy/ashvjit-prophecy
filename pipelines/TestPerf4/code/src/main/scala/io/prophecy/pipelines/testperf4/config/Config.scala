package io.prophecy.pipelines.testperf4.config

import pureconfig._
import pureconfig.generic.ProductHint
import io.prophecy.libs._
import io.prophecy.pipelines.testperf4.graph.T21Gems1000LOC.config.{
  Config => T21Gems1000LOC_Config
}
import io.prophecy.pipelines.testperf4.graph.sg100gems.config.{
  Config => sg100gems_Config
}
import io.prophecy.pipelines.testperf4.graph.sgScriptWith5ScriptEachHaving1000LOC.config.{
  Config => sgScriptWith5ScriptEachHaving1000LOC_Config
}
import io.prophecy.pipelines.testperf4.graph.sgScriptWith5ScriptEachHaving1000LOC_1.config.{
  Config => sgScriptWith5ScriptEachHaving1000LOC_1_Config
}

case class Config(
  var T21Gems1000LOC: T21Gems1000LOC_Config = T21Gems1000LOC_Config(),
  var sgScriptWith5ScriptEachHaving1000LOC: sgScriptWith5ScriptEachHaving1000LOC_Config =
    sgScriptWith5ScriptEachHaving1000LOC_Config(),
  var sgScriptWith5ScriptEachHaving1000LOC_1: sgScriptWith5ScriptEachHaving1000LOC_1_Config =
    sgScriptWith5ScriptEachHaving1000LOC_1_Config(),
  var sg100gems: sg100gems_Config = sg100gems_Config()
) extends ConfigBase
