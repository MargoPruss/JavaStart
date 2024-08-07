package org.example.sem6.cw0;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex0 {
    /**
     *1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
     * Распечатайте содержимое данного множества.
     * 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5,
     * 6, 3}. Распечатайте содержимое данного множества.
     * 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
     * Распечатайте содержимое данного множества.
     */
    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(6);
        set1.add(4);
        set1.add(2);
        set1.add(3);
        set1.add(2);
        set1.add(5);
        set1.add(3);
        System.out.println("Множество: " + set1);

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(1);
        set2.add(6);
        set2.add(4);
        set2.add(2);
        set2.add(3);
        set2.add(2);
        set2.add(5);
        set2.add(3);
        System.out.println("Множество: " + set2);

    }
}
