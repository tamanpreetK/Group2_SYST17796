package ca.sheridancollege.project;

/**
 * Subclass of Game class that comprises a method to display the winner of 
 * the game, the method is later called in the Main class. 
 * The method has been created in this subclass to implement high cohesion and
 * loose coupling principles.
 * 
 * @authors Group 2 - Harsimar Kaur, Tamanpreet Kaur, Saumya Thakkar, Lubinda Liswaniso
 */

public class GameSub extends Game {
    
    @Override
    public String declareWinner(PlayerSub player1, PlayerSub player2) {
        if (player1.isEmpty()) {
            return player2.getName() + " wins the game!";
        } else {
            return player1.getName() + " wins the game!";
        }
    }
}