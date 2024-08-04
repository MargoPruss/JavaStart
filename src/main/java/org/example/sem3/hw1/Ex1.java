package org.example.sem3.hw1;

import java.util.Arrays;

public class Ex1 {
    /**
     * Внутри класса MergeSort напишите метод mergeSort,
     * который принимает массив целых чисел, реализует
     * алгоритм сортировки слиянием. Метод должен
     * возвращать отсортированный массив.
     */
}
    class MergeSort {
        public static int[] mergeSort(int[] a) {
            // Напишите свое решение ниже
            if (a.length <= 1) {
                return a;
            }
            int mid = a.length / 2;
            int[] left = Arrays.copyOfRange(a, 0, mid);
            int[] right = Arrays.copyOfRange(a, mid, a.length);
            left = mergeSort(left);
            right = mergeSort(right);
            return merge(left, right);
        }
        public static int[] merge(int[] left, int[] right){
            int[] merged = new int[left.length + right.length];
            int leftIndex = 0, rightIndex = 0, mergedIndex = 0;
            while (leftIndex < left.length && rightIndex < right.length){
                if (left[leftIndex] < right[rightIndex]){
                    merged[mergedIndex++] = left[leftIndex++];
                }else {
                    merged[mergedIndex++] = right[rightIndex++];
                }
            }
            while (leftIndex < left.length){
                merged[mergedIndex++] = left[leftIndex++];
            }
            while (rightIndex < right.length){
                merged[mergedIndex++] = right[rightIndex++];
            }
            return merged;
        }
    }


    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    class Printer {
        public static void main(String[] args) {
            int[] a;

            if (args.length == 0) {
                // При отправке кода на Выполнение, вы можете варьировать эти параметры
                a = new int[]{5, 1, 6, 2, 3, 4};
            } else {
                a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            }

            MergeSort answer = new MergeSort();
            String itresume_res = Arrays.toString(answer.mergeSort(a));
            System.out.println(itresume_res);
        }
    }
