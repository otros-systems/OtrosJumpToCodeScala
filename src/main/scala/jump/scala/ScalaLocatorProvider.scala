package jump.scala

import pl.otros.intellij.jumptocode.extension.LocatorProvider
import pl.otros.intellij.jumptocode.logic.locator.Locator

class ScalaLocatorProvider extends LocatorProvider {
   def locator(): Locator = {
    println("Asking scala for locator")
    new ScalaLocator
  }


}

