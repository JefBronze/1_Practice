#include <iostream>

using namespace std;

int main() {

    float T;
    float V;

    cout << "Quelle est la temperature en C et la vitesse du vent en km/h?";
    cin >> T >> V;

    if (T < 0 || V >35) {
        cout << "La condition a ete satisfaite.";
    } else {
        cout << "La condition netait pas remplie.";
    }

	return 0;
}