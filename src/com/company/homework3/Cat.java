package com.company.homework3;

public class Cat {

    String name;
    int age;
    double weight;

    public boolean equals(Object o) {
        if (o instanceof Cat){
            Cat cat = (Cat) o;
            return this.age == cat.age && this.weight == cat.weight;
        }
        return false;
    }
    public String toString(){
        return "Cat: " +this.name + ", age " + this.age +", weight " + this.weight;
    }


}

