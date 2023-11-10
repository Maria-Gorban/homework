package homework25.task01;

public class Main {

  public static void main(String[] args) {

    Human andrii = new Human();
    andrii.name = "Андрій";
    andrii.age = 22;

    Human maria = new Human();
    maria.name = "Марійка";
    maria.age = 21;

    Human veronika = new Human();
    veronika.name = "Вероніка";
    veronika.age = 20;

    andrii.introduce();
    maria.introduce();
    veronika.introduce();
  }
}
