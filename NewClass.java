/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vowel;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class NewClass 
{
    

   
    public static void main(String[] args)
    {
        char c;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter an Alphabet : ");
        c = scan.next().charAt(0);
     if(c=='a' || c=='A' || c=='e' || c=='E' ||
        c=='i' || c=='I' || c=='o' || c=='O' ||
        c=='u' || c=='U')
        {
            System.out.print("This is a Vowel");
        }
        else
        {
            System.out.print("This is not a Vowel");
        }
    }
}


