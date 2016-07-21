/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication50;

/**
 *
 * @author Student
 */
public class JavaApplication50 {

    /**
     * @param args the command line arguments
     */
 #include<stdio.h>
#include<conio.h>
int main()
{
int a,num,ele[20],result;
clrscr();
printf("enter the number of elements:");
scanf("%d",&num);
printf("enter the elements of array:");
for(a=0;a<num;a++)
scanf("%d",&ele[a]);
result=ele[0];
for(a=1;a<num;a++)
result^=ele[a];
printf("unique element is :%d",result);
return 0;
getch();
}