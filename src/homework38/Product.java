package homework38;

public class Product {

  private String name;
  private int quantity; // количество в кг
  private double price; // за 1 кг в €

  public Product() {
    this("", 0, 0);
  }

  public Product(String name, int quantity, double price) {
    this.name = name;
    this.quantity = quantity; //сколько имеется на складе
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = Math.max(quantity, 0);
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = Math.max(price, 0);
  }

  public boolean takeAmount(int amount) {
    if (quantity < amount) {
      return false;
    }
    quantity -= amount;
    return true;
  }
}
