package homework34;

public enum Planets {
  MERCURY(1, "Меркурий", 2440, 3.302e+23),
  VENUS(2, "Венера", 6052, 4.869e+24),
  EARTH(3, "Земля", 6378, 5.974e+24),
  MARS(4, "Марс", 3397, 6.419e+23),
  JUPITER(5, "Юпитер", 71490, 1.899e+27),
  SATURN(6, "Сатурн", 60270, 5.685e+26),
  URANUS(7, "Уран", 25560, 8.685e+25),
  NEPTUNE(8, "Нептун", 24760, 1.024e+26);

  private final int number;
  private final String name;
  private final int radius;
  private final double weight;
  private static final double GRAVITATIONAL_CONSTANT = 6.6743e-11;


  private Planets(int number, String name, int radius, double weight) {
    this.number = number;
    this.name = name;
    this.radius = radius;
    this.weight = weight;
  }

  public int getNumber() {
    return number;
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

  public static Planets getByNumber(int number) {
    Planets[] planet = {MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE};
    for (int i = 0; i < planet.length; i++) {
      if (planet[i].getNumber() == number) {
        return planet[i];
      }
    }
    return null;
  }

  public double printAccelerationOfGravity() {
    return ((GRAVITATIONAL_CONSTANT * this.weight) / (this.radius * this.radius)) * 10e-7;
  }
}
