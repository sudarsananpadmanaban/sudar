/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posi;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Posi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        if(num>0)
        
            System.out.println("print positive");
        else if(num<0)
            System.out.println("print negative");
        else
            System.out.println("print zero");
        
        
    }
}
