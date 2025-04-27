package org.example;

public class Client {
  public static void main(String[] args) {
//    TriplePin tv = new TV(); // 接口不兼容
    DualPin dualPin = new TV();
    TriplePin tv = new Adapter(dualPin);
    tv.electrify(1, 2, 3);
  }
}
