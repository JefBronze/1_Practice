#include <iostream>
#include <string>

using namespace std;

int main()
{

    int num;

    for (int i = 0; i < 5; i++)
    {
        // i = 0 + 1 - iteração #1 = 1
        // i = 1 + 1 - iteração #2 = 2
        // i = 2 + 1 - iteração #3 = 3
        // i = 3 + 1 - iteração #4 = 4
        cout << i;
        // affichage #1 = 0
        // i = 0 + 1 - iteração #1 = 1
        // affichage #2 = 1
        // affichage #3 = 2
        // affichage #4 = 3
        // affichage #5 = 4
    }

    cout << " " << endl;

    int i{0};
    do
    {
        cout << i << " ";
        // affichage #1 = 0
        // affichage #2 = 1
        // affichage #3 = 2
        // affichage #4 = 3
        // affichage #5 = 4
        i = i + 1; // i += 1; //Jeito malandro!
        // i = 0 + 1 - iteração #1 = 1
        // i = 1 + 1 - iteração #2 = 2
        // i = 2 + 1 - iteração #3 = 3
        // i = 3 + 1 - iteração #4 = 4
        // i = 4 + 1 - iteração #5 = 5
    } while (i < 5);

    cout << " " << endl;

    int j(0);
    while (j < 5)
    {
        // j += 1; //Jeito malandro!
        j = j + 1;
        // j = 0 + 1 - iteração #1 = 1
        // j = 1 + 1 - iteração #2 = 2
        // j = 2 + 1 - iteração #3 = 3
        // j = 3 + 1 - iteração #4 = 4
        // j = 4 + 1 - iteração #5 = 5
        cout << j;
        // affichage #1 = 1
        // affichage #2 = 2
        // affichage #3 = 3
        // affichage #4 = 4
        // affichage #5 = 5
    };

    return 0;
}