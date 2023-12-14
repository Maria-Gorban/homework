package homework39.task02;

import java.util.Random;

public class Main {

  public static void startWork(Employee[] employees) {
    for (int i = 0; i < employees.length; i++) {
      if (employees[i] instanceof Manager) {
        Manager manager = (Manager) employees[i];
        manager.forceToWork();
      } else if (employees[i] instanceof Developer) {
        Developer developer = (Developer) employees[i];
        developer.workJob();
      }
    }
  }

  public static Employee levelUp(Employee employee) {
    if (employee instanceof Manager) {
      Manager manager = (Manager) employee;
      manager.setSalary(employee.getSalary() + 1000);
      return manager;

    }
    if (employee instanceof Developer) {

      return new Manager(employee.getName(), 600000);
    }
    return null;
  }

  public static void main(String[] args) {
    Employee[] employees = new Employee[10];
    employees[0] = new Manager("Света", 60000);
    String[] names = {"Руслан", "Маргарита", "Виталий", "Михаил", "Виктория", "Вера",
        "Виктор", "Максим", "Лера", "Василий"};
    Random random = new Random();
    for (int i = 1; i < employees.length; i++) {
      employees[i] = new Developer(names[i],
          (2000 + random.nextInt(10000 - 200 + 1)));
    }

    startWork(employees);

    System.out.println("\n" + employees[2].toString());
    System.out.println(employees[0].toString());
    System.out.println("\nВремя повышения");
    System.out.println(levelUp(employees[2]));
    System.out.println(levelUp(employees[0]));

  }
}


