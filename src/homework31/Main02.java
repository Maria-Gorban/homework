package homework31;

import java.util.Random;
import java.util.Scanner;

public class Main02 {

  public static void main(String[] args) {

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Сколько костей кидаем? 1 или 2");
    int answer = scanner.nextInt();
    int a;
    int b;
    int min = 1;
    int max = 6;

    if (answer == 1) {
      a = min + random.nextInt(max - min + 1);
      System.out.println("Вы выкинули: " + a);
    } else if (answer == 2) {
      a = min + random.nextInt(max - min + 1);
      b = min + random.nextInt(max - min + 1);
      System.out.println("Вы выкинули: " + a + " и " + b);
    } else {
      System.out.println("Такого количества костей у меня нет.");
    }
  }
}

