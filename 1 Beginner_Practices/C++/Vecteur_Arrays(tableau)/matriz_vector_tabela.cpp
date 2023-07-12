#include <iostream>
#include <vector>

using namespace std;

vector<string> colunas{"1", "2", "3"};
vector<string> linhas{"Nome", "Telefone", "Email", "0", "0"};

int main()
{
    vector<vector<string>> matriz;

    for (int i = 0; i < colunas.size(); i++)
    {
        vector<string> v1;
        v1.push_back(colunas[i]);

        for (int j = 0; j < linhas.size(); j++)
        {
            v1.push_back(linhas[j]);
        }

        matriz.push_back(v1);
    }

    //cout << matriz[1][0] << endl;

    for (int i = 0; i < matriz[i].size(); i++)
    {

        for (int j = 0; j < matriz.size(); j++)
        
            cout << matriz[j][i] << " ";
            cout << endl;
    
    }

    return 0;
}