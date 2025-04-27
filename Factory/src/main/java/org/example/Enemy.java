package org.example;

public abstract class Enemy {
  protected int x;

  protected int y;

  public Enemy(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void show() {
    System.out.println("show");
  }
}
