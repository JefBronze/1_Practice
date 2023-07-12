using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExempleLambda4a
{
    class Program
    {
        static Func<int, int> multiplier(int factor)
        {
            return new Func<int, int>(x => x * factor);
        }

        static void Main(string[] args)
        {
            var twice = multiplier(2);                 // twice reçoit la fonction et sa clôture 

            var threeTimes = multiplier(3);            // threeTimes reçoit la fonction et sa clôture 

            Console.WriteLine("twice(5) = " + twice(5));  // En raison de la clôture, twice n'oublie pas que factor était 
                                                          // 2 au moment où on a fait twice = multiplier(2).

            Console.WriteLine("threeTimes(5) = " + threeTimes(5));  // En raison de la clôture, threeTimes n'oublie pas que factor était 
                                                                    // 3 au moment où on a fait threeTimes = multiplier(3).

            Func<int, int> fourTimes;

            {
                int factor = 4;
                fourTimes = new Func<int, int>(x => x * factor);
            }

            Console.WriteLine("fourTimes(5) = " + fourTimes(5));  // En raison de la clôture, fourTimes n'oublie pas que factor était 
                                                                  // 4 au moment où on a fait l'assignation.

            Console.ReadKey();
        }
    }
}
