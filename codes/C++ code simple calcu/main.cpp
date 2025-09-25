/*
Name: Ian Frederick B. Talania
Description of the program:  A Simple Calculator - a program that computes the sum, difference, product, or quotient
of two numbers provided by the user. The program displays the result.*/


#include <iostream>
using namespace std;

int main()
{
    int n1;
    int n2;
   

    cout << "Enter n1: " << "\n";
    cin >> n1;
    cout << "Enter n2 " << "\n";
    cin >> n2;
    
    cout << "Choice of Operators\n";
    
    int choice;
    
    cout << "1 = sum" "\n";
    cout << "2 = difference" "\n";
    cout << "3 = quotient"  "\n";
    cout << "4 = product" "\n";
    cout << "choice: ";
    cin >> choice;
    
    int sum = n1+n2;
    int difference = n1-n2;
    int quotient = n1/n2;
    int product = n1*n2;
    
   
    

    switch (choice)
    {
        
        case 1:
        cout << sum  << "\n";
        break;
        
        case 2:
        cout << difference << "\n";
        break;
        
        case 3:
        cout << quotient << "\n";
        break;
        
        case 4:
        cout << product << "\n";
        break;
        
        default:
        cout << "Error";
        
    }
    return 0;
}
    
