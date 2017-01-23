/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicqueueoperations;
import java.util.Scanner;

/**
 *
 * @author Shamalee
 */
public class BasicQueueOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in Queue:");
        int n = in.nextInt();
        
        QueueClass objQueueClass = new QueueClass(n);
        
        char choice;
        do
        {
            System.out.println("Queue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Is Queue Empty?");
            System.out.println("4. Is Queue Full?");
            System.out.println("5. What is the first element of the Queue?");
           // System.out.println("Do you want to continue?");
            int operation = in.nextInt();
            
            switch(operation)
            {
                
                case 1:
                    System.out.println("Enter the number you want to insert:");
                    
                    try
                    {
                        objQueueClass.enqueue(in.nextInt());
                    }
                    catch(Exception e)
                    {
                        System.out.println("Error:"+e.getMessage());
                    }
                    
                    break;
                
                case 2:
                   
                    try
                    {
                        objQueueClass.dequeue();
                    }
                    catch(Exception e)
                    {
                        System.out.println("Error:"+e.getMessage());
                    }
                
                    break;
                
                case 3: 
                    
                    try
                    {
                        System.out.println(objQueueClass.IsEmpty());
                    }
                    catch(Exception e)
                    {
                        System.out.println("Error:"+e.getMessage());
                    }
                
                    break;
                
                case 4:
                    
                    try
                    {
                        System.out.println(objQueueClass.IsFull());
                    }
                    catch(Exception e)
                    {
                        System.out.println("Error:"+e.getMessage());
                    }
                
                    break;
                
                case 5: 
                    
                    try
                    {
                        System.out.println("The First Element is:"+objQueueClass.peek());
                    }
                    catch(Exception e)
                    {
                        System.out.println("Error:"+e.getMessage());
                    }
                
                    break;
                    
                default:System.out.println("Invalid selection");
                    break;
            }
            
            objQueueClass.printQueue();
            System.out.println("Do you want to continue? (y/n) \n");
            choice = in.next().charAt(0);
            
            }while(choice == 'Y' || choice == 'y');
        
        
    }
    
}
