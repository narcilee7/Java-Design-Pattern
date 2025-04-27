package org.example;

public class File extends Node {
  public File(String name) {
    super(name);
  }

  @Override
  protected void add(Node node) {
    System.out.println("can't add child node");
  }

  @Override
  protected void tree(int space) {
    super.tree(space);
  }
}
