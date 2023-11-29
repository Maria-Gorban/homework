package homework34;

import java.util.Scanner;

public class Main {

  public static void printTyp(int n) {
    switch (n) {
      case 1:
        System.out.println(Planets.MERCURY.getName()
            + ", планета земного типа самая близкая к Солнцу, необитаема");
        System.out.println("Радиус: " + Planets.MERCURY.getRadius() + " км");
        System.out.println("Масса: " + Planets.MERCURY.getWeight() + " кг");
        System.out.println("Ускорение свободного падения: " + Planets.MERCURY.printAccelerationOfGravity() + " м/сек^2");
        break;
      case 2:
        System.out.println(Planets.VENUS.getName() + ", планета земного типа, необитаема");
        System.out.println("Радиус: " + Planets.VENUS.getRadius() + " км");
        System.out.println("Масса: " + Planets.VENUS.getWeight() + " кг");
        System.out.println("Ускорение свободного падения: " + Planets.VENUS.printAccelerationOfGravity() + " м/сек^2");
        break;
      case 3:
        System.out.println(Planets.EARTH.getName() + ", планета земного типа, обитаема");
        System.out.println("Радиус: " + Planets.EARTH.getRadius() + " км");
        System.out.println("Масса: " + Planets.EARTH.getWeight() + " кг");
        System.out.println("Ускорение свободного падения: " + Planets.EARTH.printAccelerationOfGravity() + " м/сек^2");
        break;
      case 4:
        System.out.println(Planets.MARS.getName() + ", планета земного типа, необитаема");
        System.out.println("Радиус: " + Planets.MARS.getRadius() + " км");
        System.out.println("Масса: " + Planets.MARS.getWeight() + " кг");
        System.out.println("Ускорение свободного падения: " + Planets.MARS.printAccelerationOfGravity() + " м/сек^2");
        break;
      case 5:
        System.out.println(Planets.JUPITER.getName() + ", газовый гигант, необитаема");
        System.out.println("Радиус: " + Planets.JUPITER.getRadius() + " км");
        System.out.println("Масса: " + Planets.JUPITER.getWeight() + " кг");
        System.out.println("Ускорение свободного падения: " + Planets.JUPITER.printAccelerationOfGravity() + " м/сек^2");
        break;
      case 6:
        System.out.println(Planets.SATURN.getName() + ", газовый гигант, необитаема");
        System.out.println("Радиус: " + Planets.SATURN.getRadius() + " км");
        System.out.println("Масса: " + Planets.SATURN.getWeight() + " кг");
        System.out.println("Ускорение свободного падения: " + Planets.SATURN.printAccelerationOfGravity() + " м/сек^2");
        break;
      case 7:
        System.out.println(Planets.URANUS.getName() + ", ледяной гигант, необитаема");
        System.out.println("Радиус: " + Planets.URANUS.getRadius() + " км");
        System.out.println("Масса: " + Planets.URANUS.getWeight() + " кг");
        System.out.println("Ускорение свободного падения: " + Planets.URANUS.printAccelerationOfGravity() + " м/сек^2");
        break;
      case 8:
        System.out.println(Planets.NEPTUNE.getName()
            + ", самая дальняя планета от Солнца, ледяной гигант, необитаема");
        System.out.println("Радиус: " + Planets.NEPTUNE.getRadius() + " км");
        System.out.println("Масса: " + Planets.NEPTUNE.getWeight() + " кг");
        System.out.println("Ускорение свободного падения: " + Planets.NEPTUNE.printAccelerationOfGravity() + " м/сек^2");
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
    } while (n <= 0);
  }
}
