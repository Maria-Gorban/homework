package homework38;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Customer customer = new Customer("приятный господин", 300);
    Seller seller = new Seller("Михаил");
    seller.greeting(seller);
    System.out.print(" Я Ваш продавец.");

    System.out.println("Ассортимент нашего магазина:");
    seller.printProducts();

    System.out.print("\nВведите название товара: ");
    String productName = scanner.nextLine();
    System.out.print("Введите количество в кг: ");
    int amount = scanner.nextInt();
    scanner.nextLine();


    double price = seller.getPrice(productName, amount);

    System.out.println("Цена данного товара составит " + String.format("%.3f", price) + "€");
    seller.getPrice(productName, amount);
    customer.getMoney(price);

    System.out.println("Спасибо! Хорошего дня.");
    System.out.println("Продукта '" + productName+"' осталось на складе: ");
    seller.saleProduct(productName, amount);
  }
}


