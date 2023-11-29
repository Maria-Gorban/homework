package homework33;



public class Main02 {

  public static char[] charArr() {
    char[] letters = new char[26]; //26 букв в алфавите

    for (int i = 0; i < letters.length; i++) {
      letters[i] = (char) (97 + i); // 97 это код первой буквы 'a'
    }
    return letters;
  }

  public static String[] stringArr(char[] letters){
    String[] arr = new String[26];
    for (int i = 0; i < letters.length; i++) {
      arr[i] = String.valueOf(letters[i]);

    }
    return arr;
  }


  public static void main(String[] args) {
    System.out.print("Char array: ");
    System.out.println(charArr());

    System.out.print("String array: ");
   String[] arr = stringArr(charArr());

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");

    }

  }
}

