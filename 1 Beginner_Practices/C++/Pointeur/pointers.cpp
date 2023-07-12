#include <iostream>

using namespace std;

int main()
{
    int V = 5;
    cout << "V: " << V << endl;
    //int &b = a; // &b é o local na memoria que vai receber o valor de a 
    int *pV = &V;
    //int b = a;

*pV = 9;
    cout << "V: " << *pV << endl;
    cout << "Address: " << pV << endl;
    /*cout << "b: " << *b << endl;

    a = 2 * a;

    cout << "a: " << a << endl;
    cout << "b: " << &b << endl;*/
}