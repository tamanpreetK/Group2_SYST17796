/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * @author Harsimar Kaur, Tamanpreet Kaur, Saumya Thakkar, Lubinda Liswaniso, Kush Deepakbhai Patel 6 March 2023
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 * @author Harsimar Kaur, Tamanpreet Kaur, Saumya Thakkar, Lubinda Liswaniso, Kush Deepakbhai Patel 6 March 2023
 */
public abstract class Card {
    //default modifier for child classes

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    @Override
    public abstract String toString();

}
