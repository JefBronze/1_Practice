
#include <iostream>
using namespace std;

int n1;
int n2;

void pp(int a, int b)
{
    if (a < b){
        cout << "Le plus petit nombre est: " << a << endl;
    } else {
        cout << "Le plus petit nombre est: " << b << endl;
    }
}

int main()
{
    cout << "Donnez deux nombres entieres." << endl;
    cin >> n1 >> n2;
    pp(n1, n2);
    return 0;
}
