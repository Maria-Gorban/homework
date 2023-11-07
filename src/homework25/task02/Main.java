package homework25.task02;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Pen bic = new Pen();

    do{
      bic.checkInk();
      System.out.println("Введите текст: ");
      String text = scanner.nextLine();
      bic.write(text);
    }while(bic.tintAmount > 0);
    System.out.println("Чернила закончились. Хотите заправить ручку снова? y/n");
    String answer = scanner.nextLine();

    switch(answer){
      case "y":
        bic.refill();
        bic.checkInk();
        break;
      case "n":
        System.out.println("Тогда на сегодня больше никакого писательства.");
    }



  }
}
