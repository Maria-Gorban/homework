package homework40;

public class Main {

  public static void main(String[] args) {
    Pelmeni pelmeni1 = new Pelmeni("пироги", "с картошкой", 6, true);
    Pelmeni pelmeni2 = new Pelmeni("пироги", "с картошкой", 6, true);
    System.out.println(pelmeni1.equals(pelmeni2));
    pelmeni2.setFilling("с мясом");
    System.out.println(pelmeni1.equals(pelmeni2));
  }
}
