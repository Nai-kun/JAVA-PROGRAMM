#include <iostream>
using namespace std;

int main ()

{
    int age;
    
    cout << "Input your age";
    cin >> age;
    
    if (age<=17) {
    cout << "You are still a minor" << "\n";
    }
    else if (age<=34) {
    cout << "You are still young" << "\n";
    }
    else if (age<=59) {
    cout << "You are now an adult" << "\n";
    }
    else if (age<=89) {
    cout << "You can now consider retiring and enjoy life more" << "\n";
    }
    else {
    cout << "Default age is just a number" << "\n";
    }
    
    return 0;
}
