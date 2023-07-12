// Example 4: Arguments passed and a return value.

#include <iostream>
using namespace std;

int swap(int a, int b)
{

    int i;
    i = a;
    a = b;
    b = i;

    cout << "A tourne: " << a << endl;
    cout << "B tourne: " << b << endl;

    return (a, b);
}

int main()
{
    int result, a, b;
    a=2;
    b=3;
    cout << "A est: " << a << endl;
    cout << "B est: " << b << endl;
    result = swap(a,b);
    return 0;
}