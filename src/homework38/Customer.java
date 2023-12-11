package homework38;

public class Customer extends Person {

  private double money;

  public Customer(String name, double money) {
    super(name);
    this.money = money;
  }

  public void buyProduct(Seller seller, String productName, int amount) {
    double price = seller.getPrice(productName, amount);
    System.out.println("Ваш баланс: " + money + "€");
    System.out.println("Цена товара: " + String.format("%.3f", price) + "€");
  }

  public boolean getMoney(double price) {
    if (money < price) {
      System.out.println("Недостаточно средств");
      return false;
    } else {
      money -= price;
      System.out.println(
          "Оплата прошла успешно. Ваш баланс: " + String.format("%.3f", money) + "€");
      return true;
    }
  }
}


