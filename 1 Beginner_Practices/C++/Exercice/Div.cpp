#include <iostream>

using namespace std;

int main()
{

    int a;
    int b = 3;
    int c = 13;
    int r1;
    int r2;

    cout << "Entrez un nombre : " << endl;
    cin >> a;

    r1 = a % b;
    r2 = a % c;

    if (r1 == 0)
    {
        cout << "Le nombre est divisible par 3" << endl;
    }

    else
        cout << "Le nombre n'est pas divisible par 3" << endl;

    if (r2 == 0)
    {
        cout << "Le nombre est divisible par 13" << endl;
    }

    else
        cout << "Le nombre n'est pas divisible par 13" << endl;

    if (r1 == 0 && r2 == 0)
    {
        cout << "Le nombre est divisible par 3 et 13" << endl;
    }

    else
        cout << "Le nombre n'est pas divisible par 3 ou 13" << endl;

    return 0;
}
