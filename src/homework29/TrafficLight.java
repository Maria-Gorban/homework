package homework29;

public class TrafficLight {

  private LightColors currentColor;

  public TrafficLight(LightColors currentColor) {
    this.currentColor = currentColor;
  }

  public LightColors getCurrentColor() {
    return currentColor;
  }

  public void setCurrentColor(LightColors currentColor) {
    this.currentColor = currentColor;
  }

  public boolean canCrossTheRoad() {
    System.out.println("Сейчас горит " + currentColor + ". Безопасно переходить дорогу?");
    return currentColor == LightColors.GREEN;

  }
}


