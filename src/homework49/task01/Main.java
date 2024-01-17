package homework49.task01;

import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    MyArray<Integer> numbers = new MyArray<>();
    int i = 0;

    while (i < 10) {
      Integer d = 1 + random.nextInt(20 - 1);
      numbers.add(d);
      i++;
    }
    for (Integer d : numbers) {
      System.out.print(d + " ");
    }

    try {
      System.out.println("\nTry to find an element with a negative index");
      numbers.get(-8);
    } catch (IndexOutOfBoundsException ex) {
      System.out.println(ex.getMessage());
    }

    try {
      System.out.println("Try to add an element with a wrong index");
      numbers.add(56, 56);
    } catch (IndexOutOfBoundsException ex) {
      System.out.println(ex.getMessage());

    }
    try {
      System.out.print("Enter a number to find out its index: ");
      int n = scanner.nextInt();
      System.out.println(numbers.indexOf(n));
    } catch (IllegalArgumentException ex) {
      System.out.println(ex.getMessage());
    }
  }
}
