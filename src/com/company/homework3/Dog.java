package com.company.homework3;

public class Dog {

    String name;
    int strength;
    double weight;
    String res;

    void fight(Dog dog) {
        if(this.strength > dog.strength){
            res = this.name;
        }else if(this.strength < dog.strength){
            res = dog.name;
        }else{
            res = "draw";
        }
        System.out.println("Winner is " + res);

    }



}
