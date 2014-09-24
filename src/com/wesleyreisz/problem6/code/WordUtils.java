package com.wesleyreisz.problem6.code;

import java.util.HashMap;
import java.util.logging.Logger;

/**
 * Created by wesleyreisz on 9/23/14.
 */
public class WordUtils {
    private static Logger LOG = Logger.getLogger("WordUtils.class");
    public static String simpleWordReplace(String input, String target, String newWord) {
        if(input==null || target==null || newWord==null){
            LOG.fine("Null Object was passed in");
            return "";
        }

        input = input+ " ";//i'm looking for spaces, so i need to add a space at the end of the string or I'll miss last word
        StringBuilder result = new StringBuilder();
        HashMap<String,String> dictionary = new HashMap<String,String>();

        //load dictionary
        StringBuilder buffer= new StringBuilder();
        for(int i=0;i<input.length();i++){
            char charAtPosition = input.charAt(i);
            if(charAtPosition==' '){
                String tmp = buffer.toString();
                dictionary.put(tmp,tmp);
                buffer=new StringBuilder();
            }else{
                buffer.append(charAtPosition);
            }
        }

        //replace dictionary
        dictionary.remove(target);
        dictionary.put(target,newWord);

        //return result
        buffer = new StringBuilder();
        for(int i=0;i<input.length();i++){
            char charAtPosition = input.charAt(i);
            if(charAtPosition==' '){
                String tmp = dictionary.get(buffer.toString());
                result.append(tmp + " ");
                buffer = new StringBuilder();
            }else{
                buffer.append(charAtPosition);
            }
        }

        LOG.fine("String: " + input + " > " + result.toString().trim());//added a space so trim it.
        return result.toString().trim();
    }

    public static int binarySum(String first, String second) {
        int total = 0;
        String phrase = first + second;
        String binaryString = "";
        byte[] bytes = phrase.getBytes();
        for(byte b:bytes){
            binaryString+=Integer.toBinaryString(b);
        }
        for(int i=0;i<binaryString.length();i++){
            if(binaryString.charAt(i)=="1".charAt(0)){
                total+=1;
            }
        }

        LOG.fine("String: " + phrase + ", " + binaryString + ". count: " + total);
        return total;
    }
}
