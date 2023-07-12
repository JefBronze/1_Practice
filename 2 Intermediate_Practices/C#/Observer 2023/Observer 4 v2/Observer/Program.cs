using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Observer
{
    class Program
    {
        static void Main(string[] args)
        {
            Publisher p1 = new Publisher("p1");
            Subscriber s1 = new Subscriber("s1");
            Subscriber s2 = new Subscriber("s2");
            s1.AddListener(p1,
                (ap, o) => { Console.WriteLine("Subscriber : " + s1.Nom 
                    + " -- Data received : " + (String)o 
                    + " --- From : "  + ((Publisher)ap).Nom); }
                );

            p1.Data = "Bonjour";

            Publisher p2 = new Publisher("p2");
            Subscriber s3 = new Subscriber("s3");
            s3.AddListener(p1,
                (ap,o) => { Console.WriteLine("Subscriber : " + s3.Nom 
                    + " -- Data changed. Current Data received : " + (String)o 
                    + " --- From : " + ((Publisher)ap).Nom); }
                );
            s3.AddListener(p2,
                (ap, o) => { Console.WriteLine("Subscriber : " + s3.Nom
                     + " -- DataChanged Event. Current Data received : " + (String)o
                     + " --- From : " + ((Publisher)ap).Nom);  }
                );

            p1.Data = "Bonsoir";
            p2.Data = "Hello";

            s3.RemoveListener(p1);
            s3.AddListener(p1,
                 (ap, o) => { Console.WriteLine("Subscriber : " + s3.Nom
                      + " -- Data changed. New Data received : " + (String)o
                      + " --- From : " + ((Publisher)ap).Nom);}
                 );

            p1.Data = "Salut";
            p2.Data = "Hi";
           

            Console.ReadKey();
        }
    }
}
