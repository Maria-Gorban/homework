package homework37;

public class TV {

  private int frequency;
  private int currentChannel;
  private final int maxChannel = 100;


  public TV(int currentChannel) {
    this.currentChannel = currentChannel;
    frequency = 470;
  }

  public int getMaxChannel() {
    return maxChannel;
  }

  public int getFrequency() {
    return frequency;
  }

  public void setFrequency(int frequency) {
    this.frequency = frequency;
  }

  public int getCurrentChannel() {
    return currentChannel;
  }

  public void setCurrentChannel(int currentChannel) {
    this.currentChannel = currentChannel;
  }
}
