using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SwapGeneric
{
    class Program
    {
        static void Swap<T>(ref T a, ref T b)
        {
            T temp = a;
            a = b;
            b = temp;
        }

        static void Main(string[] args)
        {
            int x = 10;
            int y = 20;
            Console.WriteLine("x = {0}, y = {1}", x, y);
            Swap(ref x, ref y);
            Console.WriteLine("After applying Swap(ref a, ref b)...");
            Console.WriteLine("x = {0}, y = {1}", x, y);

            int[] x1 = { 1, 2, 3 };
            int[] y1 = { 0, 0, 0, 0 };

            Console.WriteLine("x1 = [{0}], y1 = [{1}]", string.Join(",", x1), string.Join(",", y1));
            Swap(ref x1, ref y1);
            Console.WriteLine("After applying Swap(ref a, ref b)...");
            Console.WriteLine("x1 = [{0}], y1 = [{1}]", string.Join(",", x1), string.Join(",", y1));

            Console.ReadKey();
        }
    }
}
