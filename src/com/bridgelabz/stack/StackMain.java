// Stack : UC-2 Ability to peak and pop from the Stack till it is empty 56->30->70
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
        System.out.println("***** Top of the Stack or peak is : *****");
        stackObject.peak();
        System.out.println("Pop the elements in the top of the Stack ");
        stackObject.popStack();
        stackObject.display();
        System.out.println("Popped the element top of the stack ");
        stackObject.popStack();
        stackObject.display();
        System.out.println("Popped the element top of the stack ");
        stackObject.popStack();
        stackObject.display();
        System.out.println("Stack is Empty");


    }
}
