package homework32;

import java.util.Scanner;

public class Main02 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Ведите число для вывода его таблицы умножения: ");
    int number = scanner.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(number + " * " + i + " = " + (number * i));

    }
  }
}
