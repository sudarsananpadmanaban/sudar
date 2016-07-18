/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int i;
        int fact=1;
        for(i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        System.out.println("the factorial" +fact);
    }

}