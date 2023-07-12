#include <iostream>

using namespace std;

void Read(char tableau[], int size)
{
    for (int i = 0; i < size; i++)
    {
        cout << tableau[i];
    }
}

int main()
{

    char array[5]{'a', 'b', 'c', 'd', 'e'};

    Read(array, 5);

    return 0;
}
