using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExempleLambda5
{
    class Program
    {
        private delegate T MyFunctionType<T>(T a);  // declaration d'un type delegate générique nomé MyFunctionType.

        private static int myF1(int a) { return a + 1; }
        private static double myF2(double a) { return a + 2.5; }
        private static string myF3(string a) { return ">> " + a + " <<"; }

        private delegate void MyFunctionType2(int a, ref int b);  // ref et out ne sont possible dans Func ni Action

        private delegate void MyFunctionType3<T>(T a, ref T b);  // ref et out ne sont possible dans Func ni Action

        private static void myF4(int a, ref int b) { b= a + b; }

        private static void myF5(double a, ref double b) { b = a + b; }


        static void Main(string[] args)
        {
            MyFunctionType<int> f_i = myF1;
            Console.WriteLine("myF1: " + f_i(9));

            MyFunctionType<double> f_d = myF2;
            Console.WriteLine("myF2: " + f_d(9));

            MyFunctionType<string> f_s = myF3;
            Console.WriteLine("myF3: " + f_s("A10"));

            f_i = a =>  a + 10 ;
            Console.WriteLine("Lambda: " + f_i(9));

            f_i = delegate (int a) { return a + 10; };
            Console.WriteLine("Mèthode anonyme: " + f_i(9));

            MyFunctionType2 f2;
            int y = 3; 
            f2 = myF4;
            f2(9, ref y);
            Console.WriteLine("y = " + y);

            y = 3;
            f2 = (int s, ref int t) => t = s + t;     // lambda with ref ou out doit declarer les types des arguments
            f2(9, ref y);
            Console.WriteLine("y = " + y);

            y = 3;
            f2 = delegate (int s, ref int t) { t = s + t; };
            f2(9, ref y);
            Console.WriteLine("y = " + y);

            MyFunctionType3<double> f3;
            double x = 3.5;
            f3 = myF5;
            f3(9, ref x);
            Console.WriteLine("x = " + x);

            x = 3.5;
            f3 = (double s, ref double t) => t = s + t;    // lambda with ref ou out doit declarer les types des arguments
            f3(9, ref x);
            Console.WriteLine("x = " + x);

            x = 3.5;
            f3 = delegate (double s, ref double t) { t = s + t; };
            f3(9, ref x);
            Console.WriteLine("x = " + x);

            Console.ReadKey();
        }
    }
}
