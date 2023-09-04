package _1pract;

public class _3 {
    public static void main(String[] args) {
        int[] mas = {2, 9, 6, 4, 5, 7};
        int a = 0;
        double b = 0;
        for (int i = 0; i < mas.length; i++) {
            a += mas[i];
        }
        b = (double) a / mas.length;
        System.out.println("Сумма элементов массива: " + a);
        System.out.println("Cреднее арифметическое: " + b);
    }
}

