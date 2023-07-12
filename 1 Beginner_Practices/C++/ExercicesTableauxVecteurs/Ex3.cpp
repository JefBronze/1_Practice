#include <iostream>

using namespace std;

int main()
{

    int v, index;

    cout << "Donnez 10 entiers" << endl;
    int tableau[10];
    for (int i = 0; i < 10; i++)
    {
        cin >> tableau[i];
    }

    cout << tableau[0] << endl;

    // Loop to store largest number to tableau[0]
    for (int i = 1; i < 10; ++i)
    {

        // Change < to > if you want to find the smallest element
        if (tableau[0] < tableau[i])
        {
            tableau[0] = tableau[i];
            index = i;
        }
    }

    cout << "Largest element = " << tableau[0] << " and its index " << index << endl;
    return 0;
}