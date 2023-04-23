package ca.sheridancollege.project;

import ca.sheridancollege.project.CardSub.Rank;
import ca.sheridancollege.project.CardSub.Suit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author harsi
 */
public class PlayerSubTest {
    
    public PlayerSubTest() {
    }
    
    @BeforeClass                         //shows that this method runs before all the tests begin
    public static void setUpClass() {
        System.out.println("The unit tests are going to begin");
    }
    
    @AfterClass                          //shows that this method runs after all the tests are done
    public static void tearDownClass() {
        System.out.println("All the unit tests have ended");
    }
    
    @Before                              //shows that this method runs at the beginning of each unit test method
    public void setUp() {
        System.out.println("A test method has begun.");
    }
    
    @After                               //shows that this method runs at the end of each unit test method
    public void tearDown() {
        System.out.println("A test method has ended");
    }

    /**
     * Test of play method, of class PlayerSub.
     */
    @Test
    public void testPlay() {
        PlayerSub player1 = new PlayerSub("Player 1");
        PlayerSub player2 = new PlayerSub("Player 2");
        
        player1.takeCard(new CardSub(Rank.ACE, Suit.HEARTS));
        player1.takeCard(new CardSub(Rank.TWO, Suit.HEARTS));
        player1.takeCard(new CardSub(Rank.THREE, Suit.HEARTS));
        
        player2.takeCard(new CardSub(Rank.KING, Suit.SPADES));
        player2.takeCard(new CardSub(Rank.QUEEN, Suit.SPADES));
        player2.takeCard(new CardSub(Rank.JACK, Suit.SPADES));
        
        PlayerSub game = new PlayerSub();
        game.play(player1, player2);
        
        assertTrue(player1.isEmpty());
        assertFalse(player2.isEmpty());
    }
}
