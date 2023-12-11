package homework39.task02;

public class Developer extends Employee {

  public Developer(String name, double salary) {
    super(name, salary, "developer");
  }

  public void workJob() {
    System.out.println("*звуки усердной работы*");
  }

  @Override
  public String toString() {
    return super.toString();
  }


}
