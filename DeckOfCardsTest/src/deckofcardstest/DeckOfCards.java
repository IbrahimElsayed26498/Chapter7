/*
In the name of Allah, the Gracious, the Merciful
 */
package deckofcardstest;

import java.security.SecureRandom;

/**
 *
 * @author ibrahim
 */
public class DeckOfCards {
    private Card[] deck;//array of card objects
    private int currentCard;
    private static final int NUMBER_OF_CARDS=52;
    private static final SecureRandom randomNumber = new SecureRandom();
    
    //constructor fills deck of Cards
    public DeckOfCards(){
        String[] faces = {"Ace","Deuce","Three","Four","Five","Six","Seven",
        "Eight","Nine","Ten","Jack","Queen","King"};
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        //give the array a size
        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;
        //populate (fill) deck with card objects
        for(int count=0; count<deck.length;count++){
            deck[count] = new Card(faces[count%13],suits[count/13] );
        }        
    }
    
    //shuffle deck of cards with one-pass algorithm
    public void shuffle(){
        currentCard =0;
        
        for(int first = 0; first<deck.length;first++){
            int second = randomNumber.nextInt(NUMBER_OF_CARDS);
            
            //swaping
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }
    
    //deal one card
    public Card dealCard(){
        if(currentCard<deck.length)
            return deck[currentCard++];
        else
            return null;
    }
}
