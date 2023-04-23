package ca.sheridancollege.project;
import java.util.ArrayList;

/**
 * Subclass of Player class that comprises of players information - name, 
 * cards in their hands and winning cards they collect. 
 * This class plays a key roll in determining the functioning of the game 
 * and the two players
 * 
 * @authors Group 2 - Harsimar Kaur, Tamanpreet Kaur, Saumya Thakkar, Lubinda Liswaniso
 */

public class PlayerSub extends Player {
    
    private String name;
    private ArrayList<Card> hand;
    private ArrayList<Card> winnings;
    
    public PlayerSub(){
    }

    public PlayerSub(String name) {
        this.name = name;
        hand = new ArrayList<Card>();
        winnings = new ArrayList<Card>();
    }

    public void takeCard(Card card) {
        hand.add(card);
    }

    public boolean isEmpty() {
        return hand.isEmpty();
    }

    public Card playCard() {
        return hand.remove(0);
    }

    public void addWinningCards(Card card1, Card card2) {
        winnings.add(card1);
        winnings.add(card2);
    }

    public int getWinningsCount() {
        return winnings.size();
    }

    public String getName() {
        return name;
    }
    
    @Override
    public void play(PlayerSub player1, PlayerSub player2) {
        while (!player1.isEmpty() && !player2.isEmpty()) {
            CardSub player1Card = (CardSub) player1.playCard();
            CardSub player2Card = (CardSub) player2.playCard();
            System.out.println(player1.getName() + " plays " + player1Card.toString());
            System.out.println(player2.getName() + " plays " + player2Card.toString());

            int comparison = player1Card.getRank().compareTo(player2Card.getRank());
            if (comparison > 0) {
                player1.addWinningCards(player1Card, player2Card);
                System.out.println(player1.getName() + " wins the round!");
            } else if (comparison < 0) {
                player2.addWinningCards(player1Card, player2Card);
                System.out.println(player2.getName() + " wins the round!");
            } else {
                System.out.println("War!");
                play(player1, player2);
            }
        }
    }
}


