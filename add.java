#include<stdio.h>
void main()
{
int numberber;
printf("Enter a numberberber: ");
scanf("&d,"numberber);
if(numberber>0)
printf("Positive.");
else if(numberber<0)
printf("Negative.");
else
printf("Zero.");
}