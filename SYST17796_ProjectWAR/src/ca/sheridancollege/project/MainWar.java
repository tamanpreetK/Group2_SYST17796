package ca.sheridancollege.project;

/**
 * The main class which consists of declaring the players as objects of 
 * PlayerSub class, distribute the cards to the players and call various methods
 * to display the winners and initiate the game play
 * 
 * @authors Group 2 - Harsimar Kaur, Tamanpreet Kaur, Saumya Thakkar, Lubinda Liswaniso
 */

public class MainWar {
    public static void main(String[] args) {
        GroupOfCards deck = new GroupOfCards();
        deck.shuffle();
        PlayerSub player1 = new PlayerSub("Player 1");
        PlayerSub player2 = new PlayerSub("Player 2");
        dealCards(deck, player1, player2);
        
        PlayerSub tempPlayer = new PlayerSub();
        tempPlayer.play(player1, player2);
        
        GameSub obj = new GameSub();
        obj.declareWinner(player1, player2);
    }

    private static void dealCards(GroupOfCards deck, PlayerSub player1, PlayerSub player2) {
        while (!deck.isEmpty()) {
            player1.takeCard(deck.dealCard());
            player2.takeCard(deck.dealCard());
        }
    }
}


