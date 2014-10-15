package com.wesleyreisz.problem9.test;

import com.wesleyreisz.problem9.code.HistrogramUtil;
import org.junit.Test;

import java.util.Map;

/**
 * Created by wesleyreisz on 9/25/14.
 */
public class TestExample {
    @Test
    public void createHistogram(){
        String test = "I like sushi, do you like sushi?";
        Map<String, Integer> results = HistrogramUtil.makeHistogram(test);
        /*get iterator from hashmap and test the results from makeHistogram
         with known value… come back to this… im spending too much time here.
         */
    }
}