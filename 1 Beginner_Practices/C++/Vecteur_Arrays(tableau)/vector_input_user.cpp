#include <iostream>
#include <vector>

using namespace std;

int T;

int main()
{

    cout << "Qual o tamanho do vetor (insira apenas numeros inteiros) : ";
    cin >> T;

    vector<int> vetor(T); // vetor [0,1,2,3,..,N]

    for (int i = 0; i < T; i++)

    {
        cout << "Qual numero voce vai inserir na posicao " << i << ": ";
        cin >> vetor[i];
    }

    for (int i = 0; i < T; i++)
    {
        cout << vetor[i] << endl;
    }

    return 0;
}
