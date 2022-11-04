// Stack : UC-2 Ability to peak and pop from the Stack till it is empty 56->30->70
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
    public void peak()
    {
        System.out.println(linkedList.head.getData());
    }
    public void popStack()
    {
        linkedList.pop();
    }

}
