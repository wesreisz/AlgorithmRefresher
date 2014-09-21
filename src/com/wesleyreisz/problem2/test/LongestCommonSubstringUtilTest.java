package com.wesleyreisz.problem2.test;

import com.wesleyreisz.problem2.code.LongestCommonSubstringUtil;
import org.junit.*;

/**
 * Created by wesleyreisz on 9/20/14.
 */
public class LongestCommonSubstringUtilTest {
    @Test
    public void testSimpleCompare(){
        //Assert.assertEquals("", LongestCommonSubstringUtil.compare("", ""));
        //Assert.assertEquals("", LongestCommonSubstringUtil.compare(null,""));
        //Assert.assertEquals("", LongestCommonSubstringUtil.compare("",null));

        Assert.assertEquals("wes", LongestCommonSubstringUtil.compare("wes","eeeeweseee"));
        //Assert.assertEquals("", LongestCommonSubstringUtil.compare("zzzz","rwerwerwe"));
    }
}
