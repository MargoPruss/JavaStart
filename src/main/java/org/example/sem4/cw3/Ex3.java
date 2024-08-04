package org.example.sem4.cw3;

import java.util.ArrayDeque;
import java.util.Stack;

public class Ex3 {
    /**
     * 1) Написать метод, который принимает массив элементов, помещает их в стэк
     * и выводит на консоль содержимое стэка.
     * 2) Написать метод, который принимает массив элементов, помещает их в
     * очередь и выводит на консоль содержимое очереди.
     */
    public static void main(String[] args) {
        String[] str = {"str1", "str2", "str3", "str4"};
        Stack<String> stack1 = new Stack<>();
        for (int i = 0; i < str.length; i++) {
            stack1.push(str[i]);
        }
        while (!stack1.isEmpty()){
            System.out.println(stack1.pop());
        }
        System.out.println();
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < str.length; i++) {
            arrayDeque.offer(str[i]);
        }
        while (!arrayDeque.isEmpty()){
            System.out.println(arrayDeque.poll());
        }
    }
}
