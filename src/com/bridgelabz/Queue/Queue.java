// Queue-UC2- Ability to dequeue from the beginning
package com.bridgelabz.Queue;

import com.bridgelabz.linkedlist.LinkedList;
import com.bridgelabz.linkedlist.Node;

public class Queue<Q>
{
    LinkedList<Q> linkedList = new LinkedList<>();
    Node<Q> front = null;
    Node<Q> rear = null;

    public Queue() {
    }
    public boolean isEmpty()
    {
        return front == null && rear == null;
    }
    public void enQueue(Q data)
    {
        Node<Q> newNode = new Node(data);
        if(isEmpty()) // empty queue
        {
            rear = front = newNode; // front and rear are at same point and same node
            return;
        }
        rear.setNext(newNode);
        rear = newNode;
    }
    public Q deQueue(Q data)
    {
        Node<Q> newNode = new Node<>(data);
        if(front == null)
        {
            System.out.println("Queue is Empty");
        }
        Q result = front.getData();
        front = front.getNext();
        return result;
    }
    public void displayQueue()
    {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.getData() + "->");
            temp = temp.getNext();
        }
    }

}
