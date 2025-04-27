package org.example;

public class Grass implements Drawable {
  private String img;

  public Grass() {
    this.img = "grass";
    System.out.println("load grass img, name: " + img);
  }

  @Override
  public void draw(int x, int y) {
    System.out.println("draw " + img + " at " + x + ", " + y);
  }
}
