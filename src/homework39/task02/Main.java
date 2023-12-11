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

  public static void main(String[] args) {
    Employee[] employees = new Employee[10];
    String[] names = {"Света", "Руслан", "Маргарита", "Виталий", "Михаил", "Виктория", "Вера",
        "Виктор", "Максим", "Лера"};
    double[] salaries = {62123.78, 13527.89, 16062.44, 21078.99, 46773.22, 55894, 30086, 29817,
        13534.12, 36336};
    for (int i = 0; i < employees.length; i++) {
      if (i < 9) {
        employees[i] = new Developer(names[i], salaries[i]);

      } else {
        employees[i] = new Manager(names[i], salaries[i]);
      }
    }
    startWork(employees);
  }
}


