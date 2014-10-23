package com.wesleyreisz.problem15.code;

/**
 * Created by wesleyreisz on 10/23/14.
 */
public class StringUtilsD {
    public static String pairStar(String input) {
        StringBuilder sb = new StringBuilder();
        if(input==null || input.length()==0){
            return "";
        }
        for(int i = 0; i<input.length();i++){
            char first=input.charAt(i);
            char second='0';

            if(i!=input.length()-1){
                second = input.charAt(i+1);
                if(first==second){
                    sb.append(String.valueOf(input.charAt(i))+"*");
                }else{
                    sb.append(String.valueOf(input.charAt(i)));
                }
            }else{
                sb.append(String.valueOf(input.charAt(i)));
            }

        }
        return sb.toString();
    }
}
