package org.example;

import java.util.Random;

public class EnemyPlaneFactory {
  private static EnemyPlaneImplCloneable protoType = new EnemyPlaneImplCloneable(new Random().nextInt(200));

  public static EnemyPlaneImplCloneable getInstance(int x) {
    EnemyPlaneImplCloneable epc = protoType.clone();
    epc.setX(x);
    return epc;
  }
}
