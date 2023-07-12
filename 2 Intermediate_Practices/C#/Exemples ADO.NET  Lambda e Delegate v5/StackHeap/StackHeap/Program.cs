using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StackHeap
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] a = new int[] { 2, 5, 10 };
            int[] b = new int[] { 14, 20 };

            Console.WriteLine("length of b = " + b.Length);
            Console.WriteLine("b[0] = " + b[0]);
            Console.WriteLine("b[1] = " + b[1]);

            b = a;

            Console.WriteLine("length of b = " + b.Length);
            Console.WriteLine("b[0] = " + b[0]);
            Console.WriteLine("b[1] = " + b[1]);

            a[0] = 500;

            Console.WriteLine("b[0] = " + b[0]);
            Console.WriteLine("b[1] = " + b[1]);

            Console.ReadKey();
        }
    }
}
