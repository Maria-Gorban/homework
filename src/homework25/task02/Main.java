package homework25.task02;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Pen bic = new Pen();

    while (bic.tintAmount > 0) {
      bic.checkInk();
      System.out.println("Введите текст: ");
      String text = scanner.nextLine();
      bic.write(text);
    }
    bic.refill();
    bic.checkInk();
  }
}
