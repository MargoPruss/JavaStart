package org.example.sem3.cw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex3 {
    /**
     * Заполнить список названиями планет Солнечной
     * системы в произвольном порядке с повторениями.
     * Вывести название каждой планеты и количество его
     * повторений в списке.
     * Пройти по списку и удалить повторяющиеся элементы.
     */
    public static void main(String[] args) {
        List<String> planets = new ArrayList<>();
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Плутон");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер спика: ");
        int n = scanner.nextInt();
        List<String> rndPlanets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            rndPlanets.add(planets.get((int)((Math.random() * planets.size()))));
        }
        System.out.println(rndPlanets);
        Collections.sort(rndPlanets);
        int count = 0;
        for (int i = 0; i < rndPlanets.size() - 1; i++) {
            if (rndPlanets.get(i).equals(rndPlanets.get(i + 1))) {
                count++;
            } else {
                System.out.println("Планета " + rndPlanets.get(i) + " встретилась " + count + " раз(а)");
                count = 1;
            }
        }
        List<String> uniqueList = new ArrayList<>();
        for (int i = 1; i < rndPlanets.size(); i++) {
            if (! rndPlanets.get(i).equals(rndPlanets.get(i - 1))) {
                uniqueList.add(rndPlanets.get(i - 1));
            }
        }
        System.out.println(uniqueList);
        scanner.close();
    }
}
