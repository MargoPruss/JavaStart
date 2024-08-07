package org.example.sem6.cw1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex1_1 {
    public static void main(String[] args) {
        int[] array = fillArray(1000, 25);
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
        System.out.println(getUniquePercent(array) + "%");
    }

    public static int[] fillArray(int size, int bound) {
        Random rnd = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(bound);
        }
        return arr;
    }

    public static float getUniquePercent(int[] arr) {
        Set<Integer> uniqueValue = new HashSet<>();
        for (int el : arr) {
            uniqueValue.add(el);
        }
        return uniqueValue.size() * 100f / arr.length;
    }
}
