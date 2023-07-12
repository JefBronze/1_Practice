#include <iostream>
#include <vector>

using namespace std;

int i, t, m;
int c = 1;

int main()
{
    cout << "Insira numeros inteiros positivos (tecle 0 para encerrar): " << endl;

    do
    {
        cin >> i;

        while (i < 0)
        {
            cout << "Error - Insira numero positivo apenas: " << endl;
            cin >> i;
        }
        i == 0 ? c-- : c++;
        t = t + i;

    } while (i != 0);

    m = t / c;

    cout << "Media: " << m << endl;
}