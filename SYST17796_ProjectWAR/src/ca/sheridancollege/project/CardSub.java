package ca.sheridancollege.project;

/**
 * Subclass of Card class that comprises enums to store values of Ranks and Suits
 * of the cards for the players and return overriden ToString() method results
 * 
 * @authors Group 2 - Harsimar Kaur, Tamanpreet Kaur, Saumya Thakkar, Lubinda Liswaniso
 */

public class CardSub extends Card {
  
    public enum Rank {
        TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), 
        EIGHT("8"), NINE("9"), TEN("10"), JACK("J"), QUEEN("Q"), KING("K"), 
        ACE("A");

        private String symbol;

        private Rank(String symbol) {
            this.symbol = symbol;
        }

        @Override
        public String toString() {
            return symbol;
        }
    }

    public enum Suit {
    CLUBS, DIAMONDS, HEARTS, SPADES;
}
    
    private Rank rank;
    private Suit suit;

    public CardSub(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return rank.toString() + " of " + suit.toString();
    }  
}
