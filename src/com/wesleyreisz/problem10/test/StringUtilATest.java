package com.wesleyreisz.problem10.test;

import com.wesleyreisz.problem10.code.StringUtilA;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wesleyreisz on 10/14/14.
 */
public class StringUtilATest {
    @Test
    public void testFirstNonRepeatedNumber(){
        //return first non repeating character in a string
        Assert.assertEquals("a", StringUtilA.getFirstNonRepeatingCharacter("wesawes"));
        Assert.assertEquals("a", StringUtilA.getFirstNonRepeatingCharacter("wesawesb"));
        Assert.assertEquals(".", StringUtilA.getFirstNonRepeatingCharacter("wes.wes"));
        Assert.assertEquals(" ", StringUtilA.getFirstNonRepeatingCharacter("wes wes"));
        Assert.assertEquals("1", StringUtilA.getFirstNonRepeatingCharacter("wes1wes"));
        Assert.assertEquals("",  StringUtilA.getFirstNonRepeatingCharacter("weswes"));
    }

    @Test
    public void testLastNonRepeatedNumber(){
        Assert.assertEquals("a", StringUtilA.getLastNonRepeatingCharacter("wesawes"));
        Assert.assertEquals("b", StringUtilA.getLastNonRepeatingCharacter("wesawesb"));
        Assert.assertEquals(".", StringUtilA.getFirstNonRepeatingCharacter("wes.wes"));
        Assert.assertEquals(" ", StringUtilA.getFirstNonRepeatingCharacter("wes wes"));

    }

}
