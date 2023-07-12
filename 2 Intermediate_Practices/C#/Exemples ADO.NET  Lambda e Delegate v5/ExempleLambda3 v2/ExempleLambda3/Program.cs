using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExempleLambda3
{
    class Program
    {
        static void Main(string[] args)
        {
            Func<int, int> f1 =  a =>  a + 10;                          // lambda
            Func<int, int> f2 = (int a) =>{ return a + 10; };           // lambda
            Func<int, int> f3 = delegate (int a) { return a + 10; };    // mèthode anonyme

            Func<int> f4 = () => 10;
            Func<int> f5 = () => { Console.WriteLine("f5 : Lambda sans argument"); return 20; };

            Action<int> f6 = a => { Console.WriteLine("a = " + a); };    // Func<int, void> n'existe pas. 
                                                                         // Func avec résultat void est Action

            Action f7 = () => { int b = 1;  Console.WriteLine("Hello, b="+b); };

            Console.WriteLine("f1(9) = " + f1(9));
            Console.WriteLine("f2(9) = " + f2(9));
            Console.WriteLine("f3(9) = " + f3(9));
            Console.WriteLine("f4() = " + f4());
            Console.WriteLine("f5() = " + f5());
            f6(9);
            f7();

            Console.ReadKey();
        }
    }
}
