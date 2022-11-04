// Queue-UC2- Ability to dequeue from the beginning
package com.bridgelabz.Queue;

public class QueueMain
{
    public static void main(String[] args)
    {
        System.out.println("***** Create a Queue *****");
        Queue<Integer> queueObject = new Queue<>();
        queueObject.enQueue(56);
        queueObject.enQueue(30);
        queueObject.enQueue(70);
        System.out.println("***** Display Queue Elements *****");
        queueObject.displayQueue();
        System.out.println("***** Display deQueue Elements *****");
        queueObject.deQueue(56);
        queueObject.displayQueue();
        System.out.println("***** Display deQueue Elements *****");
        queueObject.deQueue(30);
        queueObject.displayQueue();
    }
}
