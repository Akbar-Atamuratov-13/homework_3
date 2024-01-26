package HomeWork2;

public class HomeWork4 {
    public static void main(String[] args) {
        // Клиент положил в банк 1250 евро под
        // 3.5 процента годовых. Создайте переменные
        // нужных типов, вычислите и распечатайте на
        // экране сумму, которая получится через 5 лет
        // с учётом "сложенных процентов"

        int client = 1250;
        double pi = 3.5;
        int age = 5;
        System.out.println("Итого с учётом \"сложенных процентов\" : " + client*pi/100*age);

    }
}
