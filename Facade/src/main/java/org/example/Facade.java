package org.example;

public class Facade {
  private VerVendor vendor;
  private Chef chef;
  private Waiter waiter;
  private Cleaner cleaner;

  public Facade() {
    this.vendor = new VerVendor();
    this.chef = new Chef();
    this.waiter = new Waiter();
    this.cleaner = new Cleaner();
  }

  public void order() {
    waiter.serve();
    chef.cook();
    waiter.serve();
    cleaner.clean();
    cleaner.wash();
  }
}
