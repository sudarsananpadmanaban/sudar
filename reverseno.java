/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

import java.util.Scanner;
 
/**
 *
 * @author Student
 */
public class reverseno {

   
    public static void main(String[] args) {
        
       Scanner s=new Scanner(System.in);
       int[] a=new int[10];
       for(int i=0;i<10;i++){
           a[i]=s.nextInt();
           System.out.println("the array values are:"+a[i]);
       }
        
       for(int i=a.length-1;i>=0;i--){
           System.out.println("the reverse array is"+a[i]);
           
       }
           
       }

}