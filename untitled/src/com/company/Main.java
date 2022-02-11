package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во ходов, при отрицательном значении программа не будет работать");
        int a = in.nextInt();
        System.out.println("Введите число x");
        double d = in.nextDouble();
        double sum = 0;
        if (a < 0)
            System.out.println("Отрицательное число ходов");
            // кол-во ходов
        for (int i = 0; i <= a; i++) {
            if (a < 0) {
                break;
            }
            else {
                d = 1 / ((2*i + 1) * (Math.pow(d, 2*i + 1)));
                sum += d;
                System.out.println(2*sum);
            }
        }
    }
}
