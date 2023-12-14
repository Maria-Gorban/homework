package homework39.task02;

public class Manager extends Employee {

  public Manager(String name, double salary) {
    super(name, salary, "manager");
  }


  public void forceToWork() {
    System.out.println("А НУ БЫСТРО ВСЕМ РАБОТАТЬ!");
  }

  /*
  @Override
  public String toString() {
    return super.toString();
  }
  тоже самое, уже есть в Employee
   */
}
