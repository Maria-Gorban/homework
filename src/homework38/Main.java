package homework38;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Customer customer = new Customer("приятный господин", 10);
    Seller seller = new Seller("Михаил");
    seller.greeting();

    System.out.println("\nАссортимент нашего магазина:");
    seller.printProducts();

    System.out.print("\nВведите название товара: ");
    String productName = scanner.nextLine();
    System.out.print("Введите количество: ");
    int amount = scanner.nextInt();
    scanner.nextLine();

    customer.buyProduct(seller, productName, amount);
    double price = seller.getPrice(productName, amount);

    customer.getMoney(price);
    System.out.println("Спасибо! Хорошего дня.");

    System.out.print("Продукта '" + productName + "' осталось на складе: ");
    seller.saleProduct(productName, amount);
  }
}


