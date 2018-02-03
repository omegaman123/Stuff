package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char c = str.charAt(0);
        float num = sc.nextFloat();

        toCel(c, num);

    }
    public static void toCel(char type, float num) {

        float celsius;

        if (type == 'f' || type == 'F') {
            celsius = (num - 32) * (float) (.5556);
            System.out.printf("%.2f", celsius);
            System.out.println("  ");
        } else if (type == 'k' || type == 'K') {
            celsius = num - (float) 273.15;
            System.out.printf("%.2f", celsius);
            System.out.println("  ");
        }
    }
}
