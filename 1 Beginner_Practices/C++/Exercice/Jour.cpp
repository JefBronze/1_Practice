#include <iostream>

using namespace std;

int main()
{

    int a;

    cout << "Entrez un nombre de un a sept: ";
    cin >> a;

    if (a == 1)
    {
        cout << "Le jour que vous avez choisi correspond au dimanche!";
    }
    else if (a == 2)
    {
        cout << "Le jour que vous avez choisi correspond au lundi!";
    }
    else if (a == 3)
    {
        cout << "Le jour que vous avez choisi correspond au mardi!";
    }
    else if (a == 4)
    {
        cout << "Le jour que vous avez choisi correspond au mercredi!";
    }
    else if (a == 5)
    {
        cout << "Le jour que vous avez choisi correspond au jundi!";
    }
    else if (a == 6)
    {
        cout << "Le jour que vous avez choisi correspond au vendredi!";
    }
    else
    {
        cout << "Le jour que vous avez choisi correspond au samedi!";
    }

    return 0;
}