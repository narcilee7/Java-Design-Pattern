package org.example;

import java.util.HashMap;
import java.util.Map;

public class TileFactory {
  private Map<String, Drawable> images;

  public TileFactory() {
    images = new HashMap<String, Drawable>();
  }

  public Drawable getDrawable(String img) {
    if (!images.containsKey(img)) {
      switch (img) {
        case "grass":
          images.put(img, new Grass());
          break;
        case "road":
          images.put(img, new Road());
          break;
        default:
          throw new IllegalArgumentException("Invalid image name: " + img);
      }
    }
    return images.get(img);
  }
}
