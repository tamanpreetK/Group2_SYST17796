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
public class GameSubTest {
    
    public GameSubTest() {
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
     * Test of declareWinner method, of class GameSub.
     */
    @Test
    public void testDeclareWinner() {
    PlayerSub player1 = new PlayerSub("Player 1");
    PlayerSub player2 = new PlayerSub("Player 2");

    // Test when player 1 is empty
    player1.takeCard(new CardSub(Rank.ACE, Suit.HEARTS));
    player1.playCard();
    assertTrue(player1.isEmpty());
    assertFalse(player2.isEmpty());
    GameSub instance = new GameSub();
    assertEquals("Player 2 wins the game!", instance.declareWinner(player1, player2));

    // Test when player 2 is empty
    player1.takeCard(new CardSub(Rank.ACE, Suit.HEARTS));
    player2.playCard();
    assertTrue(player2.isEmpty());
    assertFalse(player1.isEmpty());
    assertEquals("Player 1 wins the game!", instance.declareWinner(player1, player2));
}
}

