package homework39.task01;


public class Pelmeni extends Object {

  String type; // пельмени, хинкали, манты, равиоли, дюшбары...
  String filling; // с мясом, с картошкой, с сыром, с вареньем, с творогом...
  int amount;
  boolean isReadyToEat; //True - приготовленные, false - сырые


  public Pelmeni() {
    this("пельмени", "с говядиной", 10, true);
  }

  public Pelmeni(String type, String filling, int amount, boolean isReadyToEat) {

    this.type = type;
    this.filling = filling;
    this.amount = amount;
    this.isReadyToEat = isReadyToEat;
  }

  @Override
  public String toString() {
    if (!isReadyToEat) {
      System.out.println("Блюдо еще не готово.");
    } else {
      System.out.println("Блюдо готово к употреблению.");
    }
    return "Сегодня у нас будут " + this.type + " " + this.filling + ", " + this.amount + " штук";
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getFilling() {
    return filling;
  }

  public void setFilling(String filling) {
    this.filling = filling;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public boolean isReadyToEat() {
    return isReadyToEat;
  }

  public void setReadyToEat(boolean readyToEat) {
    isReadyToEat = readyToEat;
  }
}
