package homework35;

public class Main01 {

  /*
Применение класса:
класс описывает свойства лампочки, его можно было бы использовать для системы по закупкам товаров для строительного магазина.
У каждого отдельного товара должен быть уникальный штри-код (barcode). Как и любой товар, лампочки обладают своей стоймостью, которая зависит
от особенностей, производителя, яркости лампочки.
У лампочек бывает разная яркость (2700-6400K),
boolean rgb - Это поле, которое хранит в себе информацию, является ли лампочка светодиодной со светодиодами разных цветов или нет (true/false). От этой особенности также может зависеть цена.

Задание:
Описать класс LightBulb (лампочка). Добавить в класс поля для цены, штрих-кода, производителя и яркости.
Создать конструктор и аксессоры: написать сеттеры только для тех полей, для которых это имеет смысл, т.е. для тех полей, которые могут изменяться.
Создать поле типа boolean, которое бы показывало, какой это тип лампочки.
   */

  public static void printInfo(LightBulb bulb) {
    System.out.println("Barcode: " + bulb.getBarCode());
    System.out.println("Manufacture: " + bulb.getManufacturer());
    System.out.println("Brightness in lumens: " + bulb.getBrightness());
    System.out.println("Is it a RGB-LED?: " + bulb.getRgb());
    System.out.println("Price in €: " + bulb.getPrice());
  }

  public static void main(String[] args) {
    LightBulb bulb01 = new LightBulb("234567", "Philips", 5500, true, 25.73);
    printInfo(bulb01);
  }
}
