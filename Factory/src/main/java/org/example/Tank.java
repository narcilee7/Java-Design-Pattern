package org.example;

public class Tank extends Enemy {
  public Tank(int x, int y) {
    super(x, y);
  }

  @Override
  public void show() {
    System.out.println("TASK SHOW");
  }
}
