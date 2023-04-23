package ca.sheridancollege.project;

import ca.sheridancollege.project.CardSub.Rank;
import ca.sheridancollege.project.CardSub.Suit;
import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. 
 * @author Harsimar Kaur, Tamanpreet Kaur, Saumya Thakkar, Lubinda Liswaniso
 */
 
public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;

    public GroupOfCards() {
        cards = new ArrayList<Card>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new CardSub(rank, suit));
            }
        }
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }
    
    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public Card dealCard() {
        return cards.remove(0);
    }
}
