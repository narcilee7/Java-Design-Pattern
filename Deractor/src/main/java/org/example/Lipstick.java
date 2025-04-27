package org.example;

public class Lipstick extends Decorator {
  public Lipstick(Shownable shownable) {
    super(shownable);
  }

  @Override
  public void show() {
    System.out.println("Lipstick");
    shownable.show();
    System.out.println("Lipstick End");
  }
}
