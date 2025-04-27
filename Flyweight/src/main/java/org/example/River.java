package org.example;

public class River implements Drawable {
  private String img;

  public River() {
    this.img = "river";
    System.out.println("load river img, name: " + img);
  }

  @Override
  public void draw(int x, int y) {
    System.out.println("draw " + img + " at " + x + ", " + y);
  }
}
