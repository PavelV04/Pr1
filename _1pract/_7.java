package _1pract;
import java.util.Scanner;
public class _7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = sc.nextInt();
        long factorial = factorial(num);
        System.out.println("Факториал " + num + " равен: " + factorial);
    }

    public static long factorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}