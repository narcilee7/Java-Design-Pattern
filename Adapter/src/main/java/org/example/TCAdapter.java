package org.example;

// 类适配器
public class TCAdapter extends TV implements TriplePin {
  @Override
  public void electrify(int l, int n, int e) {
    super.electrify(l, n);
  }
}
