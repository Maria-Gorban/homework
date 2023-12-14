package homework39.task02;

public class Developer extends Employee {

  public Developer(String name, double salary) {
    super(name, salary, "developer");
  }

  public void workJob() {
    System.out.println("Developer " + name + " усердно работает");
  }

  /*
  @Override
 public String toString() {
    return super.toString();
  }
  у нас в Employee уже есть этот метод, мы его просто наследуем
  */

}
