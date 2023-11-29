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
      case 1:
        System.out.println(Planets.MERCURY.getName()
            + ", планета земного типа, самая близкая к Солнцу, необитаема");
        printInfo(Planets.getByNumber(1));
        break;
      case 2:
        System.out.println(Planets.VENUS.getName() + ", планета земного типа, необитаема");
        printInfo(Planets.getByNumber(2));
        break;
      case 3:
        System.out.println(Planets.EARTH.getName() + ", планета земного типа, обитаема");
        printInfo(Planets.getByNumber(3));
        break;
      case 4:
        System.out.println(Planets.MARS.getName() + ", планета земного типа, необитаема");
        printInfo(Planets.getByNumber(4));
        break;
      case 5:
        System.out.println(Planets.JUPITER.getName() + ", газовый гигант, необитаема");
        printInfo(Planets.getByNumber(5));
        break;
      case 6:
        System.out.println(Planets.SATURN.getName() + ", газовый гигант, необитаема");
        printInfo(Planets.getByNumber(6));
        break;
      case 7:
        System.out.println(Planets.URANUS.getName() + ", ледяной гигант, необитаема");
        printInfo(Planets.getByNumber(7));
        break;
      case 8:
        System.out.println(Planets.NEPTUNE.getName()
            + ", самая дальняя планета от Солнца, ледяной гигант, необитаема");
        printInfo(Planets.getByNumber(8));
        break;
      default:
        System.out.println("некорректный ввод");
        break;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Выберите планету: ");
    System.out.println(
        "1-меркурий \n2-венера \n3-земля \n4-марс \n5-юпитер \n6-сатурн \n7-уран \n8-нептун");
    int n;
    do {
      n = scanner.nextInt();
      printTyp(n);
    } while (n <= 0 || n > 8);
  }
}
