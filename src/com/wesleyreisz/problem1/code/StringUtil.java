package com.wesleyreisz.problem1.code;


public class StringUtil {
    /**
     * 1.1 Implement an algorithm to determine if a string has all unique characters. What if you can not use additional
     * data structures?
     * time complexity is O(n)
     * space complexity is O(n)
     */
    public static boolean isUnique(String input){
        boolean[] char_set = new boolean[256]; //assumes ascii
        for (int i = 0; i < input.length(); i++) {
           int val = input.charAt(i);
           if (char_set[val]){
               return false;
           }
           char_set[val] = true;
        }
        return true;
    }
}
