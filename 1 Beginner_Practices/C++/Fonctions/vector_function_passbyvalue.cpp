#include <iostream>
#include <vector>

using namespace std;

void print_vector(vector<int> vector) // sem &
{
    vector.push_back(10);
    for (int i = 0; i < vector.size(); i++)
    {
        cout << vector[i] << "\t";
    }
}

int main()
{
    vector<int> vector{1, 2, 3};

    print_vector(vector);
    print_vector(vector);
    print_vector(vector);

    return 0;
}