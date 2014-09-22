package com.wesleyreisz.problem1.test;

import com.wesleyreisz.problem1.code.StringUtil;
import org.junit.Assert;
import org.junit.Test;

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

    @Test
    public void testRemoveDupsNew(){
        String set1 = "wweess";
        Assert.assertEquals("wes", StringUtil.removeDuplicatesSolutionNew(set1));

        String set2 = "111222234";
        Assert.assertEquals("3214", StringUtil.removeDuplicatesSolutionNew(set2));

        String set3 = "42222242221";
        Assert.assertEquals("214", StringUtil.removeDuplicatesSolutionNew(set3));

        String set4 = "hhhhhh";
        Assert.assertEquals("h", StringUtil.removeDuplicatesSolutionNew(set4));
    }

    @Test
    public void testForUniqueKata(){
        Assert.assertTrue(StringUtil.charactersAreUnique("wes"));
        Assert.assertTrue(StringUtil.charactersAreUnique("ert"));
        Assert.assertFalse(StringUtil.charactersAreUnique("tttt"));
        Assert.assertFalse(StringUtil.charactersAreUnique("test"));
    }

    @Test
    public void testForUniqueKata1(){
        Assert.assertTrue(StringUtil.charactersAreUnique1("wes"));
        Assert.assertTrue(StringUtil.charactersAreUnique1("ert"));
        Assert.assertFalse(StringUtil.charactersAreUnique1("tttt"));
        Assert.assertFalse(StringUtil.charactersAreUnique1("test"));
    }

    @Test
    public void testForTwoWordAnagram(){
        Assert.assertTrue(StringUtil.areTwoWordsAnAnagram("wes", "sew"));
        Assert.assertTrue(StringUtil.areTwoWordsAnAnagram("test", "tset"));
        Assert.assertTrue(StringUtil.areTwoWordsAnAnagram("bib", "bib"));
        Assert.assertFalse(StringUtil.areTwoWordsAnAnagram("bis", "bib"));
    }

    @Test
    public void testForSpaceReplacement(){
        String stringToTest = "test test";
        Assert.assertEquals(
            stringToTest.replace(" ","%20"),
            StringUtil.replaceSpaces(stringToTest)
        );
    }

    @Test
    public void testAnagram(){
        Assert.assertTrue(StringUtil.isAnagram("mom"));
        Assert.assertTrue(StringUtil.isAnagram("Mom"));
        Assert.assertFalse(StringUtil.isAnagram("wes"));
    }

}
