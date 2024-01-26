package homework47;

public class Pair <First, Second> {

  private First product;
  private Second price;

  public Pair(First product, Second price) {
    this.product = product;
    this.price = price;
  }

  public First getProduct() {
    return (First) product;
  }

  public void setProduct(First product) {
    this.product = (First) product;
  }

  public Second getPrice() {
    return (Second) price;
  }

  public void setPrice(Second price) {
    this.price = (Second) price;
  }
}