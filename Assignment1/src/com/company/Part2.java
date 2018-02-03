package com.company;

import java.util.Scanner;

public class Part2 {

    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();


    public static void testnum(int x, int y, int z){

        boolean test;

        if (x < y && y < z){

            test = true;
            System.out.printf("%.2f", test);
        }

        else if (x > y && y > z){
            test = true;
            System.out.printf("%.2f", test);

        }
        else {
            test = false;
            System.out.printf("%.2f", test);
        }
    }


}
