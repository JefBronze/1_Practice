#include <iostream>
#include <vector>

using namespace std;

int incrementador = 1;

int main()
{
    vector<vector<int>> matriz;

    for (int i = 0; i < 5; i++)
    {
        vector<int> index;

        for (int j = 0; j < 6; j++)
        {
            index.push_back(incrementador);
            incrementador += 1;
        }

        matriz.push_back(index);
    }

    for (int i = 0; i < matriz.size(); i++)
    {
        for (int j = 0; j < matriz[i].size(); j++)
            cout << matriz[i][j] << " ";
        cout << endl;
    }

    return 0;
}