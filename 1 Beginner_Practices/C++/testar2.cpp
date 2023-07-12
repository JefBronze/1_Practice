#include <iostream>
#include <vector>
#include <chrono>
#include <thread>
#include <numeric>
#include<algorithm>
using namespace std;
int main()
{
vector<char> message{ 'D', 'N', 'E', 'I', 'R' , 'F', 'R','U', 'O', 'Y', 'M' , 'A', 'I'};
int time = 0;
const int n = 365;


for (int i = message.size() - 1; i > -1; --i) {
cout << message[i] << " ";
this_thread::sleep_for(std::chrono::milliseconds(500));
}

cout << endl;
for (int i = 0; i <365; ++i) {
srand(unsigned(std::time(nullptr)));
vector<double> temp(365);
generate(temp.begin(), temp.end(), rand);
cout << "Random number " << i + 1 << ": " << temp[i] << " " << endl;
this_thread::sleep_for(std::chrono::milliseconds(5));
}

cout << endl;

cout << "Enter Time: ";

cin >> time;

cout << endl;

for (int i = time; i > 0; --i) {
cout << + i <<endl;
this_thread::sleep_for(std::chrono::milliseconds(1000));
if (i == 1)
cout << "Blast off!";
}

return 80085;
}