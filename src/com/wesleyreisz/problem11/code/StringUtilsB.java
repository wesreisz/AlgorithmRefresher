package com.wesleyreisz.problem11.code;

/**
 * Created by wesleyreisz on 10/16/14.
 */
public class StringUtilsB {
    public static String findInStringA(String word, String targetString) {
        if(targetString.contains(word)){
            return word;
        }
        return "";
    }
}
