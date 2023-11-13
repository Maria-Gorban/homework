package homework26.task02;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Pelmeni pelmeni = new Pelmeni();
    pelmeni.printInfo(pelmeni.type, pelmeni.filling, pelmeni.amount);
    pelmeni.cook();

    Pelmeni khinkali = new Pelmeni("хинкали", "с сыром", 0, false);
    khinkali.printInfo(khinkali.type, khinkali.filling, khinkali.amount);
    khinkali.cook();
  }
}
