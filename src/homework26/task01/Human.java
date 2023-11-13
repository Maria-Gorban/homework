package homework26.task01;

public class Human {

  String name;
  int age;

  public Human(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void introduce() {
    System.out.println("Привіт, мене звуть " + name + ", мені " + age + " рік.");
  }


}
