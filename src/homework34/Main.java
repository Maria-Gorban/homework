package homework34;

import java.util.Scanner;

public class Main {

  public static void printInfo(Planets planet) {
    System.out.println("Радиус: " + planet.getRadius() + " км");
    System.out.println("Масса: " + planet.getWeight() + " кг");
    System.out.println(
        "Ускорение свободного падения: " + planet.printAccelerationOfGravity() + " м/сек^2");
  }

  public static void printTyp(int n) {
    switch (n) {
      case 0:
      case 1:
      case 3:
        System.out.println(", планета земного типа, необитаема");
        break;
      case 2:
        System.out.println(", планета земного типа, обитаема");
        break;
      case 4:
      case 5:
        System.out.println(", газовый гигант, необитаема");
        break;
      case 6:
      case 7:
        System.out.println(", ледяной гигант, необитаема");
        break;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Выберите планету: ");
    Planets[] planets = Planets.values();
    for (int i = 0; i < planets.length; i++) {
      System.out.println((i + 1) + ". " + planets[i]);
    }
    int n = scanner.nextInt() - 1;
    while (n <= -1 || n >= 8) {
      System.out.println("некорректный ввод");
      n = scanner.nextInt() - 1;
    }
    System.out.print(planets[n].getName());
    printTyp(n);
    printInfo(planets[n]);

  }
}
