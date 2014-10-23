package com.wesleyreisz.problem15.test;
import com.wesleyreisz.problem15.code.StringUtilsD;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wesleyreisz on 10/23/14.
 */
public class StringTest {
    /*
    Problem:
     pairStar("hello") → "hel*lo"
     pairStar("xxyy") → "x*xy*y"
     pairStar("aaaa") → "a*a*a*a"
    */
    @Test
    public void pairStarTest(){
        Assert.assertEquals("", StringUtilsD.pairStar(""));
        Assert.assertEquals("", StringUtilsD.pairStar(null));
        Assert.assertEquals("hel*lo", StringUtilsD.pairStar("hello"));
        Assert.assertEquals("x*xy*y", StringUtilsD.pairStar("xxyy"));
        Assert.assertEquals("a*a*a*a", StringUtilsD.pairStar("aaaa"));
    }
}
