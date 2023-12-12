package homework40;

public class Main {
  /*
  В main создать два объекта с одинаковыми значениями полей. Сравнить их методом equals.
Удостовериться в том что результат - true.
Изменить какое-то значение в одном из объектов. Сравнить объекты еще раз.
Удостовериться в том что результат - false.
Вывод должен быть:
    true
    false
   */
  public static void main(String[] args) {
    Pelmeni pelmeni1 = new Pelmeni("пироги", "с картошкой", 6, true);
    Pelmeni pelmeni2 = new Pelmeni("пироги", "с картошкой", 6, true);
    System.out.println(pelmeni1.equals(pelmeni2));
    pelmeni2.setFilling("с мясом");
    System.out.println(pelmeni1.equals(pelmeni2));
  }
}
