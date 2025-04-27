package org.example;

public class Adapter implements TriplePin {
  private DualPin dualPin;

  public Adapter(DualPin dualPin) {
    this.dualPin = dualPin;
  }
  // 适配器负责实现目标接口
  @Override
  public void electrify(int l, int n, int e) {
    dualPin.electrify(l, n);
  }
}
