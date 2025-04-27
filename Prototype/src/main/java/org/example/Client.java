package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {
  public static void main(String[] args) {
    List<EnemyPlane> enemyPlanes = new ArrayList<EnemyPlane>();

    for (int i = 0; i < 500; i++) {
      // 性能消耗极高的实例化
      EnemyPlane ep = new EnemyPlane(new Random().nextInt(100));
      enemyPlanes.add(ep);
    }
  }
}
