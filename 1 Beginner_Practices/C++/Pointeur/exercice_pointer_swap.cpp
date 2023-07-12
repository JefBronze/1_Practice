#include <iostream>

using namespace std;

void echanger(int *a, int *b)
{
    int temp;
    temp = *a;
    *a = *b;
    *b = temp;

    cout << "*a: " << *a << endl;
    cout << "*b: " << *b << endl;
}

int main()
{
    int x = 100;
    int y = 200;

    cout << "X cest la meme chose que: " << x << endl;
    cout << "Y cest la meme chose que: " << y << endl;
    cout << "X cest la meme chose que: " << &x << endl;
    cout << "Y cest la meme chose que: " << &y << endl;

    echanger(&x, &y);

    cout << "Maintenant X cest la meme chose que: " << x << endl;
    cout << "Maintenant Y cest la meme chose que: " << y << endl;
    cout << "X cest la meme chose que: " << &x << endl;
    cout << "Y cest la meme chose que: " << &y << endl;

    return 0;
}
