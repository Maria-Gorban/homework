package homework25.task02;

import java.util.Scanner;

public class Pen {
  int tintAmount = 1000;

  public void write(String text) {

    char[] symbols = text.toCharArray();
    if (tintAmount >= symbols.length) {
      System.out.println("Вы ввели следующий текст: \n" + text + "\n");

    }else {
      System.out.println(" ");
    }
    tintAmount -= symbols.length;
  }

    public void refill(){
      tintAmount = 1000;
      //return tintAmount;
    }

    public void checkInk(){
      System.out.println("Количество чернил в ручке: " + tintAmount);
    }


}
