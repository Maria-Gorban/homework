package homework51;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Character.toUpperCase;

public class task01 {


  public static boolean isPalindromeIgnoresSpaces(String word) {

    char[] signs = {',', '.', ';', ':', '!', '?', '-'};

    for (int i = 0; i < signs.length; i++) {
      for (int j = 0; j < word.length(); j++) {
        if (signs[i] == word.charAt(j)) {
          word = word.replace(word.charAt(j), ' ');
        }
      }
    }
    word = word.replaceAll("\\s", "");
    word = word.toLowerCase();

    for (int i = 0; i < word.length() / 2; i++) {
      if (!(word.charAt(i) == word.charAt(word.length() - i - 1))) {
        return false;
      }
    }
    return true;
  }

  public static boolean isPalindrome(String word) {
    word = word.toLowerCase().replace("[^a-z]", "");
    return reverse(word).equals(word);
  }

  public static boolean isPangram(String sentence) {
    sentence = sentence.replaceAll("\\s", "");
    sentence = sentence.toLowerCase();

    char[] alphabet = new char[26];
    for (int i = 0; i < alphabet.length; i++) {
      alphabet[i] = (char) ('a' + i);
    }

    for (int i = 0; i < alphabet.length; i++) {
      boolean found = false;
      for (int j = 0; j < sentence.length(); j++) {
        if (sentence.charAt(j) == alphabet[i]) {
          found = true;
          break;
        }
      }
      if (!(found)) {
        return false;
      }
    }
    return true;
  }

  /*
  for(char letter = 'a'; letter <= 'z'; letter++){
  if(sentence.indexOf(letter) == -1){
  return false;
  }
  }
  return true;
  }
   */


  public static byte[] parseIp(String ip) {
    String[] bytesStr = ip.split("\\.");
    if (bytesStr.length != 4) {
      throw new IllegalArgumentException("IP should consist of 4 numbers!");
    }
    byte[] byteArray = new byte[4];
    for (int i = 0; i < byteArray.length; i++) {
      int value;

      try {
        value = Integer.parseInt(bytesStr[i]);
      } catch (NumberFormatException ex) {
        throw new IllegalArgumentException(ex);
      }
      if (value < 0 || value > 255) {
        throw new IllegalArgumentException("Number should be in range 0..255");
      }
      byteArray[i] = (byte) (value - 128);
    }
    return byteArray;
  }


  public static String encrypt(String text) {

    text = text.toLowerCase();
    StringBuilder enText = new StringBuilder();

    for (char ch : text.toCharArray()) {
      enText.append((char) (ch + 3));
    }
    return enText.toString();
  }


  public static String decrypt(String data) {
    StringBuilder sb = new StringBuilder();
    for (char ch : data.toCharArray()) {
      sb.append((char) (ch - 3));
    }
    return sb.toString();
  }

  public static int countOccurencies(String text, char letter) {
    text = text.toLowerCase();
    if (text == null || text.isEmpty()) {
      return 0;
    }
    int letterCounter = 0;
    char[] temp = text.toCharArray();
    for (char c : temp) {
      if (letter == c) {
        letterCounter++;
      }
    }
    return letterCounter;
  }

  public static boolean isEmail(String email) {
    return email.matches("[a-zA-Z0-9._]+(\\+[a-zA-Z0-9._]+)?@[a-zA-Z0-9._]+");
  }

  public static String reverse(String text) {
    return new StringBuilder(text).reverse().toString();
  }

  public static String wordReverse(String text) {
    StringBuilder sb = new StringBuilder();

    String[] words = text.split(" ");
    for (int i = words.length - 1; i >= 0; i--) {
      sb.append(words[i]).append(" ");
    }
    return sb.toString().trim(); // .trim() удаляет пробел в конце
  }

  public static String toCamelCase(String text) {
    String[] splitText = text.toLowerCase().split(" ");
    StringBuilder sb = new StringBuilder(
        splitText[0]); //первое слово будет LowerCase как оно и есть

    for (int i = 1; i < splitText.length; i++) {
      // дальше мы приклеиваем слова, начиная со второго слова, и они будут с большой буквы
      sb.append(toUpperCase(splitText[i].charAt(0))).append(splitText[i].substring(1));
    }
    return sb.toString();
  }


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    System.out.println("Enter your text for isPalindrome: ");
    System.out.println(isPalindrome(scanner.nextLine()));

    System.out.println("Enter your text for isPangram: ");
    System.out.println(isPangram(scanner.nextLine()));

    System.out.println(Arrays.toString(parseIp("123.6.89.222")));

    System.out.println(encrypt("Hello World"));
    System.out.println(decrypt("khoor#zruog"));

    System.out.println(countOccurencies("one two three four five", 'z'));


  }
}
