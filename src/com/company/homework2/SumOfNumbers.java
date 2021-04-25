package com.company.homework2;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res = 0;

        while (true) {
            String s = scanner.nextLine();
            if (s.equals("Стоп")) {
                break;
            }
            res += Integer.parseInt(s);

        }
        System.out.println(res);
    }

}




