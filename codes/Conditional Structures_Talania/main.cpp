/******************************************************************************
problem statement:
Write a program that will read a year y and determine whether it is a leap year or not. 


*******************************************************************************/
#include <iostream>

using namespace std;

int main()
{
    int year;
    cout << "Input year:";
    cin >> year;
    
    if (year % 4 == 0)
    {
        cout << "is a leap year";
    }
    else 
    {
        cout << " not a leap year";
    }

    return 0;
}