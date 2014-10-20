package com.wesleyreisz.problem14.test;

import com.wesleyreisz.problem14.code.NonRepeatingUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wesleyreisz on 10/20/14.
 */
public class FirstCharTest {
    @Test
    public void testNonRepeatingFirstChar(){
        Assert.assertEquals("", NonRepeatingUtil.getFirstNonRepeatingChar(null));
        Assert.assertEquals("", NonRepeatingUtil.getFirstNonRepeatingChar(""));
        Assert.assertEquals("a", NonRepeatingUtil.getFirstNonRepeatingChar("est east "));
        Assert.assertEquals("w", NonRepeatingUtil.getFirstNonRepeatingChar("west east"));
    }
}
