// UC-3 create Linked List by appending 30 and 56 to 70

package com.bridgelabz.linkedlist;

public class LinkedListMain
{
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1=new LinkedList<>();
        System.out.println("********* : Linked List using Push : **********");
        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);
        linkedList1.display();

        LinkedList<Integer> linkedList2=new LinkedList<>();
        System.out.println("\n******** : Linked List using Append : *********");
        linkedList2.append(70);
        linkedList2.append(30);
        linkedList2.append(56);
        linkedList2.display();
    }
}
