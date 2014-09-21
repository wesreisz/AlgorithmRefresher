package com.wesleyreisz.problem4.test;

import com.wesleyreisz.problem4.code.CardDeck;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wesleyreisz on 9/21/14.
 */
public class CardDeckTest {
    @Test
    public void testInitializeDeck(){
        CardDeck cardDeck = new CardDeck();
        Assert.assertEquals("", cardDeck.show());
    }

    @Test
    public void shuffleDeck(){
        CardDeck cardDeck = new CardDeck();
        String originalDeck = cardDeck.show();

        for(int i=0;i<100;i++){
            cardDeck.shuffle();
            String shuffledDeck = cardDeck.show();

            Assert.assertNotEquals(originalDeck,shuffledDeck);
        }
    }

    @Test
    public void shuffleDeckWithFisherYates(){
        CardDeck cardDeck = new CardDeck();
        String originalDeck = cardDeck.show();

        for(int i=0;i<100;i++){
            cardDeck.shuffle(true);
            String shuffledDeck = cardDeck.show();

            Assert.assertNotEquals(originalDeck,shuffledDeck);
            Assert.assertEquals(originalDeck.length(),shuffledDeck.length());
        }
    }
}
