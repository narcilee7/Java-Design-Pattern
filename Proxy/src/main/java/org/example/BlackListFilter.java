package org.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

public class BlackListFilter implements InvocationHandler {
  private List<String> blackList = Arrays.AsList("a", "b", "c");

  private Object origin;

  public BlackListFilter(Object origin) {
    this.origin = origin;
    System.out.println("Beginning to blacklist filter");
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    String arg = (String) args[0];
    for (String kwd : blackList) {
      if (arg.contains(kwd)) {
        System.out.println("Blocked: " + arg);
        return null;
      }
    }
    System.out.println("accessed");
    return method.invoke(origin, args);
  }
}
