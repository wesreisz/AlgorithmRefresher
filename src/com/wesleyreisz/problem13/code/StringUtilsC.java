package com.wesleyreisz.problem13.code;

/**
 * Created by wesleyreisz on 10/17/14.
 */
public class StringUtilsC {
    public static boolean subString(String partialString, String fullString) {
        if((partialString==null)||
           (fullString==null) ||
           (fullString.length()==0)
          )return false;

        if(partialString!=null && partialString.length()==0){
            return true;
        }

        for (int i = 0; i<fullString.length();i++){//full string
            for (int y = 0; i<partialString.length();i++){// sub string
                if(fullString.charAt(i)==partialString.charAt(y)){
                    int fullStringStartOffset=i;
                    int partialStringStartOffset=y;
                    for(int m=1;m<partialString.length();m++){
                       if(fullString.charAt(fullStringStartOffset+m)!=partialString.charAt(partialStringStartOffset+m)){
                           break;
                       }
                       if(m==partialString.length()-1){
                           return true;
                       }
                    }
                }
            }
        }

            return false;
    }
}
