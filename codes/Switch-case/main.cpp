#include <iostream>
using namespace std;

int main ()

{
    int day = 0;
    
    cout << "choose values from 1 to 7"  << endl;
    cin >> day;
    
    switch (day)
    {
        case 1:
         cout << "monday";
        break;
        case 2:
         cout << "tuesday";
        break;
        case 3:
         cout << "wednesday";
        break;
        case 4:
         cout << "thursday";
        break;
        case 5:
         cout << "friday";
        break;
        case 6:
         cout << "saturday";
        break;
        case 7:
         cout << "sunday";
        default:
        cout << endl << "There is only 7 days in a week";
        
    }
    
    return 0;
}