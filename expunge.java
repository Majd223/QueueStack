
//Create an expunge method and remove element that is smaller then element on top.

import java.util.*;

public class expunge 
{
    public static void main(String[] args) 
    {
        Stack<Integer> s = new Stack<Integer>(); //Create Stack and add items to it.
        s.add(4);
        s.add(20);
        s.add(15);
        s.add(15);
        s.add(8);
        s.add(5);
        s.add(7);
        s.add(12);
        s.add(3);
        s.add(10);
        s.add(5);
        s.add(1);
        System.out.println("Stack = " + s);
        expunge(s);
        System.out.println("Stack after removing elements that have a larger value element above it = " + s);
    }

    //remove the elemnt that have a larger value element above it
    public static void expunge (Stack<Integer> s1)
    {
        Stack<Integer> s2 = new Stack<Integer>(); //Stack s2 for auxiliary storage
        
        int top = s1.pop(); //variable top to test it with the element under it of stack
        s2.push(top); // put the variable in the storage

        while (!s1.isEmpty()) //while inputed stack is not  empty
        {
            int n = s1.pop();

            if (n >= top) //if the next item is greater, keep it.
            {
                System.out.println("top = " + top + " bot = " + n);
                s2.push(n);

                //make n the new highest number 
                top = n; 
            }
        }

        while (!s2.isEmpty()) //put everything back to stack 1
        {
            s1.push(s2.pop());
        }
    }
}