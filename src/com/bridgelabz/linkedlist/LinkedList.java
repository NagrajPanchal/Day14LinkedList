// UC-3 create Linked List by appending 30 and 56 to 70
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
    public void push(T data)
    {
        Node<T> newNode = new Node<>(data);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.setNext(head);
            head = newNode;
        }
    }
    public void append(T data)
    {
        Node<T> newNode = new Node<>(data);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            newNode.setNext(tail);
            tail = newNode;
            head = newNode;
        }
    }
}
