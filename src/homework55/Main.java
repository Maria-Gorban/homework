package homework55;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
    Map<String, Integer> toDos = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Какие на сегодня планы?");
    int sum = 0;
    int minSum = 0;
    while (true) {
      System.out.print("\nДело: ");
      String task = scanner.nextLine();
      if (task.equals("конец")) {
        break;
      }
      System.out.print("Время: ");
      int time = scanner.nextInt();
      scanner.nextLine();
      toDos.put(task,time);
      sum++;
      minSum += time;

    }

    System.out.println("\nСегодня у Вас " + sum + " дел");
    for (String key : toDos.keySet()) {
      System.out.println("- " + key + " (" + toDos.get(key) + " мин)");
    }
    System.out.println("На это все уйдет " + String.format("%d ч. %02d мин.",(minSum / 60), (minSum % 60)));

  }
}
/*
@Override
  public String toString() {
    return String.format(singer  +
        " - " + name +
        " (%d:%02d)", (duration / 60),(duration % 60));
  }
 */