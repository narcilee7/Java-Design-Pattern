package org.example;

public class LowerUnit extends Unit {
  public LowerUnit(int x, int y)
  {
    super(5, 2, 32, x, y);
  }
  public void show()
  {
    System.out.println("LowerUnit");
  }
  public void attack()
  {
    System.out.println("LowerUnit attack");
  }
}
