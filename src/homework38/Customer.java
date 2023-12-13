package homework38;

public class Customer extends Person {

  private double money;

  public Customer(String name, double money) {
    super(name);
    this.money = money;
  }
  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }

  public void buyProduct(Seller seller, String productName, int amount) {
    System.out.println("Ваш баланс: " + money + "€");
    double price = seller.getPrice(productName, amount);
    if(price == -1){
      return;
    }
    boolean success = getMoney(price);
    if(!success){
      return;
    }
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


