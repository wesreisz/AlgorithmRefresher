package com.wesleyreisz.problem3.code;

/**
 * Created by wesleyreisz on 9/21/14.
 */
public class MyLinkedList {
    private MyLinkedList next = null;
    private String value;

    public MyLinkedList(String value){
        this.value=value;
    }

    public void add(String inputString) {
        MyLinkedList end = new MyLinkedList(inputString);
        MyLinkedList n = this;
        while(n.next!=null){
            n = n.next;
        }
        n.next=end;
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        MyLinkedList n = this;
        if (n==null){ return n.value; }

        while (n!=null){
            sb.append(n.value);
            if(n.next!=null){
                sb.append(", ");
            }
            n=n.next;
        }

        return sb.toString();
    }

    public void remove(String value2remove) {
        if(value2remove==null){ return; }

        MyLinkedList n = this;
        while(n.next!=null){
            if(n.next.value.equalsIgnoreCase(value2remove)){
                n.next=n.next.next;
            }else{
                n=n.next;
            }
        }
    }
}
