
#include <iostream>
using namespace std;

int main()
{
    int x, y;
    int *pointer1, *pointer2;

    x = 10;
    y = 50;
    pointer1 = &x;
    pointer2 = &y;

    cout << x << endl;
    cout << &x << endl;
    cout << pointer1 << endl;
    cout << *pointer1 << endl;
    cout << y << endl;
    cout << &y << endl;
    cout << pointer2 << endl;
    cout << *pointer2 << endl;
    return 0;
}