package org.example;

public class Tile {
  private String image;
  private int x;
  private int y;

  public Tile(String img, int x, int y) {
    this.image = img;

    System.out.println("加载图片：" + img);
    this.x = y;
    this.y = y;
  }

  public void draw() {
    System.out.println("绘制图片：" + image + "，位置：" + x + "," + y);
  }
}
