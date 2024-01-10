package homework44.task02;

import java.util.Scanner;

public class Main {

  public static Shape createObject(int answer) {
    Scanner scanner = new Scanner(System.in);
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
    return shape;

  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Выберите форму Вашего участка:");
    System.out.println("1. Прямоугольная \n2. Круглая \n3. Многоугольная");
    int answer;
    do {
      answer = scanner.nextInt();
      scanner.nextLine();
    } while (answer <= 0 || answer >= 4);

    System.out.print("Введите цену за метр забора: ");
    double price = scanner.nextDouble();
    Shape shape = createObject(answer);
    System.out.println("Цена за весь забор: " + shape.getPerimeter() * price + "€");
    System.out.println(shape);

    System.out.println("Хотите изменить введенные данные? y/n");
    String ans = scanner.nextLine();
    if (ans.equals("n")) {
      return;
    }
    System.out.print("Введите коэффициент, на который хотите увеличить размер Вашего участка: ");
    shape.resize(scanner.nextDouble());
    System.out.println("Цена за весь забор: " + shape.getPerimeter() * price + "€");
    System.out.println(shape);
  }
}
