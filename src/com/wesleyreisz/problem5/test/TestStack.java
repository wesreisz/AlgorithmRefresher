package com.wesleyreisz.problem5.test;

import com.wesleyreisz.problem5.code.SimpleStack;
import com.wesleyreisz.problem5.code.Stack;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wesleyreisz on 9/23/14.
 */
public class TestStack {
    @Test
    public void testInitialize(){
        Stack stack = new SimpleStack();
        Assert.assertEquals(0, stack.size());
    }
    @Test
    public void testLoadStack(){
        int numberToLoad = 6;
        Stack stack = new SimpleStack();
        for(int i = 0; i<numberToLoad;i++){
            stack.push("Hello" + i);
        }
        Assert.assertEquals(6,stack.size());
        Assert.assertEquals("Hello5",(String)stack.pop());
        Assert.assertEquals("Hello4",(String)stack.pop());
    }
}
