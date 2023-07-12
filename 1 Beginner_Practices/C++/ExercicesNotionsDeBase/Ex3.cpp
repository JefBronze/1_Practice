#include <iostream>

using namespace std;

int main() {

int L,l,s,p;

cout << "Largeur : " << endl;
cin >> l;
cout << "Longueur : " << endl;
cin >> L;

s = l*L;
p = (2*l)+(2*L);

cout << "Perimetre: " << p << "m " << endl;
cout << "Surface: " << s << "m2" << endl;

	return 0;
}