#include <iostream>

using namespace std;

int main() {

float p,q,t,P;

cout << "Prix, nombre et taux (10, 20, etc): " << endl;
cin >> p >> q >> t;

P = (p*q)*(1+(t/100));

cout << "Prix reel: " << P << endl;

	return 0;
}