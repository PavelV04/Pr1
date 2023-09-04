package _1pract;
import java.util.Scanner;
public class _4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = sc.nextInt();
        int[] mas = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            mas[i] = sc.nextInt();
        }
        int s = 0;
        int max = mas[0];
        int min = mas[0];
        int i = 0;
        while (i < size) {
            s += mas[i];
            if (mas[i] > max) {
                max = mas[i];
            }
            if (mas[i] < min) {
                min = mas[i];
            }
            i++;
        }
        System.out.println("Сумма элементов массива: " + s);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }
}