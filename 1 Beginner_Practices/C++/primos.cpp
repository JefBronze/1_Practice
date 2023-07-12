#include <iostream>
using namespace std;
int main()
{
    
    int n;
    int j = 0;

    cout << "Affiche nombre primiers: \n";
    cin >> n;
        for (int i = 1; i  < n; i++) {
            if (n % i == 0) {
                j++;

            }
        }
        if (j == 2) {
            cout << "primo" << endl;
        }
        else {
            cout << "n primo" << endl;
        }
}
