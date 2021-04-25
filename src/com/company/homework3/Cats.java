package com.company.homework3;

public class Cats {
    public static void main(String[] args) {
        Cat asya = new Cat();
        asya.age = 4;
        asya.name = "asya";
        asya.weight = 1F;

        Cat mysya = new Cat();
        mysya.age = 5;
        mysya.name = "mysya";
        mysya.weight = 2F;
/*
        Cat masya = new Cat();
        masya.age = 4;
        masya.name = "masya";
        masya.weight = 1F;

        Cat pysya = new Cat();
        pysya.age = 4;
        pysya.name = "pysya";
        pysya.weight = 1F;
*/

        System.out.println(asya);
        System.out.println(mysya);

        System.out.println("Сat comparison result : " + asya.equals(mysya));
     //   System.out.println("Сat comparison result : " + masya.equals(pysya));

    }


}
