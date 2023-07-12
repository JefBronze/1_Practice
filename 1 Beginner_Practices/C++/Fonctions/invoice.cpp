/* In a restaurant, you must create a function to calculate the invoice of each customer. Want to include the price of food, drink, VAT, TVQ and tip on food and drink. Show the detailed invoice and the total price with all inclusive. */

// TPS = 5%
// TVQ = 9,975%

#include<iostream>

using namespace std;

//déclarer la fonction
int powGrasset(int base, int exp) {
	
	int temp {1};
	for (int i = 1; i <= exp; i++) {	
		temp = base * temp;
	}
	
	return temp;
}

int main()
{
	int result;

	result = powGrasset(4,3);
	cout << result;

	return 0;

}
