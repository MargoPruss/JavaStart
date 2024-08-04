package org.example.sem5.cw2;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Ex2 {
    /**
     * Написать программу, определяющую правильность расстановки скобок в выражении.
     * Пример 1: a+(d*3) - истина
     * Пример 2: [a+(1*3) - ложь
     * Пример 3: [6+(3*3)] - истина
     * Пример 4: {a}[+]{(d*3)} - истина
     * Пример 5: <{a}+{(d*3)}> - истина
     * Пример 6: {a+]}{(d*3)} - ложь
     */
    public static void main(String[] args) {
        System.out.println(conditionPairs("a+(d*3)"));
        System.out.println(conditionPairs("[a+(1*3)"));
        System.out.println(conditionPairs("[6+(3*3)]"));
        System.out.println(conditionPairs("{a}[+]{(d*3)}"));
        System.out.println(conditionPairs("<{a}+{(d*3)}>"));
        System.out.println(conditionPairs("{a+]}{(d*3)}"));
    }

    private static boolean conditionPairs(String str) {
        Map<Character, Character> pair = new HashMap<>();
        pair.put('(', ')');
        pair.put('{', '}');
        pair.put('[', ']');
        pair.put('<', '>');
        Stack<Character> lifo = new Stack<>();
        for (char c : str.toCharArray()) {
            if (pair.containsKey(c)){
                lifo.push(c);
            }else if (pair.containsValue(c)){
                if (lifo.isEmpty() || pair.get(lifo.pop()) != c){
                    return false;
                }
            }
        }
        return lifo.isEmpty();
    }
}
