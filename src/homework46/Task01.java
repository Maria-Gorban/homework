package homework46;

import java.util.ArrayList;
import java.util.Scanner;

public class Task01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter numbers: ");

    int amount = 0;
    double number;
    double sum = 0;
    ArrayList<Double> arr = new ArrayList<>(); //создали объект класса ArrayList для хранения вводимых чисел

    do {
      number = scanner.nextDouble();
      arr.add(number); // метод для добавления вводимых чисел в ArrayList
      amount++;
      sum += number;
    } while (number != 0);

    double[] array = new double[arr.size()]; //создали обычный массив

    for (int i = 0; i < arr.size(); i++) { //копируем значения из ArrayList в наш массив
      array[i] = arr.get(i);
    }

    System.out.println("Array of your numbers: ");
    for (int i = 0; i < array.length - 1; i++) { // (-1) чтобы не выводился 0 в конце
      System.out.print(array[i] + " | ");
    }
    System.out.println("\nAverage: " + sum / (amount - 1));
  }
}

