package com.wesleyreisz.problem2.code;

import com.sun.xml.internal.ws.util.StringUtils;

/**
 * Created by wesleyreisz on 9/20/14.
 */
public class LongestCommonSubstringUtil {
    public static String compare(String first, String second) {
        if(first==null || second==null){
            return "";
        }
        first=first.toLowerCase();
        second=second.toLowerCase();

        StringBuilder sb =new StringBuilder();
        StringBuilder tmp =new StringBuilder();
        int[][]num = new int[first.length()][second.length()];
        int maxlen=0;
        int lastSubsBegin=0;

        for(int i=0;i<first.length();i++){
            for(int j=0;j<second.length();j++){
                if (first.charAt(i) == second.charAt(j)) {
                    if ((i == 0) || (j == 0)) {
                        num[i][j] = 1;
                    } else {
                        num[i][j] = 1 + num[i - 1][j - 1];
                    }

                    if (num[i][j] > maxlen) {
                        maxlen = num[i][j];
                        int thisSubsBegin = i - num[i][j] + 1;
                        if (lastSubsBegin == thisSubsBegin) {
                            //if the current LCS is the same as the last time this block ran
                            sb.append(first.charAt(i));
                        } else {
                            //this block resets the string builder if a different LCS is found
                            lastSubsBegin = thisSubsBegin;
                            sb = new StringBuilder();
                            sb.append(first.substring(lastSubsBegin, i + 1));
                        }
                    }
                }
            }
        }

        return sb.toString();
    }
}
