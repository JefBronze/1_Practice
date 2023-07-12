#include <iostream>

using namespace std;

int main()
{
    int size, *array, *modele;

    cout << "Quelle est la taille de vos vecteurs (n'entrez que des nombres entiers) : ";
    cin >> size;

    modele = new int[size];

    for (int i = 0; i < size; i++)
    {
        cout << "Vecteur 1: Quel nombre voulez-vous inserer dans la position " << i << ": ";
        cin >> modele[i];
    }

    for (int i = 0; i < size; i++)
    {
        cout << modele[i] << endl;
    }

    array = new int[size];

    for (int i = 0; i < size; i++)
    {
        cout << "Vecteur 2: Quel nombre voulez-vous inserer dans la position " << i << ": ";
        cin >> array[i];
    }

    for (int i = 0; i < size; i++)
    {
        cout << array[i] << endl;
    }

    return 0;
}