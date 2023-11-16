package homework28;

public class MyArray {
  private double[] array;


  public MyArray() {
    array = new double[0];

  }

  public MyArray(double[] array) {
    this.array = new double[array.length];
    copy(array, this.array);
  }

  private void copy(double[] src, double[] dst) {
    for (int i = 0; i < src.length; i++) {
      dst[i] = src[i];
    }
  }

  public double get(int index) {

    return array[index];
  }


  public void set(int index, double value) {

    array[index] = value;
  }

  public int size() {
    return array.length;
  }

  public int indexOf(double val) { //алгоритм линейного поиска индекса элемента
    for (int i = 0; i < array.length; i++) {
      if (array[i] == val) {
        return i;
      }
    }
    return -1;
  }

  public void add(int index, double val) {
    if (index < 0 || index > array.length) {
      return;
    }
    double[] newArray = new double[array.length + 1];
    copy(array, newArray);
    for (int i = newArray.length - 1; i > index; i--) {
      newArray[i] = newArray[i - 1];
    }
    newArray[index] = val;
    array = newArray;
  }

  public void remove(int index){
    if (index < 0 || index > array.length) {
      return;
    }
    double[] newArray = new double[array.length - 1];
    for (int i = 0; i < newArray.length; i++) {
      newArray[i] = (i < index) ? array[i] : array[i + 1];
    }
    array = newArray;
  }




  public boolean contains(double val){ //возвращает true если значение val есть в этом массиве, false в противном случае
    if(indexOf(val) == -1){
      return false;
    }
    return true;
  }

  public boolean isEmpty(){ //возвращает true если массив пустой
    for (int i = 0; i < array.length; i++) {
      if(array[i] != 0){
        return false;
      }
    }
    return true;
  }

  public void add(double val){ // добавляет элемент со значением val в конец
    double[] newArr = new double[array.length + 1];
    copy(array, newArr);
    newArr[newArr.length - 1] = val;
    array = newArr;
  }

 public void removeLast(){ //удаляет последний элемент
    remove(array.length - 1);
 }

 public void remove(double val){ //удаляет только первый найденный val в массиве
    remove(indexOf(val));
 }

 public void removeAll(double val){ //удаляет все значение в массиве равные val
   for (int i = 0; i < array.length; i++) {
     remove(indexOf(val));

   }
 }

 public void replace(double val, double newVal){ //заменяет значение val в массиве на значение newVal
    set(indexOf(val), newVal);
 }


  public String toString() {
    String res = "[ ";
    for (int i = 0; i < array.length; i++) {
      res += array[i];
      if (i != array.length - 1) {
        res += ", ";
      }
    }
    res += " ]";
    return res;
  }
}



