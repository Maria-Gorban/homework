package homework46;

import java.util.Scanner;

public class Task02 {
  public static void printDayWeek(int n) {
    switch (n) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number;
    do {
      System.out.print("Enter number of a day of the week: ");
      number = scanner.nextInt();
    } while (number < 1 || number > 7);
    printDayWeek(number);
  }
}
