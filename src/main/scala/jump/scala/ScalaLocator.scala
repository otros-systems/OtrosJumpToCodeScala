package jump.scala

import java.util
import java.util.Collections

import pl.otros.intellij.jumptocode.logic.locator.{LocationInfo, Locator}
import pl.otros.intellij.jumptocode.model.JumpLocation

class ScalaLocator extends Locator {
  override def getContent(locationInfo: LocationInfo): util.List[String] = {
    println("\n\nAsking scala plugin for content")
    Collections.emptyList()
  }

  override def findLocation(locationInfo: LocationInfo): util.List[_ <: JumpLocation] = {
    println("\n\nAsking scala plugin for locations")
    Collections.emptyList()
  }

  override def name(): String = "Scala Locator"
}