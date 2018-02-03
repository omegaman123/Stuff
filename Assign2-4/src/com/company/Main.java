package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();

        int col = sc.nextInt();


        int board[][] = new int[row][col];

        for (int m = 0; m < row; m++) {
            for (int n = 0; n < col; n++) {
                board[m][n] = 0;
            }
        }

        for (int i = 0; i < row * col; i++) {
            int placedColumn = sc.nextInt();
            int placedRow;
            for (placedRow = board.length - 1; placedRow >= 0; placedRow--) {

                if (board[placedRow][placedColumn] == 0) {
                    break;
                }
            }
            if (i % 2 == 0) {
                board[placedRow][placedColumn] = 1;
            } else {
                board[placedRow][placedColumn] = 2;
            }
            //printBoard(board);
            if (Victory(board, 2)) {
                System.out.println("John Wins!");
                System.exit(0);

            }
            if (Victory(board, 1)) {
                System.out.println("Lise Wins!");
                System.exit(0);
            }

        }
        System.out.println("It's a tie.");
        System.exit(0);
    }

    private static boolean Victory(int[][] board, int player) {


        for (int row = 0; row < board.length; row++) {
            int count = 0;
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == player) {
                    count++;
                } else {
                    count = 0;
                }
                if (count == 4) {
                    return true;
                }
            }

        }

        for (int col = 0; col < board[0].length; col++) {
            int count = 0;
            for (int row = 0; row < board.length; row++) {
                if (board[row][col] == player) {
                    count++;
                } else {
                    count = 0;
                }

                if (count == 4) {
                    return true;
                }

            }

        }
        for (int k = 0; k < board[0].length - 3; k++) {

            for (int j = 0; j < board.length - 3; j++) {
                int count = 0;
                for (int i = 0; i < board.length; i++) {

                    if ((i + j) > board.length - 1 || (i + k) > board[0].length - 1) {
                        break;
                    }

                    if (board[i + j][i + k] == player) {
                        count++;
                    } else {
                        count = 0;
                    }
                    if (count == 4) {
                        return true;
                    }
                }
            }
        }
        for (int k = board[0].length - 1; k > 2; k--) {
            for (int j = 0; j < board.length - 3; j++) {
                int count = 0;
                for (int i = 0; i < board.length; i++) {
                    if ((i + j) > board.length - 1 || (k - i) < 0) {
                        break;
                    }
                    if (board[i + j][k - i] == player) {
                        count++;
                    } else {
                        count = 0;
                    }
                    if (count == 4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    private static void printBoard(int[][] board) {

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println("");
        }

    }


}
