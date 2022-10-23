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

    public static int choosingSmartphoneSystem(int a, int b) {
        int currentYear = LocalDate.now().getYear();
        if (a >= 2015 && a <= currentYear) {
            if (b == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (b == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (b == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (b == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        return choosingSmartphoneSystem(a,b);
    }
    public static void main(String[] args) {
        //задание 1
        int year = 2000;
        int conclusion = checkTheYear(year);
        System.out.println(conclusion);
        //задание 2
        int currYear = 2010;
        int clientOS = 1;
        int systemOS = choosingSmartphoneSystem(currYear, clientOS);
        System.out.println(systemOS);
    }
}