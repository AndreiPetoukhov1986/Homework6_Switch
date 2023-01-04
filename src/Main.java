public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        char clientOS = 0;
        System.out.println("Решение через if");
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Решение через switch");
    switch (clientOS){
        case 1:
            System.out.println("Установите версию приложения для Android по ссылке");
            break;
        case 0:
            System.out.println("Установите версию приложения для iOS по ссылке");
            break;
        default:
            System.out.println("Ничего не устанавливайте");
    }}

    public static void task2 () {
        System.out.println("Задача 2");
        char clientOS = 5; // 0 — iOS, 1 — Android
        char clientDeviceYear = 2015;
        switch (clientOS){
            case 1:
                if (clientDeviceYear<2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                break;
            case 0:
                if (clientDeviceYear<2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            default:
                System.out.println("Такой операционной системы не существует");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int year = 2020;
        boolean yearLeap = (year% 4==0 && year%100!=0) || year%400==0;
       if (yearLeap) {
           System.out.println(year + " год является високосным");
       } else {
           System.out.println(year + " год не является високосным");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Доставка занимает 1 сутки");
        } else if (deliveryDistance<60) {
            System.out.println("Доставка занимает 2 дня");
        } else  if (deliveryDistance<100) {
            System.out.println("Доставка занимает 3 дня");
        } else {
            System.out.println("Доставки нет");
        }
        }
        public static void task5 () {
        System.out.println("Задача 5");
        int monthNumber = 13;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Время года зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Время года весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Время года лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Время года осень");
                break;
            default:
                System.out.println("Такого времени года не сущестует");
        }
        }
    }
