// Example 1: No arguments passed and no return value

#include <iostream>
using namespace std;

void swap();

int main()
{
    // No argument is passed to prime()
    swap();
    return 0;
}

// Return type of function is void because value is not returned.
void swap()
{
    int result, a, b, i;
    a = 2;
    b = 3;
    cout << "A est: " << a << endl;
    cout << "B est: " << b << endl;
    i = a;
    a = b;
    b = i;
    cout << "A tourne: " << a << endl;
    cout << "B tourne: " << b << endl;
}