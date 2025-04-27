package org.example;

public class WhitePen extends Pen {
  @Override
  public void getColor() {
    System.out.println("white");
    ruler.regularize();
  }

  public WhitePen(Ruler ruler) {
    super(ruler);
  }
}
