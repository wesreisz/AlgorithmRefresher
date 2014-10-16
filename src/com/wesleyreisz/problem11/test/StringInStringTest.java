package com.wesleyreisz.problem11.test;

import com.wesleyreisz.problem11.code.StringUtilsB;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wesleyreisz on 10/16/14.
 */
public class StringInStringTest {
    @Test
    public void findStringInStringTestA(){
        Assert.assertEquals("test", StringUtilsB.findInStringA("test", "westestwes"));
    }
}
