package org.example;

public class EnemyPlane {
  private int x;

  private int y;

  public EnemyPlane(int x) {
    this.x = x;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void move() {
    y += 1;
  }
}
