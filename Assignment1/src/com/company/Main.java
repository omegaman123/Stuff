package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String str = sc.nextLine();
        char c = str.charAt(0);
        double num = sc.nextFloat();

        toCel(c, num);

    }


    public static void toCel(char type, double number) {

        double celsius;
        if (type == 'k' || type == 'K') {

            celsius = number - 273.15;

            System.out.printf("%.2f", celsius);
            System.out.println(" ");
        }

        if (type == 'f' || type == 'F') {

            number = (float) (number - 32) * (.5556);
            celsius = number;

            System.out.printf("%.2f", celsius);
            System.out.println(" ");
        }


    }
}
