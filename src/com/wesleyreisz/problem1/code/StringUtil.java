package com.wesleyreisz.problem1.code;


import java.util.HashSet;
import java.util.Set;

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
    /**
     * 1.3 Design an algorithm and write code to remove the duplicate characters in a string without using any additional buff
     */
    public static String removeDuplicateCharsInitial(String input){
        Set results = new HashSet();
        for(int i=0;i<input.length();i++){
            results.add(Character.valueOf(input.charAt(i)));
        }
        return results.toString();
    }

    public static void removeDuplicatesSolution(String input) {{
        char[] str = input.toCharArray();
        if (str == null) return;
        int len = str.length;
        if (len < 2) return;

        int tail = 1;

        for (int i = 1; i < len; ++i) {
            int j;
            for (j = 0; j < tail; ++j) {
                if (str[i] == str[j]) break;
            }
            if (j == tail) {
                str[tail] = str[i];
                ++tail;
            }
        }
        str[tail] = 0;
    }
    }


    /**
     * <My solution... it run O(n2)
     * @param set1
     * @return
     */
    public static String removeDuplicatesSolutionNew(String set1) {
        Set<Character> results = new HashSet<Character>();
        char[] inputsChars = set1.toCharArray();
        for(char chars : inputsChars){
            results.add(chars);
        }

        StringBuffer sb = new StringBuffer();
        for(Character character : results){
            sb.append(character);
        }
        return sb.toString();
    }

    public static boolean charactersAreUnique(String input) {
        boolean[]matches = new boolean[256]; //ascii character set only
        for(int i=0;i<input.length();i++){
            Character pos = input.charAt(i);
            if(matches[pos]){
                return false;
            }
            matches[pos]=true;
        }
        return true;
    }

    public static boolean charactersAreUnique1(String input){
        Set<Character>characters = new HashSet<Character>();
        for(Character character : input.toCharArray()){
            characters.add(character);
        }
        if(input.length()==characters.size()){
            return true;
        }else{
            return false;
        }
    }
}
