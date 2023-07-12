#include <iostream>

using namespace std;

int main()
{
    int firstvalue = 5, secondvalue = 15;
    int *p1, *p2;

    p1 = &firstvalue; // p1 = address of firstvalue // p1 recebe o local na memória onde a variável firstvalue foi alocada!
    cout << "memory location of firstvalue is " << p1 << '\n';
    cout << "*p1 is pointing to the value " << *p1 << '\n';
    p2 = &secondvalue; // p2 = address of secondvalue // p2 recebe o local na memória onde a variável secondvalue foi alocada!
    cout << "memory location of secondvalue is " << p2 << '\n';
    cout << "*p2 is pointing to the value " << *p2 << '\n';
    *p1 = 10; // value pointed to by p1 = 10 // *p1 não aponta mais para o valor que existe em firstvalue (5) e sim aponta para o valor de 10 agora. Entretanto *p2 continua a apontar para o valor que existe em secondvalue!
    cout << "p1 pointing to " << *p1 << '\n';
    cout << "p2 pointing to " << *p2 << '\n';
    *p2 = *p1; // value pointed to by p2 = value pointed to by p1 // *p2 passa a apontar para o mesmo valor que *p1, ou seja, 10.
    cout << "p2 is now pointing to " << *p2 << '\n';
    p1 = p2; // p1 = p2 (value of pointer is copied) // p1 agora possue o valor da memória de p2, ou seja, o local na memória onde a variável secondvalue foi alocada! 
    cout << "now, the memory location of firstvalue is equal of the memory location of the secondvalue " << p1 << '\n';
    cout << "just checking if the memory location of second value is the same of the above " << p2 << '\n';
    *p1 = 20; // value pointed to by p1 = 20 // *p1 passa a apontar para o valor de 20 mas não modifica o valor da variável firstvalue mas apenas da secondvalue pois o local da memória agora é aquele pertencente a second value!
    cout << *p1 << endl;
    cout << *p2 << endl;

    cout << "firstvalue is " << firstvalue << '\n';
    cout << "secondvalue is " << secondvalue << '\n';
    return 0;
}
