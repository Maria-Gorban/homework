package homework39.task02;

public class Main {

  public static void startWork(Employee[] employees) {
    for (int i = 0; i < employees.length; i++) {
      if (employees[i] instanceof Manager) {
        ((Manager) employees[i]).forceToWork();
      } else if (employees[i] instanceof Developer) {
        ((Developer) employees[i]).workJob();
      }
    }
  }

  public static Employee levelUp(Employee employee) {
    if (employee instanceof Manager) {
      employee.setSalary(employee.getSalary() + 1000);

    } else if (employee instanceof Developer) {
      employee = new Manager(employee.getName(), 100336);
    }
    return employee;
  }

  public static void main(String[] args) {
    Employee[] employees = new Employee[10];
    String[] names = {"Света", "Руслан", "Маргарита", "Виталий", "Михаил", "Виктория", "Вера",
        "Виктор", "Максим", "Лера"};
    double[] salaries = {60123.78, 60527.89, 60062.44, 60078.99, 60773.22, 60894, 60086, 60817,
        60534.12, 100336}; //зарплата в год
    for (int i = 0; i < employees.length; i++) {
      if (i < 9) {
        employees[i] = new Developer(names[i], salaries[i]);
      } else {
        employees[i] = new Manager(names[i], salaries[i]);
      }
    }

    startWork(employees);

    System.out.println("\n" + employees[2].toString());
    System.out.println(employees[9].toString());
    System.out.println("\nВремя повышения");
    System.out.println(levelUp(employees[2]));
    System.out.println(levelUp(employees[9]));

  }
}


