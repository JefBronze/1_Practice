using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Factory
{
    class Program
    {
        static void Main(string[] args)
        {
            Chat a = new Siamois("");  // il faut tenir compte des changements dans 
                                       // l'implementation des constructeurs
            Console.WriteLine(a.race());
            Chat b = new Exotic();
            Console.WriteLine(b.race());

            // Supposons que nous ayons 56 classes pour les races de chat
            // Supposons que l'application (Main - Program) soit `très grande 

            // Un changement dans n'importe quelle classe de race de chat 
            // peut impacter plusieurs points dans l'application. 

            // Comment gérer cela? 
            // Solution: Design Pattern "Factory"

            Chat a1 = FabriqueChat.getChat("Siamois");
            Console.WriteLine(a1.race());
            Chat b1 = FabriqueChat.getChat("Exotic");
            Console.WriteLine(b.race());

            Console.ReadKey();

        }
    }
}
