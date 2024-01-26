package HomeWork2;

public class HomeWork2 {
    public static void main(String[] args) {

        // Пусть цена товара A обычно составляет 1000 руб,
        // и товара B составляет 500 руб. Если клиент
        // покупает товары вместе, то на них действует
        // скидка 100 руб на всю покупку. Выведите на
        // экран переменную, которая соответствует
        // стоимости суммы A+B со скидкой. Отдельно выведите
        // на экран сумму скидки от этой покупки.

        int price_A = 1000;
        int price_B = 500;
        int Discount = 100;
        System.out.println("Cумма покупки со скидкой: = " + (price_A + price_B - Discount));
        System.out.println("Сумма скидки: " + Discount);
    }
}
