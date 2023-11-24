package homework31;

import java.util.Scanner;


public class Main01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите любое число типа int: ");
    int a = scanner.nextInt();

    System.out.print("Введите любое число типа double: ");
    double b = scanner.nextDouble();

    System.out.print("Введите любое число типа short: ");
    short c = scanner.nextShort();

    System.out.print("Введите любое число типа float: ");
    float d = scanner.nextFloat();

    double result = (a * (b - d) + c * a / d);
    System.out.println(
        a + " * (" + b + " - " + d + ") + " + c + " * " + a + " / " + d + " = " + result);
  }
}
