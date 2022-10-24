package com.example.java8to11;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functional {

    public static void main(String[] args) {
        System.out.println("Function<T, R>");
        Function<Integer, Integer> plus10 = (i) -> i + 10;
        Function<Integer, Integer> multiply2 = (i) -> i * 2;

        System.out.println("기본 사용 - apply");
        System.out.println(plus10.apply(2));
        System.out.println(multiply2.apply(2));

        Function<Integer, Integer> multiply2plus10 = plus10.compose(multiply2);
        Function<Integer, Integer> plus10multiply2 = plus10.andThen(multiply2);

        System.out.println("함수 조합용 메소드 - compose, andThen");
        System.out.println(multiply2plus10.apply(2));
        System.out.println(plus10multiply2.apply(2));

        System.out.println("Consumer<T>");
        Consumer<Integer> printT = (i) -> System.out.println(i);
        printT.accept(10);

        System.out.println("Supplier<T>");
        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10.get());

        System.out.println("Predicate<T>");
        Predicate<String> startsWithStar = (s) -> s.startsWith("star");
        Predicate<Integer> isEven = (i) -> i % 2 == 0;
        System.out.println(isEven.test(3));
    }
}
