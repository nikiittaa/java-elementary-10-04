package com.company;

import java.util.Scanner;

public class homeWork2 {
    static private String result;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(getString(scanner));
        System.out.print(getStringBuilder(scanner));

    }

    private static String getString(Scanner sc){
        result = "";
        while (true) {
            String s = sc.nextLine();
            if (s.equals("хватит")) {
                result = result.substring(0,result.length()-1);
                break;
            }
            result = result + s + ",";
        }
        return result;
    }

    private static String getStringBuilder(Scanner sc){
        StringBuilder str = new StringBuilder();
        String s = "";
        while (true) {
            s = sc.nextLine();
            if (s.equals("хватит")) {
                break;
            }
            str.append(s).append(",");
        }
        return str.substring(0, str.length() -1);
    }
}

