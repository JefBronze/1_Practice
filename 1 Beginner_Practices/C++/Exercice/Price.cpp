#include <iostream>

using namespace std;

int main()
{

    float c;
    float v;

    cout << "Combien ca coute? ";
    cin >> c;

    cout << "Tu vends combien? ";
    cin >> v;

    if (c > v)
    {
        cout << "T as eu une perte!";
    }
    else if (c < v)
    {
        cout << "T as eu un profitttt";
    }
    else if (c = v)
    {
        cout << "T es passe de zero a zero";
    }

    return 0;
}