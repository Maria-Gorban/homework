package homework38;

public class Person {

  private String name;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void greeting(Person person) {
    System.out.print("Приветствую! Меня зовут " + person.getName() + ".");

  }


}


