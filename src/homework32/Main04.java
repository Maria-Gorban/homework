package homework32;

import java.util.Scanner;

public class Main04 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите размер массива: ");
    int size = scanner.nextInt();

    int[] arr = new int[size];
    System.out.println("Введите элементы массива: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scanner.nextInt();
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    boolean isSorted = true;
    for (int i = arr.length - 1; i > 0; i--) {
      if (arr[i] < arr[i - 1]) {
        isSorted = false;
      }
    }
    if (isSorted) {
      System.out.println("Массив отсортирован");
    } else {
      System.out.println("Массив не отсортирован");
    }

  }
}

/*
можно не создавать переменную isSorted, альтернатива выглядит так:
for(int i = 0; i < arr.length; i++){
if(arr[i] < arr[i - 1]){
System.out.println("Массив не отсортирован");
return;
}
}
System.out.println("Массив отсортирован");

 */
