package homework37;

import java.util.Random;
import java.util.Scanner;

public class Main {
  /*
  это ассоциация
   */

  public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    RemoteController controller = new RemoteController(470);
    TV television = new TV(1 + random.nextInt(101), 470);

    System.out.println("Current channel: " + television.getCurrentChannel());

    while (true) {
      System.out.println("Press f-forward or b-backward or stop");
      String answer = scanner.nextLine();

      switch (answer) {
        case "f":
          if (!controller.changeMaxChannel(television)) {
            controller.changeForward(television);
          }
          System.out.println("Current channel: " + television.getCurrentChannel());
          break;

        case "b":
          if (!controller.changeMinChannel(television)) {
            controller.changeBackward(television);
          }
          System.out.println("Current channel: " + television.getCurrentChannel());
          break;

        case "stop":
          System.out.println("Enter channel number: ");
          int channel = scanner.nextInt();
          System.out.println("Current channel: " + controller.changeChannel(television, channel));
          break;
      }
    }
  }
}



