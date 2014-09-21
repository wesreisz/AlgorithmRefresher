package com.wesleyreisz.problem3.test;

import com.wesleyreisz.problem3.code.MyLinkedList;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wesleyreisz on 9/21/14.
 */
public class LinkedListNodeTest {
    @Test
    public void createLinkedList(){
        MyLinkedList myLinkedList = new MyLinkedList("wes");
        myLinkedList.add("kim");
        myLinkedList.add("justin");
        myLinkedList.add("leanne");
        myLinkedList.add("tyler");

        Assert.assertEquals("wes, kim, justin, leanne, tyler", myLinkedList.print());
    }

    @Test
    public void removeLinkedList(){
        MyLinkedList myLinkedList = new MyLinkedList("wes");
        myLinkedList.add("kim");
        myLinkedList.add("justin");
        myLinkedList.add("leanne");
        myLinkedList.add("tyler");

        myLinkedList.remove("justin");
        Assert.assertEquals("wes, kim, leanne, tyler", myLinkedList.print());
    }
}
