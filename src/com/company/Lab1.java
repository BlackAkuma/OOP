package com.company;

import java.util.Scanner;

/**
 * Номер залікової книги 331;
 * int C2 = 1; (О1 = -);
 * int C3 = 1;
 * int C5 = 1; (О2 = /);
 * int C7 = 2; (Тип = int);
 */
public class Lab1 {
    public static void main(String[] args) {

        final int C = 1;
        double S = 0;
        int temp = 0;

        Scanner sum = new Scanner(System.in);
        System.out.print("Введіть число a: ");
        int a = sum.nextInt();
        System.out.print("Введіть число n: ");
        int n = sum.nextInt();
        System.out.print("Введіть число b: ");
        int b = sum.nextInt();
        System.out.print("Введіть число m: ");
        int m = sum.nextInt();

        if ((a <= 1 && n > 0) || (b <= 0 && m >= 0)) {
            System.out.println("В одному з кроків відбувається ділення на 0.");
            System.exit(0);
        } else if (a > n) {
            temp = a;
            a = n;
            n = temp;
        }
        if (b > m) {
            temp = b;
            b = m;
            m = temp;
        }

        for (int i = a; i <= n; i++) {
            for (int j = b; j <= m; j++) {
                S += (((double) i / (double) j) / (i - C));
            }
        }
        System.out.printf("***********************\n*                     *\n* Результат: %.2f *\n*                     *\n***********************", S);
    }
}
