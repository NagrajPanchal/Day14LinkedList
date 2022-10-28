// UC-1 : Create Linked List
package com.bridgelabz.linkedlist;

public class LinkedList <T>
{
Node<T> head;
Node<T> tail;
    public void display()
    {
        Node<T> temp = head;
        if(head == null)
        {
            System.out.println("Linked list is Empty");
        }
        while(temp != null)
        {
            System.out.print(temp.getData()+ " -> ");
            temp = temp.getNext();
        }
        System.out.println();
    }
    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}
