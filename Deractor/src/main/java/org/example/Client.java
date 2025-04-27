package org.example;

public class Client {
  public static void main(String[] args) {
    Shownable madeupGirl = new Lipstick(new FoundiationMakeup(new Girl()));
    madeupGirl.show();
  }
}
