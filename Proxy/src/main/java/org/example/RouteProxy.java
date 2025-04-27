package org.example;

import java.util.Arrays;
import java.util.List;

public class RouteProxy implements Internet {
  private Internet modem;

  private List<String> blackList = Arrays.asList("google.com", "facebook.com");


  public RouteProxy() throws Exception {
    modem = new Modem("12312313123");
  }

  @Override
  public void httpAccess(String url) {
    for (String keyword : blackList) {
      if (url.contains(keyword)) {
        System.out.println("accessing " + url + " blocked");
        return;
      }
    }
    modem.httpAccess(url);
  }
}
