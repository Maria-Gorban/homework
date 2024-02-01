package homework56;

import java.util.Arrays;

public class Main03 {
/*
Проверить, будут ли все строки в списке больше 10 символов в длину
 */
public static void main(String[] args) {

  String line = "Fascinatingexpeditions discoveringthetreasures ofancientcivilizations andunexploredterritories";

  boolean isLongEnough = Arrays.stream(line.split("\\s+"))
      .allMatch(word -> word.length() > 10);
  System.out.println(isLongEnough);

}
}
