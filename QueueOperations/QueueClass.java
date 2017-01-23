/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicqueueoperations;

import java.util.NoSuchElementException;

/**
 *
 * @author Shamalee
 */
public class QueueClass {
    
    protected int A[];
    protected int front, rear, size, len;
    
    
    public QueueClass(int n)
    {
        size = n;
        A = new int[size];
        front = -1;
        rear = -1;
               
    }
    
    public boolean IsFull()
    {
        return front == 0 && rear == size-1;
    }
    
    public boolean IsEmpty()
    {
        return front == -1 && rear == -1;
    }
    
    public void enqueue(int number)
    {
        if(IsFull())
            throw new IndexOutOfBoundsException("Overflow Exception");
        
        if(IsEmpty()){
            front =0;
            rear=0;
            }
        else 
            {
                rear = (rear+1)%size;    // use of circular array, so as not to waste blank memory cells
                                         //  in the front of the array that are being dequeued
            }
        A[rear] = number;
    }
    
    public void dequeue()
    {
        if(IsEmpty())
             throw new NoSuchElementException("Underflow Exception");
     
        else if(front == rear)
        {
            front = -1; 
            rear = -1;
        }
        else
        {
            front = (front + 1)%size;
        }
    }
    
    public int peek()
    {
        if(IsEmpty())
             throw new NoSuchElementException("Underflow Exception");
        
        
        else
             return A[front];
        
        
        
    }
    
    public void printQueue(){
        
        int count = (rear+size-front)%size+1;
        System.out.println("Elements in the Queue are as follows:");
        for(int i=0; i < count; i++)
        {
            System.out.println(A[front+i%size]);
        }
    }
    
    
    
    
}
