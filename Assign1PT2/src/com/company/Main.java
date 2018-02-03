package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        testnum(x,y,z);

    }

    public static void testnum(int x, int y, int z){

        boolean test;

        if (x < y && y < z){

            test = true;

        }

        else if (x > y && y > z){
            test = true;

        }
        else {
            test = false;
        }
        System.out.println(test);
    }
}
