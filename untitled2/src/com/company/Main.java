package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(number);

        String str = sc.next();
        char c = str.charAt(0);
        System.out.println(c);
        System.out.println(str);

        String str2 = sc.nextLine();
        System.out.println(str2);
    }
}
