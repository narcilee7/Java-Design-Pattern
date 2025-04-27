package org.example;

import java.util.Random;

public class SimpleFactory {
  private int screenWidth;

  private Random random;

  public SimpleFactory(int screenWidth) {
    this.screenWidth = screenWidth;
    this.random = new Random();
  }

  public Enemy createEnemy(String type) {
    int x = random.nextInt(screenWidth);
    Enemy enemy = null;
    switch (type) {
      case "airplane":
        enemy = new AirPlane(x, 0);
        break;
      case "tank":
        enemy = new Tank(x, 0);
        break;
      default:
        break;
    }
    return enemy;
  }
}
