package homework29;

public class Main {

  public static void main(String[] args) {
    TrafficLight lightR = new TrafficLight(LightColors.RED);
    System.out.println(lightR.canCrossTheRoad());

    TrafficLight lightY = new TrafficLight(LightColors.YELLOW);
    System.out.println(lightY.canCrossTheRoad());

    TrafficLight lightG = new TrafficLight(LightColors.GREEN);
    System.out.println(lightG.canCrossTheRoad());

  }
}
