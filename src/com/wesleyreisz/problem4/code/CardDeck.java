package com.wesleyreisz.problem4.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by wesleyreisz on 9/21/14.
 */
public class CardDeck {
    private List<Card> cards = new ArrayList();
    public CardDeck(){
        initDeck();
    }
    private void initDeck(){
        //create a deck of cards
        for(SuitType suitType:SuitType.values()){
            for(FaceType faceType:FaceType.values()){
                cards.add(new Card(suitType,faceType));
            }
        }
    }
    public String show(){
        StringBuilder sb = new StringBuilder();
        for(Card card:cards){
            if(sb.length()!=0){
                sb.append(", ");
            }
            sb.append(card.toString());
        }
        return sb.toString();
    }
    public void shuffle(){
        shuffle(false);
    }
    public void shuffle(boolean useFisherYates){
        if(cards==null){
            throw new RuntimeException("Must have a deck to shuffle");
        }

        if(useFisherYates){
            //fisher yates users a random number algorithm  using random number substitution
            Random random = new Random();
            for(int i=0;i<cards.size();i++){
                int posFirst = random.nextInt(cards.size());
                int posSecond = (cards.size()-1)-posFirst;
                Collections.swap(cards,posFirst,posSecond);
                //or manually something like this.
                // convert arraylist to an array and swap positions
                //  Cards[] arrCards=cards.toArray(cards.size)
                //  Card tmp = arrCards[posFirst]
                //  arrCards[posFirst]=arrCards[posSecond]
                //  arrCards[posSecond] = tmp;
                //  List<Card> tmpList = new ArrayList<Card>();
                //  for(Card c : arrCards){tmpList.add(c)}

            }
        }else{
            Collections.shuffle(cards);
        }

    }
}
