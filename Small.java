/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package small;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Small {

    /**
     * @param args the command line arguments
     */   public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int[] a=new int[25];
        int i,max=0;
        for(i=0;i<25;i++)
        a[i]=sc.nextInt();
        for(i=0;i<25;i++)
                {
                    if(a[i]>max)
                        max=a[i];
                }
        System.out.println("maximum number is"+max);
    
         
    }
}

