package org.example.sem2.cw1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        shuffleline(n);
    }

    private static void shuffleline(int n) {
        String str1 = "c1";
        String str2 = "c2";
        String res = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0){
                res += str1;
            } else {
                res += str2;
            }
        }
        System.out.println(res);
    }
}
