package homework32;

import java.util.Scanner;

public class Main03 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number;

    do {
      System.out.print("Введите число от 1 до 10: ");
      number = scanner.nextInt();
    } while (number < 1 || number > 10);
    System.out.println("Вы ввели " + number + ". Спасибо!");
  }
}
