// UC-2 create Linked List by adding 30 and 56 to 70

package com.bridgelabz.linkedlist;

public class LinkedListMain
{
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1=new LinkedList<>();
        System.out.println("********* : Linked List : **********");
        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);
        linkedList1.display();
    }
}
