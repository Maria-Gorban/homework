package homework37;

import java.util.Scanner;

public class RemoteController {

  private int frequency;
  private TV channel;

  public RemoteController(int frequency, int currentChannel) {
    this.frequency = frequency;
    this.channel = new TV(currentChannel);
  }

  public int getFrequency() {
    return frequency;
  }

  public void setFrequency(int frequency) {
    this.frequency = frequency;
  }

  public int getCurrentChannel() {
    return channel.getCurrentChannel();
  }

  public void setCurrentChannel(int currentChannel) {
    channel.setCurrentChannel(currentChannel);
  }

  public int changeForward(TV television) {
    int channel = television.getCurrentChannel();
    if (television.getCurrentChannel() <= 0 || getFrequency() != television.getFrequency()) {
      return channel;
    } else {
      television.setCurrentChannel(++channel);
      return channel;
    }
  }

  public int changeBackward(TV television) {
    int channel = television.getCurrentChannel();
    if (television.getCurrentChannel() <= 0 || getFrequency() != television.getFrequency()) {
      return channel;
    } else {
      television.setCurrentChannel(--channel);
      return channel;
    }
  }

  public int changeChannel(TV television, int currentChannel) {
    Scanner scanner = new Scanner(System.in);
    int channel = scanner.nextInt();

    if (channel <= 0 || channel > 100 || getFrequency() != television.getFrequency()) {
      return television.getCurrentChannel();
    } else {
      television.setCurrentChannel(channel);
      return channel;
    }
  }
}
