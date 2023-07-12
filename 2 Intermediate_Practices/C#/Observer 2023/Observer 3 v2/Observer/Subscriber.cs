using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Observer
{
    public class Subscriber : AbstractSubscriber
    {
        private String nom;

        public String Nom { get => nom; }

        public Subscriber(String nom)
        {
            this.nom = nom;

            SetListener( (ap, o) => { Console.WriteLine("Subscriber : " + nom 
                + " -- Data received : " + (String)o 
                + " --- From : " + ((Publisher)ap).Nom); }
            );
        }

       

       

  


    }
}
