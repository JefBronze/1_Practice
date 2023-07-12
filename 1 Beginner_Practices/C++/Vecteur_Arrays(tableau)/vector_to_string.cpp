#include <iostream>
#include <vector>
 
int main() {
 
    std::vector<char> vec { 'A', 'B', 'C' };
 
    std::string str(vec.begin(), vec.end());
 
    std::cout << str << std::endl;            // ABC
 
    return 0;
}