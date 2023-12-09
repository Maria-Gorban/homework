package homework37;

public class RemoteController {

  private int frequency;


  public RemoteController(int frequency) {
    this.frequency = frequency;

  }

  public int getFrequency() {
    return frequency;
  }

  public void setFrequency(int frequency) {
    this.frequency = frequency;
  }


  public int changeForward(TV television) {
    int channel = television.getCurrentChannel();
    if (television.getCurrentChannel() <= 0 || getFrequency() != television.getFrequency()) {
      return channel;
    }
    television.setCurrentChannel(++channel);
    return channel;
  }

  public int changeBackward(TV television) {
    int channel = television.getCurrentChannel();
    if (television.getCurrentChannel() <= 0 || getFrequency() != television.getFrequency()) {
      return channel;
    }
    television.setCurrentChannel(--channel);
    return channel;
  }

  public int changeChannel(TV television, int channel) {
    if (channel <= 0 || channel > 100 || getFrequency() != television.getFrequency()) {
      return television.getCurrentChannel();
    }
    television.setCurrentChannel(channel);
    return channel;
  }

  public boolean changeMaxChannel(TV television) {
    if (television.getCurrentChannel() == television.getMaxChannel()) {
      television.setCurrentChannel(1);
      return true;
    } else {
      return false;
    }
  }

  public boolean changeMinChannel(TV television) {
    if (television.getCurrentChannel() == 1) {
      television.setCurrentChannel(television.getMaxChannel());
      return true;
    } else {
      return false;
    }
  }
}



