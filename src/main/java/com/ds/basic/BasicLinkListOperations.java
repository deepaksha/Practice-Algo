package com.ds.basic;

import com.ds.basic.com.ds.structure.ListNode;

/**
 * Created by Dark Coder on 31/07/2016.
 */
public class BasicLinkListOperations {
    // It holds the head of the first list.
    private ListNode head;
    private Integer length;

    /**
     * Getter of head node
     * @return
     */
    public ListNode getHead() {
        return head;
    }

    /**
     * insert a new node at beginning for the link list
     * @param node
     */
    private void insertNodeAtBeginningOfList(ListNode node) {
        // Setting node next to head because head is pointing to null
        node.setNext(head);
        // set head to current node.
        head = node;
        // increase length on each insertion.
        length++;
    }

    /**
     * Method used to insert the node at end of the list.
     * @param node
     */
    private void insertNodeAtEndOfTheList(ListNode node) {
        // if head is null means no node is present so assigned first node as head node
        if (head == null) {
            head = node;
        } else {
            // assigned to pointers where p hold the current one and q as temporary
            ListNode p, q;
            // go to last node
            for(p = head; (q = p.getNext())!= null; p = q);
            // insert node at last
            p.setNext(node);
        }
        // increase the length
        length++;
     }


    /**
     * Method use to calculate the size of a link list.
     * @param headNode
     * @return size of a linked list.
     */
    private Integer linkListLength(ListNode headNode) {
        Integer size = 0;
        // Iterate the link node till the end of the link list and increase size counter by 1
        // on each iteration.
        ListNode currentNode = headNode;
        while (currentNode != null) {
            size++;
            currentNode = currentNode.getNext();
        }
        return size;
    }

    /**
     * Method used to insert the node at particular position.
     * @param data
     * @param position
     */
    private void insertNodeAtPosition(Integer data, Integer position) {
        // if user enter position less than 0 then set position to 0
        if (position < 0) {
            position = 0;
        }

        // if user set the position greater than length then set position to length
        if (position > length) {
            position = length;
        }

        // if head is null no node exist create head node
        if (head == null) {
            head = new ListNode(data);
        }
        // if position is 0 means add node in front of head node/
        else if (position == 0) {
            // create temp node with data
            ListNode temp = new ListNode(data);
            // set temp node to head
            temp.setNext(head);
            // set head to temp
            head = temp;
        } else {
            // set node to temp
            ListNode temp = head;
            // iterate the node to position and get node at position
            for (int i = 1; i < position; i++) {
                temp = temp.getNext();
            }
            // create new node
            ListNode newNode = new ListNode(data);
            // set the new node next to temp next node because we are inserting the node in between
            newNode.setNext(temp.getNext());
            // set temp next node to new node.
            temp.setNext(newNode);
        }
        // increase the length
        length++;
   }

    private ListNode removeFromHead() {
        ListNode node = head;
        if (node != null) {
            head = node.getNext();
            node.setNext(null);
        }

        return node;
    }



}
