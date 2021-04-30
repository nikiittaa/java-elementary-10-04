package com.company.homework2;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = scanner.nextInt();
        System.out.print("First method: ");
        System.out.println(Factorial(factorial));
        System.out.print("Second method: ");
        System.out.println(getFactorial(factorial));
    }
    public static int Factorial(int fac) {
        int result = 1;
        for (int i = 1; i <= fac ; i++) {
            result = result * i;
        }
        return result;
    }

    public static int getFactorial(int f) {
        if (f <= 1) {
            return 1;
        }
        else {
            return f * getFactorial(f - 1);
        }
    }


}
