#include <iostream>
#include <vector>

using namespace std;

int main()
{

bool running = true;
int x = 1;

while(running)
{
        cout << "This is message " << x << "." << endl;
        cout << "Press enter to continue..." << endl;
        cin.ignore();

        if(x >= 10)
                running = false;
        else
                x++;
}

}


