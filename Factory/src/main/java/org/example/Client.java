package org.example;

import java.util.Random;

public class Client {
//  public static void main(String[] args) {
//    int screenWidth = 100;
//    System.out.println("game starts");
//    Random random = new Random();
//    int x = random.nextInt(screenWidth);
//    Enemy airplane = new AirPlane(x, 0);
//    airplane.show();
//
//    x = random.nextInt(screenWidth);
//    Enemy tank = new Tank(x, 0);
//    tank.show();
//  }

  public static void main(String[] args) {
    System.out.println("game starts");
    SimpleFactory simpleFactory = new SimpleFactory(100);
    simpleFactory.createEnemy("airplane").show();
    simpleFactory.createEnemy("tank").show();
  }
}
