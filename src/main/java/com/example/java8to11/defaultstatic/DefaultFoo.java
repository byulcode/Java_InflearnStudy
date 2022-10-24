package com.example.java8to11.defaultstatic;

public class DefaultFoo implements Foo {

    String name;

    public DefaultFoo(String name) {
        this.name = name;
    }

    @Override
    public void printNameUpperCase() {
        System.out.println(this.name.toUpperCase());
    }

    @Override
    public void printName() {
        System.out.println(getName());
    }

    @Override
    public String getName() {
        return this.name;
    }

}
