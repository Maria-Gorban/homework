package homework40;

import java.util.Objects;

public class Pelmeni {
  /*
  Описать для него метод equals и hashCode.
   */

  String type;
  String filling;
  int amount;
  boolean isReadyToEat; //True - приготовленные, false - сырые


  public Pelmeni() {
    this("пельмени", "с говядиной", 10, false);
  }

  public Pelmeni(String type, String filling, int amount, boolean isReadyToEat) {
    this.type = type;
    this.filling = filling;
    this.amount = amount;
    this.isReadyToEat = isReadyToEat;
  }

  @Override
  public int hashCode(){
    return Objects.hash(type, filling, amount, isReadyToEat);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    Pelmeni pelmeni;
    if (obj instanceof Pelmeni) {
      pelmeni = (Pelmeni) obj;
    } else {
      return false;
    }

    return this.type.equals(pelmeni.type)
        && this.filling.equals(pelmeni.filling)
        && this.amount == pelmeni.amount
        && this.isReadyToEat == pelmeni.isReadyToEat;
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
