package com.company;

class Player {
    String name;
    Card[] cards;


    public Player(String name, Card[] cards) {
        this.name = name;
        this.cards = cards;

    }

   public String getName() {

        return name;

    }

    public void markNumber(int number) {
        for (int card = 0; card < cards.length; card++) {
            cards[card].markNumber(number);
        }


    }

    public boolean isWinner() {
        int count = 0;
        for (int card = 0; card < cards.length; card++) {
            for (int row = 0; row < 5; row++) {
                for (int col = 0; col < 5; col++) {
                    if (cards[card].isMarked(row, col)) {
                        count++;
                    }
                }
                if (count == 5) {
                    return true;
                }
                count = 0;

            }
        }

        return false;
    }

    public Card[] getCards() {


        return this.cards;
    }


}


