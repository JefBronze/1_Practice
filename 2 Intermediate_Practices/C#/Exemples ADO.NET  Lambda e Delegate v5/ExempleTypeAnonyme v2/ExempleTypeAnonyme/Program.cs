using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExempleTypeAnonyme
{
    class Program
    {
        static void Main(string[] args)
        {
            var a = 5;
           // var b;   // Cela ne marche pas. Il faut initialiser

            Console.WriteLine("Type de la variable a est " + a.GetType().ToString());  // int est System.Int32
            Console.WriteLine("Type de la variable a est " + a.GetType());
            Console.WriteLine(" a = " + a);
            Console.WriteLine(" a+4 = " + (a + 4));

            //Console.ReadKey();

            var c = new { nom = "Jean", age = 25 };  // Un type anonyme est créé pour être le type de l'objet

            Console.WriteLine("Type de la variable c est " + c.GetType().ToString());
            Console.WriteLine("Type de la variable c est " + c.GetType());
            Console.WriteLine(" c.nom = " + c.nom);
            Console.WriteLine(" c.age = " + c.age);

            var d = new { nom = "Mary", age = 27 };  // Un type anonyme est créé pour être le type de l'objet

            Console.WriteLine("Type de la variable d est " + d.GetType().ToString());
            Console.WriteLine("Type de la variable d est " + d.GetType());
            Console.WriteLine(" d.nom = " + d.nom);
            Console.WriteLine(" d.age = " + d.age);

            var e = new { nom = "Anne", age = 27, salaire= 60000.0 };  // Un type anonyme est créé pour être le type de l'objet

            Console.WriteLine("Type de la variable e est " + e.GetType().ToString());
            Console.WriteLine("Type de la variable e est " + e.GetType());
            Console.WriteLine(" e.nom = " + e.nom);
            Console.WriteLine(" e.age = " + e.age);

            Console.ReadKey();


        }
    }
}
