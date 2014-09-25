package com.wesleyreisz.problem7.test;

import com.wesleyreisz.problem7.code.Problem7Utils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wesleyreisz on 9/25/14.
 */
public class Problem7UtilsTest {
    @Test
    public void testNonRepeating(){
        /**
         * “Given a string find the first non-repeated character.”
         */
        Assert.assertEquals("", Problem7Utils.findFirstNonRepeatingChar(""));
        Assert.assertEquals("", Problem7Utils.findFirstNonRepeatingChar(null));
        Assert.assertEquals("w", Problem7Utils.findFirstNonRepeatingChar("aabbccddeewes"));
    }

    @Test
    public void testIsAnagram(){
        Assert.assertEquals(false, Problem7Utils.isAnagram(null,null));
        Assert.assertEquals(false, Problem7Utils.isAnagram("res","sew"));
        Assert.assertEquals(true, Problem7Utils.isAnagram("wes","sew"));
    }

}
