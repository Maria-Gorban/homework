package homework39.task02;

public class Employee extends Object {

  protected String name;
  protected double salary;
  protected final String position;

  public Employee(String name, double salary, String position) {
    this.name = name;
    this.salary = salary;
    this.position = position;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public String getPosition() {
    return position;
  }

  @Override
  public String toString() {
    return "имя: " + this.name + "\nзарплата: " + this.salary + "€\nдолжность: " + this.position;
  }
}
