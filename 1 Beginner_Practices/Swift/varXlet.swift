var name = "Jeferson Bronze"
name = "Unintentional change" // allowed because 'name' was declared as a variable // Remarque: pas besoin de var pour la deuxieme fois, parceque la variable str est déjà créer. Nous avons just à lui changer de valeur.
print(name) // prints "Jane Doe"

let lastName = "Moreira Filho"
//lastName = "alguma outra alteração não intencional" // not allowed because 'lastName' was declared as a constant so it will give an error
print(lastName)

let band: String = "Sublime" // Avec swift, il est aussi possible d’outre passer du type inference -> dois pontos e "tipagem".
print(band)

var nota: Int = 10
var aluno: String = "Jeferson"
var resultado: String = "\(aluno) a sua nota eh: \(nota)" //String interpolation Remarque: «\()» est utilisé pour transformer une variable en String.
print(resultado)