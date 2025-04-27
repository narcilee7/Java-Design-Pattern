package org.example;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Node {
  private List<Node> childrenNodes = new ArrayList<>();

  public Folder(String name) {
    super(name);
  }

  @Override
  protected void add(Node node) {
    childrenNodes.add(node);
  }

  @Override
  public void tree(int space) {
    super.tree(space);
    space++;
    for (Node node : childrenNodes) {
      node.tree(space);
    }
  }
}
