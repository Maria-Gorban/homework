package homework31;

import java.util.Random;
import java.util.Scanner;

public class Main02 {

  public static void main(String[] args) {

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    while(true) {
      System.out.println("Сколько костей кидаем? 1 или 2");
      int answer = scanner.nextInt();
      int a;
      int b;

      switch (answer) {
        case 1:
          a = 1 + random.nextInt(7 - 1);
          System.out.println("Вы выкинули: " + a);
          break;
        case 2:
          a = 1 + random.nextInt(7 - 1);
          b = 1 + random.nextInt(7 - 1);
          System.out.println("Вы выкинули: " + a + " и " + b);
          break;
        default:
          System.out.println("Такого количества костей у меня нет.");
          return;
      }
    }
  }
}
