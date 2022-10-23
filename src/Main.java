import java.time.LocalDate;

public class Main {
    public static int checkTheYear(int numbers) {
        int checkTheYear = numbers;
        if (numbers % 4 == 0 && numbers % 100 != 0 || numbers % 400 == 0) {
            System.out.print("Високосный год ");
        } else {
            System.out.print("Не високосный год ");
        }
        return checkTheYear;
    }

    public static int choosingSmartphoneYear(int a) {
        int choosingSmartphoneYear = a;
        int currentYear = LocalDate.now().getYear();
        if (a >= 2015 && a <= currentYear) {
                System.out.print("Установите версию приложения по ссылке");
        } else {
            System.out.print("Установите облегченную версию приложения по ссылке");
        }
        return choosingSmartphoneYear;
    }
    public static int choosingSmartphoneSystem(int a) {
        int choosingSmartphoneSystem = a;
        if (a == 1) {
            System.out.print(" для Андроид ");
        } else if (a == 0) {
            System.out.print(" для IOS ");
        }
        return choosingSmartphoneSystem;
    }
    public static int numberOfDeliveryDays (int deliveryDistance) {
        int numberOfDeliveryDays = 0;
        if (deliveryDistance <= 20) {
            numberOfDeliveryDays = numberOfDeliveryDays + 1;
            System.out.print("Потребуется для доставки дня - ");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            numberOfDeliveryDays = numberOfDeliveryDays + 2;
            System.out.print("Потребуется для доставки дня - ");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            numberOfDeliveryDays = numberOfDeliveryDays + 3;
            System.out.print("Потребуется для доставки дня - ");
        } else if (deliveryDistance > 100 && deliveryDistance <= 140) {
            numberOfDeliveryDays = numberOfDeliveryDays + 4;
            System.out.print("Потребуется для доставки дня - ");
        }
        return numberOfDeliveryDays;
    }

    public static void main(String[] args) {
        //задание 1
        int year = 2000;
        int conclusion = checkTheYear(year);
        System.out.println(conclusion);
        //задание 2
        int currYear = 2017;
        int clientOS = 0;
        int systemYear = choosingSmartphoneYear(currYear);
        int systemOS = choosingSmartphoneSystem(clientOS);
        System.out.println(systemYear + systemOS);
        //задание 3
        int deliveryDistance = 100;
        int numberOfDeliveryDays = numberOfDeliveryDays(deliveryDistance);
        System.out.println(numberOfDeliveryDays);

    }
}