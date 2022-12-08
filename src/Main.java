public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        System.out.println("Задача 1");
        byte clientOS = 0;
        if(clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if(clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if(clientOS !=0 && clientOS !=1) {
            System.out.println("Введен неправильный номер " + clientOS + ". Введите правильный номер: 0 — iOS, 1 — Android");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        byte clientOS = 1;
        int clientDeviceYear = 2015;
        if(clientOS == 0) {
            if(clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        if(clientOS == 1) {
            if(clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        if(clientOS !=0 && clientOS !=1) {
            System.out.println("Введен неправильный номер " + clientOS + ". Введите правильный номер: 0 — iOS, 1 — Android");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int year = 1900;
        if(year % 100 != 0) {
            if (year % 4 == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else if(year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int daysToDeliver;
        if(deliveryDistance >= 0 && deliveryDistance < 20) {
            daysToDeliver = 1;
            System.out.println("Потребуется дней: " + daysToDeliver);
        }
        if(deliveryDistance >= 20 && deliveryDistance < 60) {
            daysToDeliver = 2;
            System.out.println("Потребуется дней: " + daysToDeliver);
        }
        if(deliveryDistance >= 60 && deliveryDistance <= 100) {
            daysToDeliver = 3;
            System.out.println("Потребуется дней: " + daysToDeliver);
        }
        if(deliveryDistance > 100) {
            System.out.println("Расстояние " + deliveryDistance + " км. На расстояние больше 100 км доставки нет");
        }
        if(deliveryDistance < 0) {
            System.out.println("Расстояние введено неправильно:" + deliveryDistance);
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch(monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц номер " + monthNumber + " принадлежит сезону 'Зима'");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц номер " + monthNumber + " принадлежит сезону 'Весна'");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц номер " + monthNumber + " принадлежит сезону 'Лето'");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц номер " + monthNumber + " принадлежит сезону 'Осень'");
                break;
            default:
                System.out.println("Месяц с номером " + monthNumber + " не существует");
        }
    }
}