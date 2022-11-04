// UC-1 Ability to create a Stack of 56->30->70
package com.bridgelabz.stack;

import com.bridgelabz.linkedlist.LinkedList;

public class Stack<E>
{
    LinkedList<E> linkedList = new LinkedList<>();
    public Stack() {    }
    public void push(E data)
    {
        linkedList.push(data);
    }
    public void display()
    {
        linkedList.display();
    }

}
