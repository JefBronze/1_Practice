#include <iostream>

using namespace std;

bool nombre_premier(int n) // 1) n = 4
{
    bool est_premier = true;

    // 0 et 1 ne sont pas des nombres premiers
    if (n == 0 || n == 1)
    {
        est_premier = false;
    }

    for (int i = 2; i <= n / 2; ++i) // 1) i = 2 & n = 4 -- 
    {
        if (n % i == 0) // 1) 4 % 2 == 0 ok.
        {
            est_premier = false; // 1) est_premier = false
            break;
        }
    }

    return est_premier; // 1) return false
}

int main()
{
    int n;

    cout << "Entrez un entier positif: ";
    cin >> n; // 1) n = 4

    if (nombre_premier(n)) // 1) n = 4
        cout << n << " est un nombre premier."; 
    else
        cout << n << " n'est pas un nombre premier."; // 1) 4 n'est pas un nombre premier.

    return 0;
}
