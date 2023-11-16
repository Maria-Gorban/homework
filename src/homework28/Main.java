package homework28;



public class Main {
  public static void main(String[] args) {
    double[] arr = {4.02, 2, 77, 1, -5.25, 600};
    MyArray myArray = new MyArray(arr);
    System.out.println("Наш исходный массив: " + myArray);

    myArray.set(myArray.indexOf(1), 10.99);
    myArray.add(myArray.indexOf(2), 123);
    myArray.remove(myArray.indexOf(7));
    System.out.println("Массив после урока: " + myArray);


    System.out.println("В нашем массиве есть число 22? " + myArray.contains(22));
    System.out.println("В нашем массиве есть число 123? " + myArray.contains(123));

    double[] arr2 = { };
    MyArray myArray2 = new MyArray(arr2);
    System.out.println("Массив myArray пустой? " + myArray.isEmpty());
    System.out.println("Массив myArray2 пустой? " + myArray2.isEmpty());

    myArray.add(5.3);
    System.out.println("Добавляем число 5.3 в конец массива myArray " + myArray);

    myArray.removeLast();
    System.out.println("И удаляем число 5.3 из нашего массива " + myArray);

    myArray.replace(2.0, -22.2);
    System.out.println("Заменим 2 на -22.2: " + myArray);

    System.out.println("Добавим пару ненужных нулей");
    for (int i = 0; i < myArray.size(); i+=2) {
      myArray.add(i, 0.0);
    }
    System.out.println(myArray);

    myArray.remove(0.0);
    System.out.println("Удалим первый 0\n" + myArray);
    myArray.removeAll(0.0);
    System.out.println("А теперь удалим все нули\n" + myArray);







  }
}
