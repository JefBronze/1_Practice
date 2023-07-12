using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExempleLambda6
{
    class Program
    {
        static Func<int, int> comp(Func<int, int> f, Func<int, int> g)
        {
            Console.WriteLine("comp for int");
            return new Func<int, int>(x => g(f(x)));
        }

        static Func<T, V> comp<T, U, V>(Func<T, U> f, Func<U, V> g)
        {
            Console.WriteLine("comp generic");
            return new Func<T, V>(x => g(f(x)));
        }

        static Func<T, V> comp2<T, U, V>(Func<T, U> f, Func<U, V> g)
        {
            Console.WriteLine("comp2");
            return new Func<T, V>(x => g(f(x)));
        }

        static void Main(string[] args)
        {
            var f1 = new Func<int, int>(x => x + 1);
            var f2 = new Func<int, int>(x => 2 * x);
            var f3 = new Func<int, double>(x => 2.5 * x);

            /*
             * There is an overload on comp: "comp for int" and "comp generic"
             * 
             * If we simply call comp(f1,f2) both "comp for int" and "comp generic" 
             * could be used. C# will use the most specific one: "comp for int".
             */
            Console.WriteLine("comp(f1,f2)(5) = " + comp(f1, f2)(5));
            Console.WriteLine("comp(f2,f1)(5) = " + comp(f2, f1)(5));
            Console.WriteLine();

            /* 
             * If we want to use "comp generic" for f1 and f2, we must write
             * comp<int,int,int>(f1,f2)
             */
            Console.WriteLine("comp<int,int,int>(f1,f2)(5) = " + comp<int, int, int>(f1, f2)(5));
            Console.WriteLine("comp<int,int,int>(f2,f1)(5) = " + comp<int, int, int>(f2, f1)(5));
            Console.WriteLine();

            /*
             * Of course, for f1 and f3 the only possiblity is "comp generic".
             * So, if we call comp(f1,f3), "comp generic" will be used
             */
            Console.WriteLine("comp(f1,f3)(5) = " + comp(f1, f3)(5));
            Console.WriteLine();

            /* 
             * Of course, for comp2 there is no overload
             */
            Console.WriteLine("comp2(f1,f2)(5) = " + comp2(f1, f2)(5));
            Console.WriteLine("comp2(f2,f1)(5) = " + comp2(f2, f1)(5));
            Console.WriteLine();

            Console.ReadKey();
        }
    }
}
