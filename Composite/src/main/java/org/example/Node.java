package org.example;

public abstract class Node {
  protected String name;

  public Node(String name) {
    this.name = name;
  }

  protected abstract void add(Node node);

  protected void tree(int space) {
    for (int i = 0; i < space; i++) {
      System.out.print(" ");
    }

    System.out.println(name);
  }
}
