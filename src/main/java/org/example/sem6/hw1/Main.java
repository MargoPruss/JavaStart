package org.example.sem6.hw1;

import java.util.*;

public class Main {
    /**
     * Подумать над структурой класса Ноутбук для магазина
     * техники - выделить поля и методы. Реализовать в java.
     *
     * Создать множество ноутбуков.
     * Написать метод, который будет запрашивать у пользователя
     * критерий (или критерии) фильтрации и выведет ноутбуки,
     * отвечающие фильтру. Критерии фильтрации можно хранить в Map.
     * Например:
     * Введите цифру, соответствующую необходимому критерию:
     * 1 - ОЗУ
     * 2 - Объем ЖД
     * 3 - Операционная система
     * 4 - Цвет …
     * -Далее нужно запросить минимальные значения для указанных
     * критериев - сохранить параметры фильтрации можно также в Map.
     * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
     */
    public static void main(String[] args) {
        Set<Laptop> laps = new HashSet<>();
        laps.add(new Laptop("DEXP", 256, 8, "Windows", "black", 14.1));
        laps.add(new Laptop("Lenovo", 256, 4, "Windows", "grey", 15.6));
        laps.add(new Laptop("ASUS", 512, 8, "Windows", "red", 15.6));
        laps.add(new Laptop("ASUS", 512, 8, "без ОС", "white", 15.6));
        laps.add(new Laptop("Apple", 256, 8, "macOs", "white", 13.3));

        Map<Integer,String> criteria = new HashMap<>();
        criteria.put(1, "hdd");
        criteria.put(2, "ram");
        criteria.put(3, "os");
        criteria.put(4, "color");
        criteria.put(5, "diagonal");

        Scanner scanner = new Scanner(System.in);
        Map<String, String> filter = new HashMap<>();

        while (true){
            try {
                if (!filter.isEmpty()){
                    System.out.println("Выбранные критерии: ");
                    for (Map.Entry<String, String> entry : filter.entrySet()){
                        System.out.println(entry.getKey() + ":" + entry.getValue());
                    }
                }
                System.out.println("Введите критерий подбора (число): ");
                System.out.println("1 - Объем жесткого диска (256/512)" + System.lineSeparator() +
                        "2 - Объем оперативной памяти (4/8)" + System.lineSeparator() +
                        "3 - Операционная система (Windows/macOs/без Ос" + System.lineSeparator() +
                        "4 - Цвет (black/grey/red/white)" + System.lineSeparator() +
                        "5 - Диагональ (13,3/14,1/15,6)" + System.lineSeparator());
                int crit = scanner.nextInt();
                scanner.nextLine();

                if (criteria.containsKey(crit)){
                    String critString = criteria.get(crit);
                    System.out.println("Введите значение критерия: " + critString);
                    String value = scanner.nextLine();
                    filter.put(critString, value);
                } else {
                    System.out.println("Ошибка, данный критерий не найден. Введите еще раз из предложенных");
                }
                System.out.println("Еще один критерий? (да/нет)");
                String cont = scanner.nextLine();
                if (!cont.equalsIgnoreCase("да")){
                    break;
                }
            } catch (InputMismatchException e){
                System.out.println("Ошибка, попробуйте еще раз");
                scanner.nextLine();
            }
            }
        scanner.close();

        Set<Laptop> filtLap = filtLaps(new HashSet<>(laps), filter);
        if (filtLap.isEmpty()){
            System.out.println("Отсутствует искомый по заданным критериям ноутбук :(");
        } else {
            System.out.println("Подходящие Вам ноутбуки: ");
            for (Laptop laptops : filtLap){
                System.out.println(laptops);
            }
        }
        }
        public static Set<Laptop> filtLaps(Set<Laptop> laps, Map<String, String> filter){
        Set<Laptop> filtLaps = new HashSet<>(laps);
        for (Map.Entry<String, String> filEntry : filter.entrySet()){
            String keyString = filEntry.getKey();
            String valString = filEntry.getValue();
            switch (keyString){
                case "hdd":
                    int hdd = Integer.parseInt(valString);
                    filtLaps.removeIf(laptops -> laptops.getHdd() != hdd);
                    break;
                case "ram":
                    int ram = Integer.parseInt(valString);
                    filtLaps.removeIf(laptops -> laptops.getRam() != ram);
                    break;
                case "os":
                    filtLaps.removeIf(laptops -> !laptops.getOs().equalsIgnoreCase(valString));
                    break;
                case "color":
                    filtLaps.removeIf(laptops -> !laptops.getColor().equalsIgnoreCase(valString));
                    break;
                case "diagonal":
                    double diagonal = Double.parseDouble(valString);
                    filtLaps.removeIf(laptops -> laptops.getDiagonal() != diagonal);
                    break;
            }

        }
        return filtLaps;
        }
    }