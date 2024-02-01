package homework56;

import java.util.Arrays;
import java.util.List;

public class Main01 {
/*
Подсчитать сколько раз слово встречается в списке строк
 */

  public static void main(String[] args) {
    List<String> list = List.of("Под лунным светом река тихо плещется, звезды мерцают на небесном своде, и сердце наполняется спокойствием и воспоминаниями");

    long wordsAmount = list.stream()
        .flatMap(line -> Arrays.stream(line.split("\\s+"))) // Разбиваем каждую строку на слова
        .count();

    System.out.println(wordsAmount);
  }
}

/*
лямбда-выражение принимает каждый элемент строку line из списка строк list,
разбивает её на слова с помощью метода split("\\s+");

Arrays.stream() создает поток слов из полученного массива;

.flatMap() преобразует каждый элемент потока в новый поток и объединяет их в один общий поток

Поток слов содержит все слова строки.

 */
