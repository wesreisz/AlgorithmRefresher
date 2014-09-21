package com.wesleyreisz.problem4.code;

/**
 * Created by wesleyreisz on 9/21/14.
 */
public class Card {
    private SuitType suit;
    private FaceType face;

    public Card(){}
    public Card(SuitType suit, FaceType face){
        this.suit=suit;
        this.face=face;
    }
    public SuitType getSuit() {
        return suit;
    }

    public void setSuit(SuitType suit) {
        this.suit = suit;
    }

    public FaceType getFace() {
        return face;
    }

    public void setFace(FaceType face) {
        this.face = face;
    }

    @Override
    public String toString(){
        return face.getDescription() + " of " + suit.getDescription();
    }
}
