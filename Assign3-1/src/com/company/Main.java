package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[][] numbers1 =
                {{10, 30, 45, 66, 82},
                        {3, 25, 11, 63, 78},
                        {22, 4, 13, 46, 90},
                        {5, 23, 12, 6, 85},
                        {1, 88, 67, 2, 44}};

        Card[] cards1 = new Card[1];
        cards1[0] = new Card(numbers1);


        int[][] numbers2 =
                {{11, 31, 46, 67, 83},
                        {4, 26, 12, 64, 79},
                        {23, 5, 14, 47, 90},
                        {6, 24, 13, 7, 86},
                        {2, 89, 68, 3, 45}};
        System.out.println("");

        Card[] cards2 = new Card[1];

        cards2[0] = new Card(numbers2);

        Player[] players = new Player[2];
        players[0] = new Player("player1", cards1);

        players[1] = new Player("player2", cards2);

        Bingo bingo = new Bingo(players);

        Random random = new Random();
        String winner = "";

        while (winner.equals("")) {

            int number = random.nextInt(90) + 1;

            winner = bingo.play(number);
        }

        System.out.println(winner);


    }
}

