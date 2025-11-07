import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println(" Задача 1 ");
        int year = 2204;
        checkYears(year);

        System.out.println(" Задача 2 ");
        int clientOS = 0;
        int clientDeviceYear = 2014;
        checkOC(clientOS,clientDeviceYear);

        System.out.println(" Задача 3 ");
        int deliveryDistance = 95;
        checkDistance(deliveryDistance);
    }
    public static void checkYears(int year) {

        if (year < 1584) {
            System.out.println(year + " год не является високосным");
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void checkOC( int clientOS, int clientDeviceYear) {

        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        } else {
            System.out.println("Выберете корректную OS из списка");
        }


    }

    public static void checkDistance(int deliveryDistance) {

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