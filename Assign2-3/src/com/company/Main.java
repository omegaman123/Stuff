package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] ar = new String[n];
        for (int i = 0;i<ar.length;i++){
            ar[i] = sc.next();

        }

        Words(ar);

    }

    public static void Words(String[] str) {

        int count = str.length;


        for (int i = 0; i < str.length; i++) {
            for (int j = 1;j < str[i].length();j++){
                if (str[i].charAt(j)==str[i].charAt(j-1))
                    count--;
            }
        }
        System.out.println(count);

    }

    }




