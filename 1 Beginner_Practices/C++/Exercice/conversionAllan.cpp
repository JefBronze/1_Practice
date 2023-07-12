#include <iostream>
#include <vector>
using namespace std;

int main()
{

    int n;
    double tax;

    cout << "Inserez combien de fois a convertir";
    cin >> n;
    vector<double> CAD(n);
    vector<double> USD(n);
    cout << "Inserez le taux" << endl;
    cin >> tax;
    cout << "Combien est le montant en CAD" << endl;
    for (int i = 0; i < CAD.size(); i++)
    {
        cin >> CAD[i];
        cout << "Montant " << i << ":"
            << "CAD " << CAD[i] << endl;
    }

    for (int i = 0; i < USD.size(); i++)
    {
        USD[i] = tax * CAD[i];
        cout << "Montant " << i << ":"
            << "USD " << USD[i] << endl;
    }
}