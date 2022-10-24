package com.example.java8to11;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
    //메소드 레퍼런스
    public static void main(String[] args){

        UnaryOperator<String> hi = Greeting::hi;
        Greeting greeting = new Greeting();
        //메소드 참조한 것X. 이 메소드를 참조하는 UnaryOperator이 만들어진 것
        UnaryOperator<String> hello = greeting::hello;
        System.out.println(hello.apply("별"));

        // 입력값이 있는 생성자 참조
        Function<String, Greeting> byulGreeting = Greeting::new;

        //입력값 없는 생성자 참조
        Supplier<Greeting> newGreeting = Greeting::new;

        Greeting byul = byulGreeting.apply("byul");
        System.out.println(byul.getName());
    }
}
