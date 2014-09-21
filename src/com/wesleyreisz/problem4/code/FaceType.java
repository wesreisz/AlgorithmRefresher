package com.wesleyreisz.problem4.code;

/**
 * Created by wesleyreisz on 9/21/14.
 */
public enum FaceType {
    ACE("Ace"), KING("King"), QUEEN("Queen"), JACK("Jack"), TEN("10"),
    NINE("9"), EIGHT("8"), SEVEN("7"), SIX("6"), FIVE("5"), FOUR("4"),
    THREE("3"), TWO("2");
    private String description="";

    FaceType(String description){
        this.description=description;
    }

    public String getDescription(){
        return description;
    }
}
