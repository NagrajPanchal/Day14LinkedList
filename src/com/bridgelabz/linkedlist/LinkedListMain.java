// UC-3 create Linked List by appending 30 and 56 to 70

package com.bridgelabz.linkedlist;

public class LinkedListMain
{
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1=new LinkedList<>();
        System.out.println("********* : Linked List using Push : Element Add from head : **********");
        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);
        linkedList1.display();  // Display Node Elements

        LinkedList<Integer> linkedList2=new LinkedList<>();
        System.out.println("\n******** : Linked List using Append : Element add from tail : *********");
        linkedList2.append(70);
        linkedList2.append(30);
        linkedList2.append(56);
        linkedList2.display(); // Display Node elements
    }
}
