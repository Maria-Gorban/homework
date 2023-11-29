package homework33;

import java.util.Random;

public class Main01 {

  public static void changeSign(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] *= -1;
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    Random random = new Random();
    int[] arr = new int[8];
    System.out.print("Входной массив: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = -30 + random.nextInt(30 + 30 + 1);
      System.out.print(arr[i] + " ");
    }
    System.out.print("\nВывод: ");
    changeSign(arr);
  }
}
