#include <iostream>

using namespace std;

int sum;

int main() {
	int a[3][4] = { {1,2,3,4},{5,6,7,8},{9,10,11,12} };

	for (int i = 0; i < 3; i++)
	{
		for (int j = 0; j < 4; j++)
		{
			sum += a[i][j];

		}
	}

	cout <<" " << sum << endl;
	return 0;
}