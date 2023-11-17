package homework29;

public class Main {

  public static void main(String[] args) {
    TrafficLight lightR = new TrafficLight(LightColors.ROT);
    System.out.println(lightR.canCrossTheRoad());

    TrafficLight lightY = new TrafficLight(LightColors.YELLOW);
    System.out.print("Сейчас еще " + lightY.canCrossTheRoad() + "\n");

    TrafficLight lightG = new TrafficLight(LightColors.GREEN);
    System.out.println("А вот теперь " + lightG.canCrossTheRoad());
  }
}
