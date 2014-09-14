package com.wesleyreisz.problem1.code.LinkedList;

/**
 * Created by wesleyreisz on 9/14/14.
 */
public class Node {
    private Node nextNode = null;
    private int data = 0;
    private static int size = 0;

    public Node(int data){
        this.data=data;
        size++;
    }

    public Node appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.nextNode != null) {
            n = n.nextNode;
        }
        n.nextNode = end;
        return this;
    }

    public boolean peek(){
        if (nextNode!=null){
            return true;
        }else{
            return false;
        }
    }
    public int size(){
        return size;
    }
}
