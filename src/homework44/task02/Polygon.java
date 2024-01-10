package homework44.task02;

public class Polygon extends Shape {

  protected int sidesAmount;
  protected double length; //длина одной стороны

  public Polygon(int sidesAmount, double length) {
    super("Polygon");
    this.sidesAmount = sidesAmount;
    this.length = length;
  }

  @Override
  public double getPerimeter() {
    return sidesAmount * length;
  }

  public int getSidesAmount() {
    return sidesAmount;
  }

  public void setSidesAmount(int sidesAmount) {
    this.sidesAmount = sidesAmount;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  @Override
  public String toString() {
    return "участок 'Polygon'{" +
        "количество сторон =" + sidesAmount +
        ", длина одной стороны =" + length +
        '}';
  }

  @Override
  public void resize(double coefficient) {
    setLength(length * coefficient);
  }
}
