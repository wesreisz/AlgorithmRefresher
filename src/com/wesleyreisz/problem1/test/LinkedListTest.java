package com.wesleyreisz.problem1.test;

import com.wesleyreisz.problem1.code.LinkedList.Node;
import org.junit.*;

/**
 * Created by wesleyreisz on 9/14/14.
 */
public class LinkedListTest {
    @Test
    public void createLinkedList(){
        Node node = new Node(3);
        Assert.assertNotNull(node);

        node.appendToTail(1)
            .appendToTail(3)
            .appendToTail(4)
            .appendToTail(6);

        Assert.assertTrue(node.peek());
        Assert.assertEquals(5,node.size());
    }

}
