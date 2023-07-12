#include <iostream>

using namespace std;

int main()
{

    int age;
    bool parental_consent;
    bool ssn;
    bool accidents;
    char N;

    cout << "Quel age avez-vous?";
    cin >> age;

    if (age >=18) {
        goto here;
    }
    if (age <= 15)
    {
        cout << "Desole, vous ne pouvez pas travailler ici. Merci!";
    }
    if (age > 15 && age < 18)
    {
        cout << "Avez-vous lautorisation de vos parents pour travailler (Ecrire Y pour oui et N pour non)? ";
        cin >> parental_consent;
    }
    if (parental_consent = "N")
    {
        cout << "Vous devez obtenir la permission de vos parents. Merci!";
    } 
    if (parental_consent = "Y") {
here:
        cout << "Possedez-vous un numero de securite sociale valide (Ecrire Y pour oui et N pour non)?";
        cin >> ssn;
    } if (ssn = "N") {
        cout << "Vous ne pouvez pas travailler ici sans un numero de securite sociale valide. Merci!";
    } else {
        cout << "Passons a la prochaine phase de votre processus dembauche.";
    }

    return 0;
}