#include <iostream>

using namespace std;

int main()
{

    int v, n;

    cout << "Input the size of the array : ";
    cin >> n;

    cout << "Donnez " << n << " entiers" << endl;
    int tableau[100];
    for (int i = 0; i < n; i++)
    {
        cin >> tableau[i];
    }

    cout << "Donnez 1 entiers" << endl;
    cin >> v;
    cout << " " << endl;

    /*for (int i = 0; i < n; i++)
    {
        cout << "Tableau: " << tableau[i] << endl;
    }*/

    for (int i = 0; i < n; ++i)
    {
        if (tableau[i] == v) // 1) tableau[0] {1} == 2 -- 2) tableau[1] {2} == 2 -- 3) tableau[2] {3} == 2 -- 4) tableau[3] {4} == 2
        {
            tableau[i] = tableau[i + 1]; // -- 2) tableau[1] {2} = tableau[1+1]
        }
        cout << tableau[i] << endl;
    }

    return 0;
}