package org.example;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Evaluate<Integer> evaluate = new Evaluate<Integer>() {
            @Override
            public boolean isNegative(Integer i) {
                return i < 0;
            }
        };
        System.out.println(evaluate.isNegative(-19));
        Evaluate<Integer> evaluate1 = (i) -> {
            return i < 0;
        };
        System.out.println(evaluate1.isNegative(-19));
        Predicate<Integer> predicate = (i) -> {
            return i < 0;
        };
        System.out.println(predicate.test(10));
    }
}
