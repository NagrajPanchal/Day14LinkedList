// UC-4 Insert a node 30 in between 56 and 70

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

        LinkedList<Integer> linkedList3=new LinkedList<>();
        System.out.println("\n******** : Insert a node in between : *********");
        linkedList3.append(56);
        linkedList3.append(70);
        System.out.println("********** : Display linked list without insert : *********");
        linkedList3.display(); // Display Node elements
        System.out.println("******** : Display linked list insert a node in between : *******");
        linkedList3.insertAfter(56,30);
        linkedList3.display(); // Display Node elements
    }
}
