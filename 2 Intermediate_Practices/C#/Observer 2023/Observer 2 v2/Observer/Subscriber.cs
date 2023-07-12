using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Observer
{
    public class Subscriber
    {
        private String nom;

        public String Nom { get => nom; }

        public Listener PListener { get; private set; }

        public Subscriber(String nom)
        {
            this.nom = nom;

            PListener = new Listener(this,
                (ap, o) => { Console.WriteLine("Subscriber : " + 
                nom + " -- Data received : " + (String)o + " --- From : " + ((Publisher)ap).Nom); }
            );
        }

        /* 
         * Note that each class Subscriber must have an attribut 
         * of type Listener with private set and initialize it. 
         * 
         * We can consider creating an abstract class AbstractSubscriber 
         * to take care of those things. Se next example. 
         */ 

    }
}
