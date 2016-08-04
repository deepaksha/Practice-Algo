package com.ds.basic;

import com.ds.basic.com.ds.structure.ListNode;

import java.util.ListResourceBundle;

/**
 * Created by Dark Coder on 04/08/2016.
 */
public class InsertionNodeInLinkedList {
    private  ListNode headNode;

    public ListNode getHeadNode() {
        return headNode;
    }

    public void setHeadNode(ListNode headNode) {
        this.headNode = headNode;
    }

    /**
     * Insert a node we have three cases where we can insert a node.
     * 1) Insert a node in front of head node.
     * 2) Insert a node at given position
     * 3) Insert a node at last.
     */

    private void push(ListNode nodeToBeInsert) {
        // set new node next to head so it will be first node
        nodeToBeInsert.setNext(headNode);
        // set head node to newly inserted node.
        headNode = nodeToBeInsert;
    }

    private void insertAfter(ListNode previousNode, ListNode newNodeToBeInserted) {
        if(previousNode == null) {
            System.out.print("Previous node can not be null");
            return;
        }
        // new node next must be to previous next node
        newNodeToBeInserted.setNext(previousNode.getNext());
        // previous node next pointing to new node.
        previousNode.setNext(newNodeToBeInserted);
    }

    private void append(ListNode headNode, ListNode newNodeToBeInserted) {
        // if head node is null then set new node as head node
        if (headNode == null) {
            headNode = newNodeToBeInserted;
            return;
        }
        // create temp node and traverse it till last
        ListNode tempNode = headNode;
        while (tempNode.getNext() != null) {
            tempNode = tempNode.getNext();
        }
        // last node set as new created node.
        tempNode.setNext(newNodeToBeInserted);
    }

    private void printList(ListNode head){
        ListNode tempNode = head;
        while (tempNode != null)
        {
            System.out.print(tempNode.getData()+" ");
            tempNode = tempNode.getNext();
        }
    }

    public  static void main(String arg[]) {
       InsertionNodeInLinkedList llist = new InsertionNodeInLinkedList();

        // Insert 6.  So linked list becomes 6->NUllist
        llist.append(new ListNode(6), llist.getHeadNode());

        // Insert 7 at the beginning. So linked list becomes
        // 7->6->NUllist
        llist.push(new ListNode(7));

        // Insert 1 at the beginning. So linked list becomes
        // 1->7->6->NUllist
        llist.push(new ListNode(1));

        // Insert 4 at the end. So linked list becomes
        // 1->7->6->4->NUllist
        llist.append(new ListNode(4), llist.getHeadNode());

        // Insert 8, after 7. So linked list becomes
        // 1->7->8->6->4->NUllist
        llist.insertAfter(llist.getHeadNode().getNext(), new ListNode(8));

        System.out.println("\nCreated Linked list is: ");

        llist.printList(llist.getHeadNode());
    }

}
