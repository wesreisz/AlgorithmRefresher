package com.wesleyreisz.problem13.test;

import com.wesleyreisz.problem13.code.StringUtilsC;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wesleyreisz on 10/17/14.
 */
public class SubStringTest {
    @Test
    public void subStringTest(){
        /*
        Write  a  program  to  determine  whether  an  input string  x  is a  substring  of  another 
        input  string  y.  (For  example,  "bat"  is  a  substring  of  "abate",  but  not  of  "beat".)   You 
        may  use  any  language  you  like.
        */
        Assert.assertEquals(true, StringUtilsC.subString("bat", "abate"));
        Assert.assertEquals(false, StringUtilsC.subString("bat", "beat"));
    }
}
