package jump.java;

import pl.otros.intellij.jumptocode.logic.locator.LocationInfo;
import pl.otros.intellij.jumptocode.logic.locator.Locator;
import pl.otros.intellij.jumptocode.model.JumpLocation;

import java.util.Collections;
import java.util.List;

public class SomeLocator implements Locator {
  @Override
  public List<? extends JumpLocation> findLocation(LocationInfo locationInfo) {
    System.err.println("\n\nSomeLocator.findLocation");
    return Collections.emptyList();
  }

  @Override
  public List<String> getContent(LocationInfo locationInfo) {
    System.err.println("\n\nSomeLocator.getContent");
    return Collections.emptyList();
  }

  @Override
  public String name() {
    return "SomeJavaLocator";
  }
}
