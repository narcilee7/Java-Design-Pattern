package org.example;

public abstract class Pen {
  public abstract void getColor();

  protected Ruler ruler;

  public Pen(Ruler ruler) {
    this.ruler = ruler;
  }

  public void draw() {
    getColor();
    System.out.println("画笔开始画图");
  }
}
