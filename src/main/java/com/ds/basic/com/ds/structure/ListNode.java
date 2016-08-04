package com.ds.basic.com.ds.structure;

/**
 * Created by Dark Coder on 31/07/2016.
 */

/**
 * Declaration of link list node class
 * data hold the integer type
 * next will hold the next node reference index
 */
public class ListNode {
    private Integer data;
    private ListNode next;

    public ListNode(int data) {
        this.data = data;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
