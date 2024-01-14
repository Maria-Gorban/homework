package homework47.task01;


import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // делаем массивы с данными
    String[] products = {"Яблоко", "Картошка", "Огурец", "Помидор", "Лук", "Виноград"};
    Double[] prices = {2.D, 1.5, 2.5, 3.D, 1.D, 3.5};

    Pair<String, Double>[] goods = new Pair[products.length];

    for (int i = 0; i < goods.length; i++) {
      goods[i] = new Pair<>(products[i], prices[i]);
    }

    Scanner scanner = new Scanner(System.in);
    String userChoice = scanner.nextLine();

    int index = -1;
    for (int i = 0; i < goods.length; i++) {
      if (userChoice.equals(goods[i].getProduct())) {
        index = i;
        break;
      }
    }

    if (index != -1) {
      System.out.println(goods[index].getPrice());
    } else {
      System.out.println("Товара " + userChoice + " нет в магазине");
    }

  }
}