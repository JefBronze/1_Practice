#include <iostream>

using namespace std;

int main()
{

    float a;
    float b;
    float c;

    cout << "Entrez trois numeros differents: ";
    cin >> a >> b >> c;

    if (a > b && a > c)
    {
        cout << "La plus grande valeur est: " << a << endl;
    }
    if (b > a && b > c)
    {
        cout << "La plus grande valeur est: " << b << endl;
    }
    if (c > a && c > b)
    {
        cout << "La plus grande valeur est: " << c << endl;
    }

    return 0;
}