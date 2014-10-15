package com.wesleyreisz.problem10.code;

/**
 * Created by wesleyreisz on 10/14/14.
 */
public class StringUtilA {
    public static String getFirstNonRepeatingCharacter(String input) {
        int[] values = new int[256];//must be an ascii character
        for(int i=0;i<input.length();i++){
            char val = input.charAt(i);
            values[val]++;
        }

        for(int i=0;i<input.length();i++){
            char val = input.charAt(i);
            if(values[val]==1){
                return String.valueOf(val);
            }
        }
        return "";//if no match is found
    }

    public static String getLastNonRepeatingCharacter(String input) {
        int[] values = new int[256];
        for(int i=0;i<input.length();i++){
            char val = input.charAt(i);
            values[val]++;
        }
        for(int i=input.length()-1;i>=0;i--){
            char val = input.charAt(i);
            if(values[val]==1){
                return String.valueOf(val);
            }
        }
        return "";
    }
}
