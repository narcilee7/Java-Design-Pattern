package org.example;

public class Client {
  public void eat() {
    System.out.println("eating...");
  }

  public void wash() {
    System.out.println("washing...");
  }

  public static void main(String[] args) {
    VerVendor vendor = new VerVendor();
    vendor.purchase();
    Helper helper = new Helper();
    helper.cook();
    Client client = new Client();
    client.eat();
    client.wash();
  }
}
