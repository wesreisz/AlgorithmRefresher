package com.wesleyreisz.problem9.code;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Created by wesleyreisz on 9/25/14.
 */
public class HistrogramUtil {
    public static Map<String,Integer> makeHistogram(String input){
        //input = *; //write regex to strip all special, not word characters
        HashMap results = new HashMap<String, Integer>();
        StringTokenizer stringTokenizer = new StringTokenizer(input);
        while (stringTokenizer.hasMoreTokens()){
            String token = stringTokenizer.nextToken();
            if(results.get(token)==null){
                results.put(token, Integer.parseInt("1"));
            }else{
                Integer val = (Integer)results.get(token);
                val = val +1;
                results.put(token, val);
            }
        }
        return results;
    }
}
