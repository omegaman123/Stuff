package com.company;

class Bingo {
    Player[] players;


    Bingo(Player[] players) {
        this.players = players;

    }

    String play(int number) {


        String winner = "";
        for (int player = 0; player < players.length; player++) {
            players[player].markNumber(number);

        }
        for (int player = 0; player < players.length; player++) {
            if (players[player].isWinner()) {

                winner += players[player].getName() + " ";

            }

        }


        winner = winner.trim();
        return winner;
    }


}
