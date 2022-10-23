public class Main {
    public static int sum(int numbers) {
        int sum = numbers;
        if (numbers % 4 == 0 && numbers % 100 != 0 || numbers % 400 == 0) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Не високосный год");
        }
        return sum;
    }
    public static void main(String[] args) {
        int year = 2000;
        int total = sum(year);
        System.out.println(total);
    }
}