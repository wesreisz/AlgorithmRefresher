package com.wesleyreisz.problem14.code;

/**
 * Created by wesleyreisz on 10/20/14.
 */
public class NonRepeatingUtil {
    public static String getFirstNonRepeatingChar(String input) {
        if(input==null || input.length()<=0){
            return "";
        }

        int[] characterCount = new int[256];
        for(int i=0;i<input.length();i++){
            int character = input.charAt(i);
            characterCount[character]++;
        }

        for(int i=0;i<input.length();i++){
            int character = input.charAt(i);
            if(characterCount[character]==1){
                return String.valueOf(input.charAt(i));
            }
        }

        return "";
    }
}
