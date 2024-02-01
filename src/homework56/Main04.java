package homework56;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main04 {
  /*
  Из строки сделать аббревиатуру
   */

  public static void main(String[] args) {
    String line = "Application programming interface";

    Stream<String> words = Arrays.stream(line.split("\\s+")); // поток слов
    Stream<Character> abb = words.map(word -> Character.toUpperCase(word.charAt(0))); //поток первых букв

    System.out.print(line + " -> ");
    abb.forEach(System.out::print);
  }
}
