/*
Variables
Nombres de jours ----  int n;
double total = 0.10;

Chaque jour, on double le total;
Fournir le nombre de jours et donner le total.
*/

#include <iostream>

using namespace std;

int factorial(int n, double total);

int main()
{
    int n;
    double total = 0.10;
    cout << "n= ";
    cin >> n;
    cout << factorial(n, total);
}

int factorial(int n, double total)
{
    if (n > 1)
        return n, total * factorial(n - 1, total - 1);
    else
        return 1;

    /*for (int i = 0; i = n; i++)
    {
    }*/

   // return 2 * factorial(n, total);
}
