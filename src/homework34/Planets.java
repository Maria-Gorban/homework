package homework34;

public enum Planets {
  MERCURY("Меркурий", 2440, 3.302e+23),
  VENUS("Венера", 6052, 4.869e+24),
  EARTH("Земля", 6378, 5.974e+24),
  MARS("Марс", 3397, 6.419e+23),
  JUPITER("Юпитер", 71490, 1.899e+27),
  SATURN("Сатурн", 60270, 5.685e+26),
  URANUS("Уран", 25560, 8.685e+25),
  NEPTUNE("Нептун", 24760, 1.024e+26);


  private final String name;
  private final int radius;
  private final double weight;
  private static final double GRAVITATIONAL_CONSTANT = 6.6743e-11;


  Planets(String name, int radius, double weight) {
    this.name = name;
    this.radius = radius;
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public int getRadius() {
    return radius;
  }

  public double getWeight() {
    return weight;
  }

  public double printAccelerationOfGravity() {
    return ((GRAVITATIONAL_CONSTANT * this.weight) / (this.radius * this.radius)) * 10e-7;
  }
}
