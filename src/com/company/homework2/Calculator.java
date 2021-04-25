package com.company.homework2;

public class Calculator {
    public static void main(String[] args) {

        int num = Integer.parseInt(args[0].toString());
        String symvol = args[1];
        int num1 = Integer.parseInt(args[2]);

        if (symvol.equals("+")) {
            System.out.println(num + symvol + num1 + "=" + (num + num1));
        }
        if (symvol.equals("*")) {
            System.out.println(num + symvol + num1 + "=" + (num * num1));
        }
        if (symvol.equals("-")) {
            System.out.println(num + symvol + num1 + "=" + (num - num1));
        }
        if (symvol.equals("/")) {
            System.out.println(num + symvol + num1 + "=" + (num / num1));
        }
    }
}
