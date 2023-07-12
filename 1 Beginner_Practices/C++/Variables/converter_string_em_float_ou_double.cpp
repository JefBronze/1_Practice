#include <iostream>
#include <string>

using namespace std;

int main()
{
    string str = "123.4567";

    // convert string to float
    float num_float = std::stof(str);

    // convert string to double
    double num_double = std::stod(str);

    cout << "num_float = " << num_float << std::endl;
    cout << "num_double = " << num_double << std::endl;

    return 0;
}
