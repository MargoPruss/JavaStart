package org.example.sem2.cw1;

import java.util.Scanner;

public class Ex1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str1 = "c1";
        String str2 = "c2";
        String res = (str1 + str2).repeat(n / 2);
        System.out.println(res);
    }
}