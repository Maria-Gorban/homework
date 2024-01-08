package homework46;

import java.util.Random;
import java.util.Scanner;


public class Task03 {

  public static int[] fillArray(int[] arr) {
    Random random = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(100);
    }
    return arr;
  }

  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static int[] sort(int[] arr) {
    for (int i = 0; i < arr.length-1; i++) {
      int index = i;
      for (int j = 1 + i; j < arr.length; j++) {
        if (arr[index] < arr[j]) {
          index = j;
        }
      }
      if (index == i) {
        continue;
      }
      int temp = arr[index];
      arr[index] = arr[i];
      arr[i] = temp;
    }
    return arr;
  }


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a length of array: ");
    int size = scanner.nextInt();
    int[] arr = new int[size];

    printArray(fillArray(arr));

    System.out.println("\n- Sorting -");
    printArray(sort(arr));

  }
}

