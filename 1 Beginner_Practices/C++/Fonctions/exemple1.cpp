#include <iostream>

using namespace std;

int add(int a, int b)
{
    if (a > 0 && b > 0)
    {
        return a + b;
    }
    return 0;
}

int main()
{
    int result;
    result = add(2, 3);
    cout << result << endl;
    return 0;
}