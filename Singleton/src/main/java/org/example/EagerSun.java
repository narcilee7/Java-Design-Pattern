package org.example;

/**
 * eager initialization(饿汉式)
 */
public class EagerSun {
  /*
  * * private 保证了类示例的私有性、不可见性、不可访问性
  * * static 保证了类的静态性，类加载的时候就进行了初始化，也就是说与类同时期且早于内存堆中的对象进行实例化
  * * final 保证了常量性，不可被修改
  * * new 关键字初始化类的静态实例，并赋予常量值，这就是eager initialization(饿汉式)：即在初始阶段就主动进行实例化，并保持一种eager的状态，无论是否引用，都会在初始阶段就进行实例化
  */
  private static final EagerSun sun = new EagerSun();

  private EagerSun() {
    // 构造方法私有化
  }

  public static EagerSun getInstance() {
    return sun;
  }
}
