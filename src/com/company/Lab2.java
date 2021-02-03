package com.company;

import java.util.Scanner;

/**
 * int C5 = 1; (C = Bт);
 * int C7 = 2; (Тип = short);
 * int C11 = 1; (Обчислити суму найменших елементів кожного рядка матриці)
 */
public class Lab2 {

    public static void main(String[] args) {
        Scanner elem = new Scanner(System.in);
        System.out.println("Введіть висоту матриці");
        int height = elem.nextInt();
        System.out.println("Введіть ширину матриці");
        int wight = elem.nextInt();
        short[][] b = new short[height][wight];
        short[][] c = new short[wight][height];

        if (height <= 0 || wight <= 0) {
            System.out.println("Довжина І ширина матриці повинна бути БІЛЬША за 0.");
            System.exit(0);
        }
        // Створюємо масив В, записуючи його поелементно
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.println("Введіть елемент масиву В на позиції [" + i + "] [" + j + "]");
                short temp = elem.nextShort();
                b[i][j] = temp;
            }
        }
        // Виводимо масив В
        System.out.println("Введена матриця В:");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        // Транспонуємо матрицю В, одразу присвоюємо ці значення в матрицю С і виводим її
        System.out.println("\nТранспонована матриця В записана в матрицю С:");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = b[j][i];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        //Виконуємо пошук найменших елементів в ряді і шукаємо їх суму
        short min = 0, res = 0;
        for (int i = 0; i < c.length; i++) {
            min = 32767;
            for (int j = 0; j < c[i].length; j++) {
                if (c[i][j] < min) {
                    min = c[i][j];
                }
            }
            res += min;
        }
        System.out.println("Сума найменших елементів рядка = " + res);
    }
}
