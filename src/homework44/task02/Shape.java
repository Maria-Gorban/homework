package homework44.task02;

import homework44.task01.Rectangle;

public abstract class Shape implements Resizable {

  protected String name;

  public Shape(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public abstract double getPerimeter();



}
