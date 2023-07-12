#include <iostream>
#include <vector>
#include <chrono>
#include <thread>
#include <numeric>
// // // // // using namespace std;
int main()
{
vector<char> message{ 'D', 'N', 'E', 'I', 'R' , 'F', 'R','U', 'O', 'Y', 'M' , 'A', 'I'};
vector<int> numbers {3,7,8,9};
cout << message.size() << endl;
int time = 0;

numbers.push_back('z');

numbers[2] = 46;
numbers[4] = 69;

const int n = 365;
vector<double> temp(n, 80);

iota(temp.begin(), temp.end(), 1);


for (int i = message.size() - 1; i > -1; --i) {
cout << message[i] << " ";
this_thread::sleep_for(std::chrono::milliseconds(100));
}

cout << endl;

for (int i = 0; i < 365; ++i) {
cout << "Jour " << i + 1 << ": " << temp[i] << " " << endl;
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

return 0;
}
