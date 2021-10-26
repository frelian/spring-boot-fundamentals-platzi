package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBean2Implement implements MyBean {
    @Override
    public void print() {
        System.out.println("Hello from my own bean implementation 2 of bean 2");
    }
}
