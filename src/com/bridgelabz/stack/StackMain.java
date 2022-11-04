// UC-1 Ability to create a Stack of 56->30->70
package com.bridgelabz.stack;

public class StackMain
{
    public static void main(String[] args)
    {
        System.out.println("Create Stack Using Linked list methods ");
        System.out.println("Push elements into the Stack ");
        Stack<Integer> stackObject = new Stack<>();
        stackObject.push(70);
        stackObject.push(30);
        stackObject.push(56);
        stackObject.display();
    }
}
