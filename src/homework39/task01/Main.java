package homework39.task01;

public class Main {

  public static void main(String[] args) {
    Pelmeni pelmeni = new Pelmeni();
    Pelmeni vareniki = new Pelmeni("вареники", "с картошкой", 6, false);

    System.out.println(pelmeni.toString());
    System.out.println(vareniki.toString());
  }
}
