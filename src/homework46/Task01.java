package homework46;

import java.util.Scanner;

public class Task01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter numbers: ");
    int arrayLength = 100;
    int amount = 0;
    double number;
    double sum = 0;
    double[] arr = new double[arrayLength];

    do {
      number = scanner.nextDouble();
      arr[amount] = number;
      amount++;
      sum += number;
    } while (number != 0 && amount < arrayLength);

    System.out.println("Array of your numbers: ");
    for (int i = 0; i < amount; i++) {
      System.out.print(arr[i] + " | ");
    }

    System.out.println("\nAverage: " + sum / (amount - 1));
  }
}

