package org.example;

public class HouseBuilder implements Builder {
  private Building house;

  public HouseBuilder() {
    house = new Building();
  }

  @Override
  public void buildBasement() {
    house.setBasement("Wooden Poles");
  }

  @Override
  public void buildWall() {
    house.setWall("Wooden Wall");
  }

  @Override
  public void buildRoof() {
    house.setRoof("Wooden Roof");
  }

  @Override
  public Building getBuilding() {
    return house;
  }
}
