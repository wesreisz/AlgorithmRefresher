package com.wesleyreisz.problem1.test;

import com.wesleyreisz.problem1.code.StringUtil;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by wesleyreisz on 9/9/14.
 */
public class StringUtilTest {
    @Test
    public void testUnique(){
        Assert.assertEquals(true, StringUtil.isUnique("wes"));
        Assert.assertEquals(true, StringUtil.isUnique("123456789"));
        Assert.assertEquals(false, StringUtil.isUnique("qweeeiot"));
        Assert.assertEquals(false, StringUtil.isUnique("4412346"));
    }
    @Test
    public void testReverse(){
        Assert.assertEquals("sew", StringUtil.reverse("wes"));
        Assert.assertEquals("12345", StringUtil.reverse("54321"));
    }
}
