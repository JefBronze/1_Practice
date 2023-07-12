#include <iostream>

using namespace std;

int main()
{

    cout << "Donnez 10 entiers" << endl;
    int tableau[10];
    for (int i = 0; i < 10; i++)
    {
        cin >> tableau[i];
    }

    for (int i = 0; i < 10; i++)
    {
        cout << "Tableau: " << tableau[i] << endl;
    }

    for (int i = 0; i < 10; i++)
    {
        if (10 <= tableau[i])
        {
            cout << "Superieurs a 10: " << tableau[i] << " " << endl;
        }
    }

    return 0;
}