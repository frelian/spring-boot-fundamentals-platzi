package com.fundamentosplatzi.springboot.fundamentos.component;


import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements ComponentDependency {

    @Override
    public void greet() {
        System.out.println("Hello from second component !");
    }
}
