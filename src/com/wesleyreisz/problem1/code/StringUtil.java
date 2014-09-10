package com.wesleyreisz.problem1.code;


public class StringUtil {
    /**
     * 1.1 Implement an algorithm to determine if a string has all unique characters. What if you can not use additional
     * data structures?
     * time complexity is O(n)
     * space complexity is O(n)
     */
    public static boolean isUnique(String input){
        boolean[] charMask = new boolean[256]; //ascii characters have 256 bits
        for(int i=0; i<input.length();i++){    //loop each char in screen once O(n)
            int pos = input.charAt(i);         //get the char int val for the char @ the position
            if(charMask[pos]){                 //check if that value in the boolean area is true
                return false;                  //if it is return false... this char has been found before.
            }
            charMask[pos]=true;                //set the boolean array to true for that position.
        }
        return true;                           //return true if we haven't already returned false.
    }
    /**
     * 1.2 Write code to reverse a  String.
     */
    public static String reverse(String input){
        String result="";
        for(int i=input.length()-1;i>=0;i--){
            result+=String.valueOf(input.charAt(i));
        }
        return result;
    }
}
