// ConsoleApplication5.cpp : Este arquivo contém a função 'main'. A execução do programa começa e termina ali.
//

#include <iostream>
#include <vector>
using namespace std;

vector <string> guest_list{ "Lia", "Maria", "Lucia", "Taty"};

int guest_list_size = 4;

int print_guest_list(const vector <string> &guest_list, int guest_list_size);

int clear_guest_list(vector <string> &guest_list, int guest_list_size);

int event_guest_list(vector <string> &guest_list, int guest_list_size);

int main()
{
    event_guest_list(guest_list, guest_list_size);
}

int print_guest_list(const vector <string> &guest_list, int guest_list_size) {
    for (int i = 0; i < guest_list_size; i++) {
        cout << " " << guest_list[i] << endl;
    }
    
    return 0;
}

int clear_guest_list(vector <string> &guest_list, int guest_list_size) {
    for (int i = 0; i < guest_list_size; i++) {
        guest_list [i] = " ";
        cout << guest_list[i] << endl;
    }
    return 0;
}

int event_guest_list(vector <string> &guest_list, int guest_list_size) {

    print_guest_list(guest_list, guest_list_size);

    clear_guest_list(guest_list, guest_list_size);

    print_guest_list(guest_list, guest_list_size);

    return 0;
}
