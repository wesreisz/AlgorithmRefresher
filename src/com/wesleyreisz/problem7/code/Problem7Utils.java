package com.wesleyreisz.problem7.code;

/**
 * Created by wesleyreisz on 9/25/14.
 */
public class Problem7Utils {
    public static String findFirstNonRepeatingChar(String input) {
        if((input==null) || (input.length()<=0)){
            return "";
        }
        int[] results = new int[256]; //given an ascii char
        for(int i=0;i<input.length();i++){
            char target = input.charAt(i);
            results[target]++;
        }

        for(int i=0;i<input.length();i++){
            char target = input.charAt(i);
            if(results[target]==1){
                return String.valueOf(input.charAt(i));
            }
        }

        return "";
    }
}
