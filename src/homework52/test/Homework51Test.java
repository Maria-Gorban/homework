package homework52.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;


import homework51.task01;
import org.junit.jupiter.api.Test;

public class Homework51Test {

  @Test
  void isPalindromeReturnsTrue() {
    boolean actual = task01.isPalindrome("tenet");
    boolean expected = true;
    assertEquals(expected, actual);
  }

  @Test
  void isPalindromeReturnsFalse(){
    boolean actual = task01.isPalindrome("tenets");
    boolean expected = false;
    assertEquals(expected, actual);
  }
  @Test
  void isPalindromeIgnoresSpacesWorks() {
    boolean actual = task01.isPalindromeIgnoresSpaces("А роза упала на лапу Азора");
    boolean expected = true;
    assertEquals(expected, actual);
  }


  @Test
  void isPangramReturnsTrue() {
    boolean actual = task01.isPangram("A bC DEFG hijklmn OpQr stUVW xYz");
    boolean expected = true;
    assertEquals(expected, actual);
  }

  @Test
  void isPangramReturnsFalse() {
    boolean actual = task01.isPangram("Luke, i am your father");
    boolean expected = false;
    assertEquals(expected, actual);
  }

  @Test
  void parseIpWorks() {
    byte[] actual = task01.parseIp("123.6.89.222");
    byte[] expected = {-5, -122, -39, 94};

    boolean prof = true;

    for (int i = 0; i < actual.length; i++) {
      if (actual[i] != expected[i]) {
        prof = false;
        break;
      }
    }
    assertTrue(prof);
  }



  @Test
  void incorrectSplitedInputThrowsException() {
    try {
      task01.parseIp("123 34 0 80");
      fail("incorrect input didn't throw an exception");
    } catch (IllegalArgumentException ex) {

    }
  }

  @Test
  void tooBigValueThrowsException() {
    try {
      task01.parseIp("123.340.0.800");
      fail("incorrect input didn't throw an exception");
    } catch (IllegalArgumentException ex) {

    }
  }

  @Test
  void inputWordsInsteadOfIp() {
    try {
      task01.parseIp("my IP is onne two three");
      fail("incorrect input didn't throw an exception");
    } catch (IllegalArgumentException ex) {

    }
  }

  @Test
  void encryptWorks() {
    String actual = task01.encrypt("Hello World 6");
    String expected = "khoor#zruog#9";

    assertEquals(expected, actual);
  }

  @Test
  void decryptWorks() {
    String actual = task01.decrypt("khoor#zruog");
    String expected = "hello world";

    assertEquals(expected, actual);
  }

  @Test
  void countOccurenciesWorks() {
    int actual = task01.countOccurencies("today is a woOOonderful day", 'o');
    int expected = 5;

    assertEquals(expected, actual);
  }

  @Test
  void noLetterInStringReturnsZero() {
    int actual = task01.countOccurencies("bip boop bom bom", 'a');
    assertTrue(actual == 0);
  }

  @Test
  void emptyStringReturnsZero() {
    int actual = task01.countOccurencies(" ", 'w');
    assertTrue(actual == 0);
  }

  @Test
  void isEmailReturnsTrue(){
    boolean actual = task01.isEmail("maria.gorban.2001@gmail.com");
    boolean expected = true;

    assertEquals(expected,actual);
  }


  @Test
  void isEmailReturnsFalse(){
    boolean actual = task01.isEmail("maria.gorban.2001@@gmail..com");
    boolean expected = false;

    assertEquals(expected,actual);
  }

  @Test
  void reverseWorks(){
    String actual = task01.reverse("Hello world");
    String expected = "dlrow olleH";

    assertEquals(expected, actual);
  }

  @Test
  void wordReverseWorks(){
    String actual = task01.wordReverse("Rome was not built in a day");
    String expected = "day a in built not was Rome";

    assertEquals(expected, actual);
  }

  @Test
  void toCamelCaseWorks(){
    String actual = task01.toCamelCase("coding is fun");
    String expected = "codingIsFun";

    assertEquals(expected, actual);
  }
}

