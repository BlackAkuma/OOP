package com.company;

public class Lab1 {
    public static void main(String[] args) {
//        Номер залікової книги 331
//        int C2 = 1; (О1 = -)
//        int C3 = 1;
//        int C5 = 1; (О2 = /)
//        int C7 = 2; (Тип = int)
        System.out.println("Номер заліковки «331».");
        final int C = 1;
        int a = 2;
        int b = 1;
        int n = 5;
        int m = 5;
        double res = 0;
        if (a <= 1 || b <= 0) {
            System.out.println("В одному з кроків відбувається ділення на 0");
            System.exit(0);
        }
        for (int i = a; i <= n; i++) {
            for (int j = b; j <= m; j++) {
                res = res + ((double) (i / j) / (i - C));
            }
        }
        System.out.printf("Результат: %.2f.", res);
    }
}
