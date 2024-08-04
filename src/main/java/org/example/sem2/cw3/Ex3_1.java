package org.example.sem2.cw3;

import java.util.Scanner;

public class Ex3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String input = sc.nextLine();
        boolean isPalindrome = isPolindrome(input);
        if (isPalindrome) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндром");
        }
    }

    public static boolean isPolindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
