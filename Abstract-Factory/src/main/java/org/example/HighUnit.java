package org.example;

public class HighUnit extends Unit {
  public HighUnit(int x, int y)
  {
    super(10, 10, 10, x, y);
  }

  public void show() {
    System.out.println("HighUnit");
  }

  public void attack() {
    System.out.println("HighUnit attack");
  }
}
