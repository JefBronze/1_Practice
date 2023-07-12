#include <iostream>
#include <vector>

using namespace std;

int main()
{
    vector<int> v{1, 2, 3, 4, 5};
    v.insert(v.begin(), 6);

    for (int i = 0; i < 7; i++)
    {
        cout << v[i] << endl;
    }
}