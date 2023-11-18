package homework30;

public class Main01 {

  public static void main(String[] args) {
    int intNumber = 33;
    double floatingNumber = 2.66;
    char letter = 'M';
    boolean logVar = false;

    System.out.println("Целый: " + intNumber + ", " + Integer.SIZE / 8  + " байта" );
    System.out.println("Нецелый: " + floatingNumber + ", " + Double.SIZE / 8  + " байт" );
    System.out.println("Символьный: " + letter + ", " + Character.SIZE / 8  + " байта" );
    System.out.println("Логический: " + logVar + ", 1 байт" );

  }
}
/*
примитивные типы данных:
int, byte, long, short
float, double
char
boolean
String (но это не точно, примитивные типы данных это база, они атомарны,
то есть простейшие, самодостаточные и неделимые, в отличие от объектов, как строки)
 */