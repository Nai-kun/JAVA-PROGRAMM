/*
Name: Ian Frederick B. Talania
Description of the program:  A Simple Calculator - a program that computes the sum, difference, product, or quotient
of two numbers provided by the user. The program displays the result.*/

#include <stdio.h>

int main()
{
    int n1;
    int n2;
    
    printf  ("Enter n1:\n");
    scanf ("%d", &n1);
    printf  ("Enter n2\n");
    scanf ("%d", &n2);
    
    printf ("Choice of Operators\n");
    
    int choice;
    
    printf ("1 = sum\n");
    printf ("2 = difference\n");
    printf ("3 = quotient\n");
    printf ("4 = product\n");
    printf ("choice:");
    scanf ("%d", &choice);
    
    int sum = n1+n2;
    int difference = n1-n2;
    int quotient = n1/n2;
    int product = n1*n2;
    
   
    

    switch (choice)
    {
        
        case 1:
        printf ("sum\n");
        break;
        
        case 2:
        printf ("difference\n");
        break;
        
        case 3:
        printf ("quotient\n");
        break;
        
        case 4:
        printf ("product\n");
        break;
        
        default:
        printf ("Error");
        
    }
    return 0;
}




