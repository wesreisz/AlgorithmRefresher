package com.wesleyreisz.problem12.test;

import com.wesleyreisz.problem12.code.ArrayUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wesleyreisz on 10/16/14.
 */
public class IncrementArrayTest {
    /*@Test(expected=RuntimeException.class)
    public void testIncrementArrayException(){
        ArrayUtils.IncrementArray(new int[]{'a', 9, 9});
    }*/
    @Test
    public void testIncrementArray(){
        int[] results = ArrayUtils.IncrementArray(new int[]{2, 9, 9});
        Assert.assertEquals(3,results[0]);
        Assert.assertEquals(0,results[1]);
        Assert.assertEquals(0,results[2]);
    }
    @Test
    public void testIncrementArray1(){
        int[] results = ArrayUtils.IncrementArray1(new int[]{2, 9, 9});
        Assert.assertEquals(3,results[0]);
        Assert.assertEquals(0,results[1]);
        Assert.assertEquals(0,results[2]);
    }

    @Test
    public void testIncrementArray2(){
        int[] results = ArrayUtils.IncrementArray2(new int[]{2, 9, 9});
        Assert.assertEquals(3,results[0]);
        Assert.assertEquals(0,results[1]);
        Assert.assertEquals(0,results[2]);

        results = ArrayUtils.IncrementArray2(new int[]{2, 1, 9});
        Assert.assertEquals(2,results[0]);
        Assert.assertEquals(2,results[1]);
        Assert.assertEquals(0,results[2]);
    }

    @Test
    public void testIncrementArray3() {
        int[] results = ArrayUtils.IncrementArray3(new int[]{2, 9, 9});
        Assert.assertEquals(3, results[0]);
        Assert.assertEquals(0, results[1]);
        Assert.assertEquals(0, results[2]);
    }
}

