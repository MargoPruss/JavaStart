package org.example.sem3.hw3;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Ex3 {
    /**
     * Реализуйте метод, который принимает на вход целочисленный массив arr:
     * - Создаёт список ArrayList, заполненный числами из исходого массива arr.
     * - Сортирует список по возрастанию и выводит на экран.
     * - Находит минимальное значение в списке и выводит на экран - Minimum is {число}
     * - Находит максимальное значение в списке и выводит на экран - Maximum is {число}
     * - Находит среднее арифметическое значений списка и выводит на экран - Average is = {число}
     * Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:
     *
     * Integer[] arr - массив целых чисел.
     */
    static class Answer {
        public static void analyzeNumbers(Integer[] arr) {
            // Введите свое решение ниже
            ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
            Collections.sort(list);
            System.out.println(list);
            int min = Collections.min(list);
            System.out.println("Minimum is " + min);
            int max = Collections.max(list);
            System.out.println("Maximum is " + max);
            double sum = 0;
            for (int num : list){
                sum += num;
            }
            double average = sum / list.size();
            System.out.println("Average is " + average);
        }
    }

    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public static class Printer{
        public static void main(String[] args) {
            Integer[] arr = {};

            if (args.length == 0) {
                // При отправке кода на Выполнение, вы можете варьировать эти параметры
                arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
            }
            else{
                arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
            }

            Answer ans = new Answer();
            ans.analyzeNumbers(arr);
        }
    }
}
