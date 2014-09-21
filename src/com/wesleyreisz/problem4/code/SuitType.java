package com.wesleyreisz.problem4.code;

/**
 * Created by wesleyreisz on 9/21/14.
 */
public enum SuitType {
    CLUB("Clubs"), HEART("Hearts"), SPADE("Spades"), DIAMOND("Diamonds");
    private String description="";
    SuitType(String s){
        this.description=s;
    }

    public String getDescription(){
        return description;
    }
}
