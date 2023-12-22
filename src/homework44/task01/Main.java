package homework44.task01;

import java.util.Scanner;

public class Main {

  public static void countPrice(int answer) {
    Scanner scanner = new Scanner(System.in);
    double price;
    Shape shape = null;
    switch (answer) {
      case 1:
        System.out.println("Введите длину большей и меньшей стороны Вашего участка в метрах: ");
        shape = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
        break;
      case 2:
        System.out.println("Введите размер Вашего участка: ");
        shape = new Circle(scanner.nextDouble());
        break;
      case 3:
        System.out.println("Введите количество сторон и длину одной стороны в метрах: ");
        shape = new Polygon(scanner.nextInt(), scanner.nextDouble());
        break;
    }
    System.out.print("Введите цену за метр забора: ");
    price = scanner.nextDouble();
    System.out.println("Цена за весь забор: " + shape.getPerimeter() * price + "€");
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Выберите форму Вашего участка:");
    System.out.println("1. Прямоугольная \n2. Круглая \n3. Многоугольная");
    int answer;
    do {
      answer = scanner.nextInt();
    } while (answer <= 0 || answer >= 4);

    countPrice(answer);
  }
}
