package com.company;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int power = sc.nextInt();
        int terms = sc.nextInt();

        euler(power,terms);


    }


    public static int factorial(int x) {

        int num = x;
        if (x == 1)
            return 1;
        num = num * factorial(x - 1);
        return num;
    }


    public static void euler(int power, int terms) {
        double ans = 0;
        if (terms == 1) {
            ans += 1;
            System.out.printf("%.2f", ans);
        } else if (terms == 2) {
            ans += power + 1;
            System.out.printf("%.2f", ans);
        } else {
            for (int x = 3; x <=terms; x++) {
            ans += pow(power,x-1)/factorial(x-1);
            }
            ans+=power+1;
            System.out.printf("%.2f", ans);

        }
    }
}


