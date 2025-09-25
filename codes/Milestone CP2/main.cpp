#include <iostream>

using namespace std;

int main()
{
    int n1;
    int n2;
    int op;
    
    cout << "Enter n1: " << "\n";
    cin >> n1;
    cout << "Enter n2 " << "\n";
    cin >> n2;
    cout << "1 = + operator " << "\n";
    cout << "2 = - operator " << "\n";
    cout << "3 = / operator " << "\n";
    cout << "4 = * operator " << "\n";
    cin >> op;
    
    switch (op)
    {
        
        case 1:
        cout << n1 + n2 << "\n";
        break;
        
        case 2:
        cout << n1 - n2 << "\n";
        break;
        
        case 3:
        cout << n1 / n2 << "\n";
        break;
        
        case 4:
        cout << n1 * n2 << "\n";
        break;
        
        default:
        cout << "Error";
        
    }
    return 0;

    
    
    
}



