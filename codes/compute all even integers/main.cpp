#include <iostream>
using namespace std;

int sum;

int main()
{
    for (int i = 2; i <= 10; i+=2)
    {
        sum += i;
    }
    
    cout << sum;
    
    
    return 0;
}

