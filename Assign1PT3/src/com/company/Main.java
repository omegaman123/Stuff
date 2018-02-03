package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();

        Bits(in);

    }


    public static void Bits(int n) {
        if (n <= 0) {
            System.out.println("Illegal input");
        } else {
            int count = 0;
            while (n > 0) {
                n = n / 2;
                count++;
            }
            System.out.println(count);
        }
    }

}
