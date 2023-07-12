#include <iostream>

using namespace std;

// int num;

int main()
{

    int num1;
    cout << "Entrez votre premiere nombre: ";
    cin >> num1;
    int num2;
    cout << "Entrez votre deuxieme nombre: ";
    cin >> num2;
    int num3;
    cout << "Entrez votre troisieme nombre: ";
    cin >> num3;

if (num1 != num2 != num2 != num3){
    if (num1 > num2 && num1 > num3)
    {
        cout << "Le plus grand nombre est: " << num1 << endl;
    }
    if (num2 > num1 && num2 > num3)
    {
        cout << "Le plus grand nombre est: " << num2 << endl;
    }
    if (num3 > num1 && num3 > num2)
    {
        cout << "Le plus grand nombre est: " << num3 << endl;
    }
    else
    {
        cout << "Les trois nombres sont les memes !" << endl;
    }
}
    return 0;
}