using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExempleLambda1
{
    class Program
    {
        private delegate int MyFunctionType(int a);    // declaration d'un type delegate nomé MyFunctionType.

        private static int myF1(int a) { return a + 1; }
        private static int myF2(int a) { return a + 2; }
        private static int myF3(int a) { return 3 * a; }
        private static void myF4(int a) { Console.WriteLine("myF4: "+ a + 10); }


        static void Main(string[] args)
        {
            MyFunctionType f;                         // declaration d'une variable d'un type delegate
                                                      // variable dont la valeur est une fonction ou méthode

            f = myF1;
            Console.WriteLine("myF1: " + f(9));

            f = myF2;
            Console.WriteLine("myF2: " + f(9));

            f = myF3;
            Console.WriteLine("myF3: " + f(9));

            f = s => 5 * s;                                     // expression lambda
            Console.WriteLine("Lambda s => 5 * s : " + f(9));

            f = delegate (int s) { return 6 * s; };             // mèthode anonyme 
            Console.WriteLine("Mèthode Anonyme: " + f(9));

            f = new MyFunctionType(s => 7 * s);                 // mèthode anonyme créée à partir d'une expression lambda
            Console.WriteLine("Lambda s => 7 * s : " + f(9));

            Console.WriteLine("Lambda s => 10 * s : " +
                        new MyFunctionType(s => 10 * s)(9));    // mèthode anonyme créée à partir d'une expression lambda

            //=============================================================

            Func<int, int> f2;       // declaration d'une variable d'un type delegate ANONYM
                                     // Func<T1, T2,...,TResult> 

            f2 = myF1;
            Console.WriteLine("myF1: " + f2(9));

            f2 = myF2;
            Console.WriteLine("myF2: " + f2(9));

            f2 = myF3;
            Console.WriteLine("myF3: " + f2(9));

            f2 = s => 5 * s;                                      // expression lambda
            Console.WriteLine("Lambda s => 5 * s : " + f2(9));

            f2 = delegate (int s) { return 6 * s; } ;             // mèthode anonyme 
            Console.WriteLine("Mèthode Anonyme: " + f2(9));

            f2 = new Func<int, int>(s => 7 * s);                  // mèthode anonyme créée à partir d'une expression lambda
            Console.WriteLine("Lambda s => 7 * s : " + f2(9));

            Console.WriteLine("Lambda s => 10 * s : " +
                        new Func<int, int>(s => 10 * s)(9));      // mèthode anonyme créée à partir d'une expression lambda

            //=============================================================

            Action<int> f2a;       // declaration d'une variable d'un type delegate ANONYM
                                   // Action<T1, T2,...,Tn>  le retour est toujours void
                                   // Func<int, void> n'existe pas. Func avec résultat void est Action

            f2a = myF4;
            f2a(9);

            f2a = s => Console.WriteLine("Action - Lambda:" + s);
            f2a(9);

            f2a = delegate (int s) { Console.WriteLine("Action - Mèthode anonyme:" + s); };
            f2a(9);

            f2a = new Action<int>(s => Console.WriteLine("Action - Lambda:" + 2 * s));
            f2a(9);

            new Action<int>(s => Console.WriteLine("Action - Lambda:" + 3 * s))(9);

            //========================================================================

            // si la variable est déclarée comme var, alors seulement les trois formes ci-dessous marchent.

            var f3 = new MyFunctionType(s => 70 * s);
            Console.WriteLine("Lambda s => 70 * s : " + f3(9));

            var f4 = new Func<int, int>(s => 70 * s);
            Console.WriteLine("Lambda s => 70 * s : " + f4(9));

            var f5 = new Action<int>(s => Console.WriteLine("Action - Lambda:" + 70 * s));
            f5(9);

            Console.ReadKey();
        }
    }
}
