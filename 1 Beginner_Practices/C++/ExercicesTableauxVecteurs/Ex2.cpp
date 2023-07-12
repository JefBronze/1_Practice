#include <iostream>

using namespace std;

int main()
{

    int v;

    cout << "Donnez 10 entiers" << endl;
    int tableau[10];
    for (int i = 0; i < 10; i++)
    {
        cin >> tableau[i];
    }

    cout << "Donnez 1 entiers" << endl;
    cin >> v;

    for (int i = 0; i < 10; i++)
    {
        if (v == tableau[i])
        {
            cout << "V se trouve dans le tableau" << endl;
            break;
        }
        else
        {
            cout << "V se ne trouve pas dans le tableau" << endl;
            break;
        }
    }
}
