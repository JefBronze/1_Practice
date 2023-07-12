#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int n, x, pg;
    std::cout << "Donnez la taille du tableau : \n";
    pg = 0;
    cin >> n;
    vector <int> tab(n);

    for (int i = 0; i < tab.size(); i++) {
        cout << "Donnez le numero : " << i + 1 << "\n";
        cin >> x;
        tab[i] = x;
    }

    for (int i = 0; i < n; i++) {
        if (tab[i] > pg)
            pg = tab[i];
    }

    cout << "Le plus grand est : " << pg;

}
