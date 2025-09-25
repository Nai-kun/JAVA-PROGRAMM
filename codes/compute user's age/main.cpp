#include <iostream>

using namespace std;

int age;

int main()
{
    int currentyear = 2023;
    int birthyear;
    
    cout << "Enter your birthyear:";
    cin >> birthyear;
    
    int age = currentyear - birthyear;
    
    if ( age >= 0)
    {
        cout << "your age is:   " << age << endl;
    }
    else 
    {
        cout << "error" << endl;
    }
    
   

    return 0;
}
