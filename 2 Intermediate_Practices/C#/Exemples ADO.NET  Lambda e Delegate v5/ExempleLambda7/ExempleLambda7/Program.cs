using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExempleLambda7
{
    class Program
    {
        static Func<T, Func<U, V>> curring<T, U, V>(Func<T, U, V> f)
        {
            return new Func<T, Func<U, V>>(x => (y => f(x, y)));
        }

        static void Main(string[] args)
        {

            var multiplier = curring(new Func<int, int, int>((x, y) => x * y));

            var twice = multiplier(2);

            var threeTimes = multiplier(3);

            Console.WriteLine("twice(5) = " + twice(5));

            Console.WriteLine("threeTimes(5) = " + threeTimes(5));

            Console.ReadKey();
        }
    }
}
