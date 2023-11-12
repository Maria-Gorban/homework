package homework26.task02;

import java.util.Random;

public class Pelmeni {

  String type; // пельмени, хинкали, манты, равиоли, дюшбары...
  String filling; // с мясом, с картошкой, с сыром, с вареньем, с творогом...
  int amount;
  boolean isReadyToEat; //True - приготовленные, false - сырые


  public Pelmeni() {
    //this("пельмени", "с говядиной", 10, false); это будет вызовом конструктора с параметрами, и в этом случае amount тоже будет случайно генерироваться
    //можно просто убрать рандом из конструктора с параметрами
    this.type = "пельмени";
    this.filling = "с говядиной";
    this.amount = 10;
    this.isReadyToEat = false;

  }

  public Pelmeni(String type, String filling, int amount, boolean isReadyToEat) {
    Random random = new Random();
    this.type = type;
    this.filling = filling;
    this.amount = 1 + random.nextInt(100-1);
    this.isReadyToEat = isReadyToEat;

  }

  public void printInfo(String type, String filling, int amount){
    System.out.println("Сегодня мы будем есть " + type + " " + filling + ", " + amount + " штук.");
  }

  public void cook() {
    System.out.println("Давайте готовить!");
    if (!isReadyToEat) {
      Random random = new Random();
      int min = 1 + random.nextInt(25 - 1);

      if(type.equals("хинкали")){
        if(min < 10){
          System.out.println(type + " не доварены");
        }
        else if(min > 20){
          System.out.println(type + " переварены");
        }
        else{
          System.out.println("Приятного аппетита!");
        }
      }
      else {
        if(min < 5){
          System.out.println(type + " не доварены");
        }
        else if(min > 10){
          System.out.println(type + " переварены");
        }
        else{
          System.out.println("Приятного аппетита!");
        }
      }
    }
  }
}

