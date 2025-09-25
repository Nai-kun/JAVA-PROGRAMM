#include <iostream>

using namespace std;

int main()

{
    float num1;
    float num2;
    float num3;
    
    cin >> num1;
    cout << "Input num1" << "\n";
    cin >> num2;
    cout << "Input num2" << "\n";
    cin >> num3;
    cout << " Input num3" << "\n";
    
    
  
    if (num1>num2 && num1>num3)
    {
     cout << "Num1 is the greatest" << "\n";
     
    }
    else if (num2>num1 && num2>num3)
    {
     cout << "Num2 is the greatest" << "\n";
     
    }
    else 
    {
    cout << "Num3 is the greatest" << "\n";
    
    }
    
     return 0;
    
    
}
