package com.wesleyreisz.problem5.code;

import java.util.NoSuchElementException;

/**
 * Created by wesleyreisz on 9/23/14.
 * article: http://cs.lmu.edu/~ray/notes/stacks/
 */
public class SimpleStack implements Stack {

    private class Node{
        public Object data;
        public Node next;
        public Node(Object data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    private Node top = null;

    @Override
    public Object pop() {
        Object item = peek();
        top = top.next;
        return item;
    }

    @Override
    public Object peek() {
        if(top==null){
            throw new NoSuchElementException();
        }
        return top.data;
    }

    @Override
    public void push(Object o) {
        top = new Node(o,top);
    }

    @Override
    public int size() {
        int count = 0;

        Node node=top;
        while(node!=null){
            count++;
            node=node.next;
        }
        return count;
    }
}
