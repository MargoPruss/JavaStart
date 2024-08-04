package org.example.sem1.cw4;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи размер массива: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Введи значения массива: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();

        }
        isSimmetr(arr);
        System.out.println();
        System.out.println("Массив выглядит так: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    private static void isSimmetr(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                System.out.print("Несимметричный");
                return;
            }
        }
        System.out.println("Cимметричный");
    }
}
