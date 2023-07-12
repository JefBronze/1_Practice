using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExempleLambda2
{
    class Program
    {
        private delegate int MyFunctionType1(int a);
        private delegate int MyFunctionType2(int a, int b);


        static void Main(string[] args)
        {

            MyFunctionType1 myF1v1 = a => a + 1;
            MyFunctionType1 myF1v2 = a => { return a + 1; };
            MyFunctionType1 myF1v3 = a => { Console.WriteLine("myF1v3: Bonjour"); return a + 1; };

            Func<int, int> myF1v4 = a => a + 1;
            Func<int, int> myF1v5 = a => { return a + 1; };
            Func<int, int> myF1v6 = a => { Console.WriteLine("myF1v6: Bonjour"); return a + 1; };

            var myF1v7 = new MyFunctionType1(a => { Console.WriteLine("myF1v7: Bonjour"); return a + 1; });
            var myF1v8 = new Func<int, int>(a => { Console.WriteLine("myF1v8: Bonjour"); return a + 1; });

            MyFunctionType2 myF2v1 = (a, b) => a + b + 1;
            MyFunctionType2 myF2v2 = (a, b) => { return a + b + 1; };
            MyFunctionType2 myF2v3 = (a, b) => { Console.WriteLine("myF2v3: Bonjour"); return a + b + 1; };

            Func<int, int, int> myF2v4 = (a, b) => a + b + 1;
            Func<int, int, int> myF2v5 = (a, b) => { return a + b + 1; };
            Func<int, int, int> myF2v6 = (a, b) => { Console.WriteLine("myF2v6: Bonjour"); return a + b + 1; };

            var myF2v7 = new MyFunctionType2((a, b) => { Console.WriteLine("myF2v7: Bonjour"); return a + b + 1; });
            var myF2v8 = new Func<int, int, int>((a, b) => { Console.WriteLine("myF2v8: Bonjour"); return a + b + 1; });


            Console.WriteLine("myF1v1(9) = " + myF1v1(9));
            Console.WriteLine("myF1v2(9) = " + myF1v2(9));
            Console.WriteLine("myF1v3(9) = " + myF1v3(9));
            Console.WriteLine("myF1v4(9) = " + myF1v4(9));
            Console.WriteLine("myF1v5(9) = " + myF1v5(9));
            Console.WriteLine("myF1v6(9) = " + myF1v6(9));
            Console.WriteLine("myF1v7(9) = " + myF1v7(9));
            Console.WriteLine("myF1v8(9) = " + myF1v8(9));

            Console.WriteLine("myF2v1(98,1) = " + myF2v1(98, 1));
            Console.WriteLine("myF2v2(98,1) = " + myF2v2(98, 1));
            Console.WriteLine("myF2v3(98,1) = " + myF2v3(98, 1));
            Console.WriteLine("myF2v4(98,1) = " + myF2v4(98, 1));
            Console.WriteLine("myF2v5(98,1) = " + myF2v5(98, 1));
            Console.WriteLine("myF2v6(98,1) = " + myF2v6(98, 1));
            Console.WriteLine("myF2v7(98,1) = " + myF2v7(98, 1));
            Console.WriteLine("myF2v8(98,1) = " + myF2v8(98, 1));

            Console.WriteLine("Anonym: " + new MyFunctionType1(a => 10 * a)(9));
            Console.WriteLine("Anonym: " + new Func<int, int>(a => 10 * a)(9));

            Console.ReadKey();

        }
    }
}
