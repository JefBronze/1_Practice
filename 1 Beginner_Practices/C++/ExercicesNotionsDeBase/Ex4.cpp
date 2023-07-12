#include <iostream>

using namespace std;

int main() {

int a,b,i;

cout << "Tapez 2 entiers: " << endl;
cin >> a >> b;

i = a;
a = b;
b = i;

cout << "Entiers: " << a <<" et "<< b << endl;

	return 0;
}