// Queue-UC1- Ability to create a Queue of 56->30->70
package com.bridgelabz.Queue;

import com.bridgelabz.linkedlist.LinkedList;

public class Queue<Q>
{
    LinkedList<Q> linkedList = new LinkedList<>();

    public Queue() {
    }
    public void enQueue(Q data)
    {
        linkedList.append(data);
    }
    public void displayQueue()
    {
        linkedList.display();
    }
}
