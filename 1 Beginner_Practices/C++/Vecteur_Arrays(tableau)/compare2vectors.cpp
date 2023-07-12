#include <algorithm> // para mismatch
#include <iostream>
#include <vector>
using namespace std;

int main()
{
   vector<int> v1 { 1, 2, 3 };
   vector<int> v2 { 2, 3, 4 };

   vector<int> v3 { 1, 2, 3 };
   vector<int> v4 { 1, 3, 4 };

   auto result1 = mismatch(v1.begin(), v1.end(), v2.begin(), less<int>());
   if (result1.first == v1.end())
      cout << "(1) all less\n";
   else
      cout << "(1) not all less\n";

   auto result2 = mismatch(v3.begin(), v3.end(), v4.begin(), less<int>());
   if (result2.first == v3.end())
      cout << "(2) all less\n";
   else
      cout << "(2) not all less\n";
}