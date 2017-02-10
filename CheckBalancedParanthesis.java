/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;
import java.util.Scanner;
/**
 *
 * @author Shamalee
 */
public class Stack {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner in = new Scanner(System.in);
         String str = in.nextLine();
         char[] tempArray = str.toCharArray();
         int top = -1, flag =1;
         char A[] = new char[tempArray.length];
        
        for(int i = 0; i< tempArray.length; i++)
        {
           if(tempArray[i] == '{' || tempArray[i] == '(' || tempArray[i] == '[')
           {
                // Push operations               
                top = top + 1;    
                A[top] = tempArray[i];
           }
           
           else if(tempArray[i] == '}')
           {
               if(A[top] == '{')
                    top = top - 1;     //Pop
                else
                    flag = 0;     // set to 1 if pair is not complete in the given input
           }
           
           else if(tempArray[i] == ')')
           {
               if(A[top] == '(')
                    top = top - 1;    //Pop
               else
                    flag = 0;
           }
           
           else if(tempArray[i] == ']')
           {
               if(A[top] == '[')
                    top = top - 1;    //Pop
               
               else
                    flag = 0;
           }
           else
           {
               
           }
        }
        
        if(top == -1 && flag == 1)           
            System.out.println("The given input is a balanced paranthesis");
        else
            System.out.println("The given input is not a balanced paranthesis");
        
    }  
            
    
}
