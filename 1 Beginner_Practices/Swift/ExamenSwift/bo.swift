
func exercice1(_ base : Double, _ hauteur : Double )-> Double{

    return (base*hauteur)/2

}

func nbrsPattes(_ poulets : Int,_ vaches: Int,_ chevaux : Int)->Int{

    let nombresDePattes = (poulets*2)+(vaches*4)+(chevaux*4)

    return nombresDePattes

}

func collegeStudents(_ tableau : [Student],_ colleg : College) -> [Student]{

    var table : [Student] = []

    for i in tableau

    {

        if (i.college == colleg){

            table.append(i)

        }

    }

    return table

}

class ViewController: UIViewController {

    override func viewDidLoad() {

        super.viewDidLoad()

        var triangle : Double

        let b = 6.8

        let h = 7.7

        print("***** Exercice 1 *****")

        triangle = exercice1(b, h)

        print("la surface de triangle est \(triangle)")

        print("***** Exercice 2 *****")

        print("***** Exercice 3 *****")

        print("le nombres total des pattes de tous les animaux est \(nbrsPattes(20, 4, 2))")

        print("***** Exercice 4 *****")

        print("***** Exercice 5 *****")

        print("***** Exercice 6 *****")

        print("***** Exercice 7 *****")

        var etudiant1 = Student (nom: "Alpha", age: 20, genre: "garcon", college: "grasset")

        var etudiant2 = Student (nom: "Marie", age: 21, genre: "fille", college: "maisonNeuve")

        var students = [etudiant1,etudiant2]

        let leCollege = College(rawValue: "grasset") ?? .none

        let nouveauTableau = collegeStudents(students, leCollege) 

        if nouveauTableau.count > 0 {

            for item in nouveauTableau {

                item.afficher()

            }

        } else {

          print("le tableau est vide")

        }

        

    }

}











import Foundation

struct Student{

    var nom : String

    var age : Int

    var genre : String

    var college : String



init (nom :String,age :Int,genre :String, college :String){

    self.nom = nom

    self.age = age

    self.genre = Genre(rawValue: genre) ?? .none

    self.nom = College(rawValue: college) ?? .none

    

    

}

    func afficher(){

        print("l'eleve \(self.nom) qui a \(self.age) un \(self.genre) qui etudie a \(self.college) ")

    }

}

enum Genre : String{

    case fille

    case garcon

    case none

}

enum College :String{

    case grasset

    case rosemont

    case maisonNeuve

    case none

}