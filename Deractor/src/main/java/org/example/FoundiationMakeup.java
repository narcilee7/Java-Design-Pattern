package org.example;

public class FoundiationMakeup extends Decorator {
  public FoundiationMakeup(Shownable shownable) {
    super(shownable);
  }

  @Override
  public void show() {
    System.out.println("Foundation Makeup");
    shownable.show();
    System.out.println("Foundation Makeup End");
  }
}
