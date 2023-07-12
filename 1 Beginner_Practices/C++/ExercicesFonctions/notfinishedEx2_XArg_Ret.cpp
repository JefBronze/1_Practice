// Example 2: No arguments passed but a return value

#include <iostream>
using namespace std;

int swap();

int main()
{

    int a, b;

    // No argument is passed to prime()
    swap();
    cout << "A tourne: " << a << endl;
    cout << "B tourne: " << b << endl;
    return 0;
}

int swap()
{

    int a, b, i;
    a = 2;
    b = 3;
    cout << "A est: " << a << endl;
    cout << "B est: " << b << endl;

    return (a, b);
}