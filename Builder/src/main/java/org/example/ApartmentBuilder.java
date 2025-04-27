package org.example;

public class ApartmentBuilder implements Builder {
  private Building apartment;

  public ApartmentBuilder() {
    apartment = new Building();
  }

  @Override
  public void buildBasement() {
    apartment.setBasement("Concrete Poles");
  }

  @Override
  public void buildWall() {
    apartment.setWall("Concrete Wall");
  }

  @Override
  public void buildRoof() {
    apartment.setRoof("Concrete Roof");
  }

  @Override
  public Building getBuilding() {
    return apartment;
  }
}
