package org.example.sem2.cw3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(0 + i) != str.charAt(str.length() - 1 - i)) {
                flag = false;
                break;
            }
        }
        if (flag == true){
            System.out.println("Это палиндром");
        }else {
            System.out.println("Это не палиндром");
        }
    }
}
