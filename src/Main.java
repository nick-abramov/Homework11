
public class Main {
    public static void main(String[] args) {

        System.out.println(" Задача 1 ");
        checkYears();

        System.out.println(" Задача 2 ");
        checkOC();

        System.out.println(" Задача 3 ");
        checkDistance();
    }
    public static void checkYears() {
        int year = 2204;
        if (year < 1584) {
            System.out.println(year + " год не является високосным");
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void checkOC() {
        int clientOS = 0;
        int clientDeviceYear = 2014;

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        } else {
            System.out.println("Выберете корректную OS из списка");
        }

    }

    public static void checkDistance() {
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1 ");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2 ");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3 ");
        } else {
            System.out.println("Достваки нет");
        }
    }

}