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

        public Subscriber(String nom)
        {
            this.nom = nom;
        }

        /* 
         * Call-back function à être appelé par le Publisher pour notifier le Subscriber 
         */
        public void inform(Publisher p, String d)  
        {

            Console.WriteLine("Subscriber : " + nom + " -- Data received : " + d + " --- From : "+ p.Nom);
        }

        /* 
         * to subscribe to a Publisher
         */
        public void AddListener (Publisher p)
        {
            p.subscribe(this);
        }

        /* 
         * to unsubscribe to a Publisher
         */
        public void RemoveListener(Publisher p)
        {
            p.unsubscribe(this);
        }

    }
}
