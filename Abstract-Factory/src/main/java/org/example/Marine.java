package org.example;

public class Marine extends LowerUnit {
  public Marine(int x, int y) {
    super(x, y);
  }

  @Override
  public void show() {
    System.out.println("Marine");
  }

  @Override
  public void attack() {
    System.out.println("Marine attack");
  }
}
