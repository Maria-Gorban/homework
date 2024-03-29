package homework44.task01;

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
    return "Участок 'Polygon' { " +
        "amount of sides=" + sidesAmount +
        ", length=" + length +
        '}';
  }
}
