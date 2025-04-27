package org.example;

public class Road implements Drawable {
  private String img;

  public Road() {
    this.img = "Road";
    System.out.println("load Road img, name: " + img);
  }

  @Override
  public void draw(int x, int y) {
    System.out.println("draw " + img + " at (" + x + ", " + y + ")");
  }
}
