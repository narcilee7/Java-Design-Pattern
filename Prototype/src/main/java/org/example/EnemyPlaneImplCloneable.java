package org.example;

public class EnemyPlaneImplCloneable implements Cloneable {
  private int x;

  private int y = 0;

  public EnemyPlaneImplCloneable(int x) {
    this.x = x;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public void setX(int x) {
    this.x = x;
  }

  @Override
  public EnemyPlaneImplCloneable clone() {
    /**
     * 实现Cloneable省去了由类而生的构造过程，外部就可以对本例的实例进行克隆操作了，省去了由类而生的再造过程
     * 注意：Object.clone()属于浅拷贝
     */
    try {
      return (EnemyPlaneImplCloneable) super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return null;
  }
}
