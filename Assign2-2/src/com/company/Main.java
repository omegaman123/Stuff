package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();

        int col = sc.nextInt();

        int matrix[][] = new int[row][col];



        for (int i = 0; i < row; i++) {
            for (int f = 0; f < col; f++) {
                matrix[i][f] = sc.nextInt();
            }
        }
        char action;

        char[] performAction = new char[4];
        int index = 0;
        loop:
        while(true){
            action = sc.next().charAt(0);

            switch(action){
                case 'Q':
                    break loop;
                case 'R':
                case 'C':
                case 'T':
                    performAction[index] = action;
                    index++;
                    break;
                default:
                    System.out.println("No such choice");
            }
        }

        for(int i = 0; i < performAction.length-1; i++) {

            switch (performAction[i]) {
                case 'R':
                    rowMultiply(copyMatrix(matrix));
                    break;
                case 'C':
                    colMin(copyMatrix(matrix));
                    break;
                case 'T':
                    transposeMatrix(copyMatrix(matrix));
                    break;
            }
        }


    }

    private static int[][] copyMatrix(int[][] x) {

        int[][] copy = new int[x.length][x[0].length];
        for (int i = 0; i < copy.length; i++) {
          copy[i] = Arrays.copyOf(x[i],x[i].length);
        }

        return copy;
    }

   private static void rowMultiply(int[][] x) {
        int product[] = new int[x.length];
        for (int row = 0; row < x.length; row++) {
            product[row] = x[row][0];
            for (int col = 1; col < x[0].length; col++) {
                product[row] = product[row]*x[row][col];
            }
            System.out.print(product[row]);
            if (row<x.length-1)
                System.out.print(" ");

        }
        System.out.println("");
    }


     private static void colMin(int[][] x) {

        int min[] = new int[x[0].length];
        for (int col = 0; col < x[0].length; col++) {
            min[col] = Integer.MAX_VALUE;
            for (int row = 0; row < x.length; row++){
                min[col] = Math.min(x[row][col],min[col]);

            }
            System.out.print(min[col]);
            if (col<x[0].length-1)
                System.out.print(" ");
        }
        System.out.println("");
    }


   private static void transposeMatrix(int[][] x) {
        for (int col = 0; col < x[0].length; col++) {

            for (int row = 0; row < x.length; row++) {
                System.out.print(x[row][col]);
                if (row < x.length-1)
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }





}
