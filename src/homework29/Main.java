package homework29;

public class Main {


  public static void main(String[] args) {

    TrafficLight lightR = new TrafficLight(LightColors.RED);

    System.out.println("Безопасно переходить дорогу?");

    if (lightR.canCrossTheRoad()) {
      System.out.println("ДА, можно переходить дорогу, горит зеленый, все безопасно");
    } else {
      System.out.println("Нет, стой. Переходить можно только на зеленый сигнал светофора!");
    }
  }
}
