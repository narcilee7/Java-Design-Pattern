package org.example;

import java.util.ArrayList;
import java.util.List;

public class Building {
  private List<String> buildingComponents = new ArrayList<>();

  public void setBasement(String basement) {
    buildingComponents.add(basement);
  }

  public void setWall(String wall) {
    buildingComponents.add(wall);
  }

  public void setRoof(String roof) {
    buildingComponents.add(roof);
  }

  @Override
  public String toString() {
    return "Building{" +
        "buildingComponents=" + buildingComponents +
        '}';
  }
}
