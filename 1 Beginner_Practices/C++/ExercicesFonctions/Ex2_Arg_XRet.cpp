// Example 3: Arguments passed but no return value

#include <iostream>
using namespace std;

void swap(int a, int b);

int main()
{
    int result, a, b;
    a = 2;
    b = 3;
    cout << "A est: " << a << endl;
    cout << "B est: " << b << endl;
    // Arguments are passed to the function swap()
    swap(a, b);
    return 0;
}

// There is no return value to calling function. Hence, return type of function is void. */
void swap(int a, int b)
{

    int i;
    i = a;
    a = b;
    b = i;

    cout << "A tourne: " << a << endl;
    cout << "B tourne: " << b << endl;
}