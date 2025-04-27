package org.example;

public class Decorator implements Shownable {
  // 被装饰的对象
  Shownable shownable;
  // 构造时注入被装饰者
  public Decorator(Shownable shownable) {
    this.shownable = shownable;
  }

  @Override
  public void show() {
    // 直接调用，不加任何装饰
    shownable.show();
  }
}
