package homework37;

import java.util.Random;
import java.util.Scanner;

public class Main {
  /*
  это композиция.
   */

  public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    RemoteController controller = new RemoteController(470, 1 + random.nextInt(101));
    TV television = new TV(controller.getCurrentChannel());

    System.out.println("Current channel: " + television.getCurrentChannel());

    while (true) {
      System.out.println("Press f-forward or b-backward or stop");
      String answer = scanner.nextLine();
      switch (answer) {
        case "f":
          if (television.getCurrentChannel() == television.getMaxChannel()) {
            television.setCurrentChannel(1);
            System.out.println("Current channel: " + television.getCurrentChannel());
            break;
          }
          System.out.println("Current channel: " + controller.changeForward(television));
          break;
        case "b":
          if (television.getCurrentChannel() == 1) {
            television.setCurrentChannel(100);
            System.out.println("Current channel: " + television.getCurrentChannel());
            break;
          }
          System.out.println("Current channel: " + controller.changeBackward(television));
          break;
        case "stop":
          System.out.println("Enter channel number: ");
          System.out.println("Current channel: " + controller.changeChannel(television));
          break;
      }
    }
  }
}



