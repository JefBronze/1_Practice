#include <iostream>
using namespace std;
void resto(double nourriture, double boisson, double tip) {
	const double taxe = 1.14975;
	double st = nourriture + boisson;
	double facture = (nourriture + boisson) * taxe;
	double pourboire = ((nourriture + boisson) / 100) * tip;
	double montant_final = facture + pourboire;

	cout << "Sous-total = " << st << endl << "Total avec taxes: " << facture << endl << "Montant de pour boire sur " << tip << "% : " << pourboire << endl << "Facture Finale: " << montant_final;

}

int main()
{
	double a, b, c;

	cout << "Entrez le total pour la nourriture\n";
	cin >> a;
	cout << "Entrez le total pour les boissons\n";
	cin >> b;
	cout << "Entrez le pourcentage de pourboire\n";
	cin >> c;

	resto(a, b, c);

}
