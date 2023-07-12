#include <iostream>
#include <string>
using namespace std;
int main()
{
    string sample = "Some sample text";
    
    char ch = 'z';
    // Check if string contains the character or not
    if (sample.find(ch) != string::npos )
    {
        cout<<"Yes, string contains the character - "<< ch << endl;
    }
    else
    {
        cout<<"No, string do not contains the character - "<< ch << endl;
    }
    return 0;
}