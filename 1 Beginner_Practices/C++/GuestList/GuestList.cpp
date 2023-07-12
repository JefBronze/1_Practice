#include <iostream>
#include <vector>

using namespace std;

void print_guest_list(vector<string> guest_list);

int main()
{
	int n;
	vector<string> guest_list{
		"Guest 1",
		"Guest 2",
		"Guest N",
	};

	guest_list.erase (guest_list.begin(),guest_list.begin()+3);

	for (int i = 0; i < guest_list.size(); i++)
	{
		cout << guest_list[i] << endl;
	}

	cout << "Combien dinvites? " << endl;
	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cout << "Nom de linvite 1: " << guest_list[i] << "\t";
		cin >> guest_list[i];
	}

	print_guest_list(guest_list);

	return 0;
}

void print_guest_list(vector<string> guest_list)
{
	for (int i = 0; i < guest_list.size(); i++)
	{
		cout << guest_list[i] << "\t";
	}
}