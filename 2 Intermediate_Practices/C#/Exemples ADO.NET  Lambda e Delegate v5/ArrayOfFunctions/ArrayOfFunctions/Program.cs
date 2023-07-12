using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ArrayOfFunctions
{
    class Program
    {
        private delegate int MyFunctionType(int a);

        static void Main(string[] args)
        {
            MyFunctionType[] f1 =new MyFunctionType [3] ;
            f1[0] = s => { return 5 * s; };
            f1[1] = s => { return 8 * s; };
            f1[2] = s => { return 10 * s; };

            for(int i=0; i< f1.Length; i++)
            {
                Console.WriteLine("f1["+i+"](9) = "+f1[i](9));
            }

            MyFunctionType[] f2 = new MyFunctionType[] {
                         s => { return 5 * s; },
                         s => { return 8 * s; },
                         s => { return 10 * s; }
            };

            for (int i = 0; i < f2.Length; i++)
            {
                Console.WriteLine("f2[" + i + "](9) = " + f2[i](9));
            }

            Func<int,int>[] f3 = new Func<int, int>[] {
                         s => { return 5 * s; },
                         s => { return 8 * s; },
                         s => { return 10 * s; }
            };

            for (int i = 0; i < f3.Length; i++)
            {
                Console.WriteLine("f3[" + i + "](9) = " + f3[i](9));
            }

            Console.ReadKey();
        }
    }
}
