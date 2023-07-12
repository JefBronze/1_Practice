#include <iostream>
using namespace std;

int main() {

  int i, n;
  float arr[100];

  cout << "Enter total number of elements(1 to 100): ";
  cin >> n;
  cout << endl;

  // Store number entered by the user
  for(i = 0; i < n; ++i) {
    cout << "Enter Number " << i + 1 << " : ";
    cin >> arr[i];
  }

  return 0;
}