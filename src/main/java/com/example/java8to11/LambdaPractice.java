package com.example.java8to11;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class LambdaPractice {

    public static void main(String[] args) {

        LambdaPractice lambdaPractice = new LambdaPractice();
        lambdaPractice.run();
    }

    private void run() {// 변수 캡처
        int baseNumber = 10; //자바8부터는 final 생략해도 사실상 final인 경우 모두 참조 가능.

        // 로컬 클래스
        class LocalClass {
            void printBaseNumber() {
                System.out.println(baseNumber);
            }
        }

        // 익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(baseNumber);
            }
        };

        // 람다
        IntConsumer printInt = (i) -> {
            System.out.println(i + baseNumber);
        };

        printInt.accept(10);
    }
}


