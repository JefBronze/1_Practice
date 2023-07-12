#include <iostream>

using namespace std;

int main()
{
  int x = 10;
  int *ptr;
  ptr = &x;
  cout << "Le x et: " << ptr << endl;
  cout << "Le x et: " << *ptr << endl;
  cout << "Le x et: " << x << endl;
  cout << "Le x et: " << &x << endl;
}
