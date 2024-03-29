package homework38;


public class Seller extends Person {

  private Product[] products;

  public Seller(String name) {
    super(name);
    products = new Product[10];
    products[0] = new Product("копченная колбаса", 10, 15.35);
    products[1] = new Product("сыр", 10, 18.33);
    products[2] = new Product("яблоки", 100, 4.99);
    products[3] = new Product("апельсины", 100, 3.29);
    products[4] = new Product("лосось", 1250, 33.31);
    products[5] = new Product("йогурт", 12340, 3.67);
    products[6] = new Product("помидоры", 23456, 2.79);
    products[7] = new Product("хлеб", 1000, 3.05);
    products[8] = new Product("печенье", 52000, 14.68);
    products[9] = new Product("спагетти", 34567, 8.48);
  }

  public void setProduct(int index, Product product) {
    products[index] = product;
  }

  public Product getProduct(int index) {
    return products[index];
  }

  @Override
  public void greeting() {
    System.out.print("Приветствую! Меня зовут " + getName() + ".");
    System.out.print("Я Ваш продавец.");
  }

  public double getPrice(String productName, int amount) {
    double price = 0;
    for (int i = 0; i < products.length; i++) {
      if (products[i].getName().equals(productName)) {
        if (products[i].getQuantity() >= amount) {
          price = products[i].getPrice() * amount;
          System.out.println("Цена товара: " + String.format("%.3f", price) + "€");
          return price;
        }
        break;
      }
    }
    System.out.println("У нас нет такого продукта");
    return -1;
  }


  public void saleProduct(String productName, int amount) {
    for (int i = 0; i < products.length; i++) {
      if (products[i].getName().equals(productName)) {
        products[i].takeAmount(amount);
        System.out.print(
            "Продукта '" + productName + "' осталось на складе: " + products[i].getQuantity());
      }
    }
  }

  public void printProducts() {
    for (int i = 0; i < products.length; i++) {
      System.out.println(products[i].getName() + ", " + products[i].getPrice() + "€ за 1 кг");
    }
  }
}
