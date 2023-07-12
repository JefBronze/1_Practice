#include <iostream>

using namespace std;

int main()
{

    std::cout << "Calculatrice ! \n";
    std::cout << "============================\n";
    std::cout << "MENU\n";
    std::cout << "      1 - Addition: \n";
    std::cout << "      2 - Soustraction: \n";
    std::cout << "      3 - Division: \n";
    std::cout << "      1 - Multiplication: \n";
    std::cout << "============================\n";

    int menu{0};

 //   cout << "Donnez votre choix : \n";
 //   cin >> menu; // 1, 2, 3, 4

    //   while (menu != 1 && menu != 2 && menu != 3 && menu != 4)
    //   {
    //     cout << "Donnez votre choix : ";
    //      cin >> menu;
    //   }

    do
    {
        cout << "Donnez votre choix : ";
        cin >> menu;
    } while (menu != 1 && menu != 2 && menu != 3 && menu != 4);

    switch (menu)
    {
    case 1:
        cout << "Addition";
        break;
    case 2:
        cout << "Soustraction";
        break;
    case 3:
        cout << "Division";
        break;
    case 4:
        cout << "Multiplication";
        break;
    }

    return 0;
}
