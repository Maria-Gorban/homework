package homework44.task02;

public class Circle extends Shape {

  protected double radius;

  public Circle(double radius) {
    super("Circle");
    this.radius = radius;
  }

  @Override
  public double getPerimeter() {
    return Math.PI * 2 * radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public String toString() {
    return "Участок 'Circle'{" +
        "размер =" + radius +
        '}';
  }

  @Override
  public void resize(double coefficient) {
    setRadius(radius * coefficient);
  }
}
