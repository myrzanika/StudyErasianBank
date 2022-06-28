package com.company;

public class Person {
    protected int height;
    protected float weight;
    //private

    Person(){
        this.height = 180;
        this.weight = 60;
    }

    Person(int height, int weight){
        this.height = height;
        this.weight = weight;
    }

    void say(String str){
        System.out.println(str);
    }

}
