package org.example;

import java.util.Random;

public class AirplaneFactory implements Factory {
  @Override
  public Enemy create(int screenWidth) {
    Random random = new Random();
    int x = random.nextInt(screenWidth);
    return new AirPlane(x, 0);
  }
}
