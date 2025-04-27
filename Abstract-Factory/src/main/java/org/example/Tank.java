package org.example;

public class Tank extends HighUnit {
  public Tank(int x, int y)
  {
    super(x, y);
  }

  public void show()
  {
    System.out.println("Tank show");
  }

  public void attack()
  {
    System.out.println("Tank attack");
  }
}
