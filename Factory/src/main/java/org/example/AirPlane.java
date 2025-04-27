package org.example;

public class AirPlane extends Enemy {
  public AirPlane(int x, int y) {
    super(x, y);
  }
  @Override
  public void show() {
    System.out.println("AIRPLANE SHOW");
  }
}
