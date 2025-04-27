package org.example;

public class EnemyPlaneFactory {
  private static EnemyPlaneImplCloneable protoType = new EnemyPlaneImplCloneable();

  public static EnemyPlaneImplCloneable getInstance(int x) {
    EnemyPlaneImplCloneable epc = protoType.clone();
    epc.setX(x);
    return epc;
  }

}
