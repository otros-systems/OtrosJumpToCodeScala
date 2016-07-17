package jump.java;

import pl.otros.intellij.jumptocode.extension.LocatorProvider;
import pl.otros.intellij.jumptocode.logic.locator.Locator;

import java.lang.reflect.Method;

public class SomeJavaLocatorProvider implements LocatorProvider {

  public SomeJavaLocatorProvider() {
    System.err.println("\n\nCreating class " + this.getClass().getName());
    final Class<?>[] interfaces = this.getClass().getInterfaces();
    for (Class<?> c: interfaces){
      System.out.println("Interface: " + c.getName());
      final Method[] methods = c.getMethods();
      System.out.println("Methods: ");
      for (Method m:methods){
        System.out.println("- " + m.getName());
      }
    }
  }

  @Override
  public Locator locator() {
    System.err.println("\n\nSomeJavaLocatorProvider.locator");
    return new SomeLocator();
  }
}
