package com.company;

class Card {
    int[][] card = new int[5][5];

    public Card(int[][] numbers) {
        for (int row = 0; row < card.length; row++) {
            for (int col = 0; col < card[0].length; col++) {

                card[row][col] = numbers[row][col];
            }
        }

    }

   public void markNumber(int number) {
        for (int row = 0; row < card.length; row++) {
            for (int col = 0; col < card[0].length; col++) {
                if (card[row][col] == number) {
                    card[row][col] = -1;
                }
            }
        }
    }

   public boolean isMarked(int row, int col) {

        if (card[row][col] == -1) {
            return true;
        }

        return false;
    }

}

