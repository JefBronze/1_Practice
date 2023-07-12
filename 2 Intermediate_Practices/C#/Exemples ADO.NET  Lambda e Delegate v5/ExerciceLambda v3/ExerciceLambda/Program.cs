using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExerciceLambda
{
    class Program
    {
        static void Main(string[] args)
        {
            var f = new Func<int[], int>(a =>
             {
                 int pos = 0;
                 for (int i =0; i<a.Length; i++)
                 {
                     if (a[i] > a[pos]) { pos = i; }

                 }
                 return pos;
             });

            int[] anArray = new int[] { 34, 54, 12, 144, 25 };
            int maxPos = f(anArray);
            Console.WriteLine(" index of the maximum is " + maxPos);
            Console.WriteLine(" the maximum is " + anArray[maxPos]);
            Console.WriteLine();

            Console.WriteLine(" Without using 'f' ");

            int maxPos2 = new Func<int[], int>(a =>
            {
                int pos = 0;
                for (int i = 0; i < a.Length; i++)
                {
                    if (a[i] > a[pos]) { pos = i; }

                }
                return pos;
            })(anArray);

            Console.WriteLine(" index of the maximum is " + maxPos2);
            Console.WriteLine(" the maximum is " + anArray[maxPos2]);
            Console.WriteLine();

            //========================================================

            void g(int x)
            {
                Console.WriteLine(" x = " + x);
            }

            g(10);

            var h = new Action<int>(x => { Console.WriteLine(" x = " + x); });

            h(10);

            new Action<int>(x => { Console.WriteLine(" x = " + x); })(10);

            Console.ReadKey();


        }
    }
}
