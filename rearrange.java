//This program contain a methode that takes a qeueue and arrange even numbers in the front of it.

import java.util.*;

public class rearrange
{
    public static void main(String[] args) //Main
    {
        Queue<Integer> q = new LinkedList<Integer>(); //Create the Queue and add elements to it.
        q.add(3);
        q.add(5);
        q.add(4);
        q.add(17);
        q.add(6);
        q.add(83);
        q.add(1);
        q.add(84);
        q.add(16);
        q.add(37);
        System.out.println("Queue before arranging even numbers in the front = " + q);
        rearrange(q);
        System.out.println("Queue after arranging even numbers in the front = " + q);
    }

    public static void rearrange(Queue<Integer> q1) //Method that will arrange the elements.
    {
        Stack<Integer> s = new Stack<Integer>(); //Create a stack to use as auxiliary storage.

        if (!q1.isEmpty()) //if the queue not empty apply method.
        {
            //create oldSize variable to use in the for loop. because the queue shrink and its size will change.
            int oldSize = q1.size();

            //first loop so odd numbers arent inserted in a reverse order.
            for (int i =0; i < 2; i++)
            {
                for (int j = 0; j < oldSize; j++)
                {
                    //remove and test the front element.
                    int n = q1.remove();
                    if (n % 2 != 0)  //test if even or not.
                    {  
                        s.push(n); //if not even then add to Stack s
                    } 
                    else 
                    {
                        q1.add(n); //if even then add to inputed queue.
                    } 
                }
            
                //add odd elements to the back of the queue.
                while (!s.empty()) 
                {
                    q1.add(s.pop());
                } 
            }
        }
    }
}