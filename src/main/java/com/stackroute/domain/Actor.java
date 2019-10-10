package com.stackroute.domain;

import org.springframework.stereotype.Component;

@Component
public class Actor {
    private String name;
    private String gender;
    private int age;

    public void displayInfo(){

        System.out.print(name + gender + age);
    }
    public void actors(){
        System.out.println("Acting...");
    }

}