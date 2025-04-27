package org.example;

/**
 * 懒汉式单例
 */
public class LazySun {
  private static LazySun instance;

  private LazySun() {
    // 构造方法私有化
  }

  // 获取实例，一种避免多线程问题的方法，但是会出现性能问题，因为每次调用getInstance()都会进行同步，会影响性能
//  public static synchronized LazySun getInstance() {
//    if (instance == null) {
//      // 如果多线程的话，这里不是并发安全的的，所以需要加锁
//      instance = new LazySun();
//    }
//    return instance;
//  }

  public static LazySun getInstance() {
    if (instance == null) {
      synchronized (LazySun.class) {
        instance = new LazySun();
      }
    }
    return instance;
  }
}
