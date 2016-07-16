/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Palindrome {
   
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int r=0,d,s;
        System.out.println("enter the no");
        int n=sc.nextInt();
        s=n;
        while(n>0)
        {
            d=n%10;
           r=r*10+d;
            n=n/10;
        }
        System.out.println("r="+r);
         if(s==r){
             System.out.println("given number is palindrome ");
         }  
         else
             System.out.println("given number is not palindrome");
             }
        }
        
        
     


