package homework34;

import java.util.Scanner;

public class Main01 {

  public static String printSeason(String month) {
    switch (month) {
      case "декабрь":
      case "январь":
      case "февраль":
        return "зима";

      case "март":
      case "апрель":
      case "май":
        return "весна";

      case "июнь":
      case "июль":
      case "август":
        return "лето";

      case "сентябрь":
      case "ноябрь":
      case "октябрь":
        return "осень";

    }
    return "нет такого месяца";
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String month = scanner.nextLine();
    System.out.println(printSeason(month));
  }
}
