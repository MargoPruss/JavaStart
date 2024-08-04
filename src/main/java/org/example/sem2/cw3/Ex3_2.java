package org.example.sem2.cw3;

import java.util.Scanner;

public class Ex3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stroka = scanner.nextLine().replaceAll("\\s", "").toLowerCase();
        if (stroka.equals(
                new StringBuilder(stroka).reverse().toString())
        ) {
            System.out.println("палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }
}
