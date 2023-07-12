#include <iostream>
#include <vector>

using namespace std;

int main()
{

    int n;
    bool ordemCrescente;
    bool ordemDecrescente;
    bool tudoIgual;

    cout << "Input the size of the array : ";
    cin >> n;

    vector<int> vetor(n);
    for (int i = 0; i < n; i++)
    {
        cin >> vetor[i];
    }

    for (int j = 0; j < (n - 1); j++)
    {

        if (vetor[j] < vetor[j + 1])
        {
            ordemCrescente = true;
        }
        else
        {
            ordemCrescente = false;
            break;
        }
    }

    cout << ordemCrescente << endl;

    for (int j = 0; j < (n - 1); j++)
    {
        if (vetor[j] > vetor[j + 1])
        {
            ordemDecrescente = true;
        }
        else
        {
            ordemDecrescente = false;
            break;
        }
    }

    cout << ordemDecrescente << endl;

    for (int j = 0; j < (n - 1); j++)
    {
        if (vetor[j] == vetor[j + 1])
        {
            tudoIgual = true;
        }
        else
        {
            tudoIgual = false;
            break;
        }
    }

    cout << tudoIgual << endl;

    if (ordemCrescente == true)
    {
        cout << "Crescente" << endl;
    }

    if (ordemDecrescente == true)
    {
        cout << "Decrescente" << endl;
    }

    if (tudoIgual == true)
    {
        cout << "Iguais" << endl;
    }

    if (ordemCrescente == false)
    {
        if (ordemDecrescente == false)
        {
            if (tudoIgual == false)
            {
                cout << "Aleatorio" << endl;
            }
        }
    }

    return 0;
}