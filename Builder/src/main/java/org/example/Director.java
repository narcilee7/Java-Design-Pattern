package org.example;

public class Director {
  private Builder builder;;

  public Director(Builder builder) {
    this.builder = builder;
  }

  public void setBuilder(Builder builder) {
    this.builder = builder;
  }

  public Building direct() {
    System.out.println("project starting");

    builder.buildBasement();

    builder.buildWall();

    builder.buildRoof();

    System.out.println("project finished");

    return builder.getBuilding();
  }
}
