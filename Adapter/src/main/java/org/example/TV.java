package org.example;

public class TV implements DualPin {
  @Override
  public void electrify(int l, int r) {
    System.out.println("TV is electrified");
  }
}
