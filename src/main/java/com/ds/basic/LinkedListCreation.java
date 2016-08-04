package com.ds.basic;

import com.ds.basic.com.ds.structure.ListNode;

/**
 * Created by Dark Coder on 04/08/2016.
 */
public class LinkedListCreation {

    /**
     * Method to create a simply link list
     */

    private ListNode head;

    public ListNode getHead() {
        return head;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }

    public static void main(String arg[]) {
        //create the instance of linked list creation class
        LinkedListCreation list = new LinkedListCreation();

        // initialize the head of linked list creation class and set data = 1 and next to null;
        // simply create a node with data 1
        list.setHead(new ListNode(1));
        /*
           Creating head node with data 1 and its next pointer to null
            it is not linked with another node

            |------|-------|
            |   1  | NULL  |
            |------|-------|

          */

        // initialize another node with data 2
        ListNode second = new ListNode(2);
        /*
           Creating head node with data 1 and its next pointer to null
            it is not linked with another node

            |------|-------|
            |   2  | NULL  |
            |------|-------|

        */
        // create another node with data  3
        ListNode third = new ListNode(3);
        /*
           Creating head node with data 1 and its next pointer to null
            it is not linked with another node

            |------|-------|
            |  3   | NULL  |
            |------|-------|

      */

        /**
          Linking all node together
         |------|-------|         |------|-------|          |------|-------|
         |   1  | ------|-------->|   1  | ------|--------->|   3  | NULL  |
         |------|-------|         |------|-------|          |------|-------|

         */

        list.getHead().setNext(second);
        second.setNext(third);

        list.printList(list.getHead());

    }


    private boolean printList(ListNode head) {
        if(head == null) {
            System.out.println(" No Node created");
            return false;
        }

        while (head != null) {
            System.out.print(head.getData());
            System.out.print("---->");
            if (head.getNext() == null) {
                System.out.print("NULL");
            }
            // next node pointer
            head = head.getNext();
        }
        return true;
    }

}
