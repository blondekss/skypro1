package pro.sky.java.course1.homework2;

public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }

//task 2
        int clientDeviceYear = 2015;
        if (clientOS == 1) {
            if (clientDeviceYear < 2019) {
                System.out.println("Установите lite-версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        } else {
            if (clientDeviceYear < 2019) {
                System.out.println("Установите lite-версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке.");

            }

        }

//task 3
        int year = 2300;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Високосный год.");
        } else {
            System.out.println("Год не високосный.");
        }

//task4
        int deliveryDistance = 95;
        int time = 1;
        if (deliveryDistance > 20) {
            time++;
        }
        if (deliveryDistance > 60) {
            time++;
        }
        System.out.println("Количество дней для доставки: " + time);

//task5
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            default:
                System.out.println("Осень");

        }

    }

    private static float getCreditLimit(boolean isYoung, int salary){
        float creditLimit = 0f;

        if (isYoung){
            creditLimit = salary*2;
        } else {
            creditLimit = salary*3;
        }

        if (salary > 80_000){
                creditLimit = salary*1.5f;
        } else if(salary > 50_000){
            creditLimit = salary*1.2f;
        }

        return creditLimit;
    }
}


