package io.github.amithkoujalgi.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ModelListItem {
  private String name;
  private String model;
  private String modifiedAt;
  private String digest;
  private String size;
}
