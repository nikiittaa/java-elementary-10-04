package com.company.homework3;

public class Dogs {
    public static void main(String[] args) {
        Dog bobby = new Dog();
        bobby.strength = 10;
        bobby.weight= 23;
        bobby.name = "bobby";

        Dog sharik = new Dog();
        sharik.strength = 8;
        sharik.weight = 30;
        sharik.name = "sharik";


        bobby.fight(sharik);
    }
}
