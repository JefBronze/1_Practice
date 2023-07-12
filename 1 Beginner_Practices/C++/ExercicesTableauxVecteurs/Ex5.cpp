#include <iostream>

using namespace std;

int main()
{

    int v, index;

    cout << "Donnez 10 entiers" << endl;
    int tableau[10];
    for (int j = 0; j < 10; j++)
    {
        cin >> tableau[j]; // 1 , 2 , 3 , 4 , 5 , 6 , 7, 8 , 9, 10
    }

    cout << "Donnez 1 entiers (V)" << endl;
    cin >> v; // v = 100;

    cout << "Donnez 1 index (index)" << endl;
    cin >> index; // index = 2;

    for (int k = 0; k < 10; k++) // -- 1) k = 0 -- 2) k = 1
    {
        if (tableau[k] == index) // -- 1) tableau[0] {1} != index {2} -- 2) tableau[1] {2} == index {2}
        {
            tableau[k + 1] = tableau[k+1]; // -- 2) tableau[1 + 1] {3} = tableau[1] {2} :. tableau[2] {2} = tableau[1] {2}
            tableau[k] = v; // -- 2) tableau[1] {2} = v {100}
            break;
        }
    }

    for (int i = 0; i < 10; i++)
    {
        cout << tableau[i] << " ";
    }
}