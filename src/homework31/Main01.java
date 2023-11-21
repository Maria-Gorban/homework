package homework31;

import java.util.Scanner;



public class Main01 {


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int i = 0;
    int a = 0;
    double b = 0;
    short c = 0;
    byte d = 0;

    while (i < 4) {
      System.out.print("Введите какое то число: ");
      i += 1;
      switch (i) {
        case 1:
          a = scanner.nextInt();
          break;
        case 2:
          b = scanner.nextDouble();
          break;
        case 3:
          c = scanner.nextShort();
          break;
        case 4:
          d = scanner.nextByte();
          break;
      }

    }
    float result = (float) (a * (b - d) + c * a / d);
    System.out.println(a + " * (" + b + " - " + d + ") + "+ c + " * " + a + " / " + d + " = " + result);

  }
}
