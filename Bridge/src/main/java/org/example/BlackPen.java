package org.example;

public class BlackPen extends Pen {
  @Override
  public void getColor() {
    System.out.println("黑色");
    ruler.regularize();
  }

  public BlackPen(Ruler ruler) {
    super(ruler);
  }
}
