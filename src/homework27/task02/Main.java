package homework27.task02;

import java.util.Scanner;

public class Main {

  public static String ask() {
    Scanner scanner = new Scanner(System.in);
    System.out.println(
        "Введите 'deduct', чтобы снять деньги со счета или 'put on', чтобы пополнить счет");
    return scanner.nextLine();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    BankAccount acc = new BankAccount("2399 1273 64");
    System.out.println("Номер Вашего счета: " + acc.getAccountNumber());
    System.out.println("Баланс карты: " + acc.getCardBalance() + " €");
    String answer = ask();
    while (answer.equals("deduct")) {
      System.out.println("Недостаточно средств");
      answer = ask();
    }
    System.out.println("Какую сумму Вы собираетесь положить на счет?");
    double money = scanner.nextDouble();
    scanner.nextLine();
    acc.putOnMoney(acc.getCardBalance(), money);

    while (true) {
      System.out.println("Желаете продолжить операции со счетом? y/n");
      String ans = scanner.nextLine();
      switch (ans) {
        case ("y"):
          answer = ask();
          if (answer.equals("deduct")) {
            System.out.println("Какую сумму Вы хотите снять?");
            money = scanner.nextDouble();
            scanner.nextLine();
            acc.deductMoney(acc.getCardBalance(), money);
            break;
          } else if (answer.equals("put on")) {
            System.out.println("Какую сумму Вы собираетесь положить на счет?");
            money = scanner.nextDouble();
            scanner.nextLine();
            acc.putOnMoney(acc.getCardBalance(), money);
            break;
          }
        case ("n"):
          System.out.println("Спасибо, что выбрали наш банк! Хорошего дня!");
          return;
        default:
          break;
      }
    }
  }
}


