#include <iostream>

using namespace std;

int find_area(int side) {
	return side * side;
}

double find_area(double base, double h) {
	return base * h;
}

void  area_calc() {
	int square_area = find_area(2);
	double rectangle_area = find_area(2.5, 4.5);
	cout << "square: " << square_area << endl;
	cout << "retangule: " << rectangle_area;
}

int main()
{
	area_calc();
}