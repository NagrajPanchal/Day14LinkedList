// UC-4 Insert a node 30 in between 56 and 70
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
            tail.setNext(newNode);
            tail = newNode;
        }
    }
    public Node<T> search(T searchData)
    {
        Node<T> temp = head;
        while (temp != null){
            if(temp.getData().equals(searchData))
                return  temp;
            temp = temp.getNext();
        }
        if(temp == null)
            System.out.println("Element not found!!!");
        else
            System.out.println("Element found!!!");
        return null;
    }
    public boolean insertAfter(T searchData, T insertData)
    {
        if(search(searchData) != null)
        {
            Node<T> nextNode = search(searchData).getNext();
            Node<T> newNode = new Node<>(insertData);
            search(searchData).setNext(newNode);
            newNode.setNext(nextNode);
            return true;
        }
        else
            System.out.println("Node not found unable to insert New Node ");
        return false;
    }
}
