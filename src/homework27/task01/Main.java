package homework27.task01;

public class Main {

  public static void main(String[] args) {
    Human02 andrii = new Human02("Андрій", 22);
    System.out.println("Привіт, мене звуть " + andrii.getName() + ", мені " + andrii.getAge() + " рік.");

    Human02 maria = new Human02("Марійка", 21);
    System.out.println("Привіт, мене звуть " + maria.getName() + ", мені " + maria.getAge() + " рік.");

    Human02 veronika = new Human02("Вероніка", 20);
    System.out.println("Привіт, мене звуть " + veronika.getName() + ", мені " + veronika.getAge() + " рік.");

    System.out.println("Спустя год после жизни в эмиграции");

    andrii.setName("Andrii");
    andrii.setAge(23);
    System.out.println("Hallo, ich heiße " + andrii.getName() + ", ich bin " + andrii.getAge() + " Jahre alt.");

    maria.setName("Marika");
    maria.setAge(22);
    System.out.println("Cześć, mam na imię " + maria.getName() + ", mam " + maria.getAge() + " lata.");

    veronika.setName("Veronica");
    veronika.setAge(21);
    System.out.println("Hi my name is " + veronika.getName() + ", i am " + veronika.getAge() + " years old.");

  }

}
