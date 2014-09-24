package com.wesleyreisz.problem6.test;

import com.wesleyreisz.problem6.code.WordUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wesleyreisz on 9/23/14.
 */
public class TestWordReplace {
    @Test
    public void simpleWordReplace(){
        String input = "thomas justin kim leanne tyler thomas";
        Assert.assertEquals(
                "",
                WordUtils.simpleWordReplace(null, "tyler", "echo")
        );

        Assert.assertEquals(
                "",
                WordUtils.simpleWordReplace(input, null, "echo")
        );

        Assert.assertEquals(
                "",
                WordUtils.simpleWordReplace(input, "thomas", null)
        );

        Assert.assertEquals(
                "thomas cosmo kim leanne tyler thomas",
                WordUtils.simpleWordReplace(input, "justin", "cosmo")
        );

        Assert.assertEquals(
                "thomas justin kim leanne echo thomas",
                WordUtils.simpleWordReplace(input, "tyler", "echo")
        );

        Assert.assertEquals(
                "wes justin kim leanne tyler wes",
                WordUtils.simpleWordReplace(input, "thomas", "wes")
        );
    }
}
