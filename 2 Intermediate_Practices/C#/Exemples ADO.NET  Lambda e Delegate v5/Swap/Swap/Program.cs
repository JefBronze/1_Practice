using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Swap
{
    class Program
    {
        static void Swap(int a, int b)
        {
            int temp = a;
            a = b;
            b = temp;
        }

        static void Swap(ref int a, ref int b)
        {
            int temp = a;
            a = b;
            b = temp;
        }

        static void Main(string[] args)
        {
            int x = 10;
            int y = 20;
            Console.WriteLine("x = {0}, y = {1}", x, y);
            Swap(x, y);
            Console.WriteLine("After applying Swap(a, b)...");
            Console.WriteLine("x = {0}, y = {1}", x, y);
            Swap(ref x, ref y);
            Console.WriteLine("After applying Swap(ref a, ref b)...");
            Console.WriteLine("x = {0}, y = {1}", x, y);


            Console.ReadKey();
        }
    }
}
