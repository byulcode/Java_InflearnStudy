package com.example.java8to11;

import java.util.function.UnaryOperator;

public class App {

    public static void main(String[] args){
        UnaryOperator<String> hi = Greeting::hi;    //메소드 레퍼런스
    }
}
