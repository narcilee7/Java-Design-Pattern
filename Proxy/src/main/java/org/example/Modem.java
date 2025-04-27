package org.example;

public class Modem implements Internet {
  public Modem(String pwd) throws Exception {
    if (pwd.length() < 8) {
      throw new Exception("Password must be at least 8 characters long");
    }
    System.out.println("connected successfully");
  }

  @Override
  public void httpAccess(String url) {
    System.out.println("accessing " + url);
  }
}
