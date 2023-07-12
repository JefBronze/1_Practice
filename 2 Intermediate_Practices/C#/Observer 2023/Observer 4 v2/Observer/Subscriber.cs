using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Observer
{
    public class Subscriber : AbstractSubscriber
    {
        public String Nom { get; private set; }

        public Subscriber(String nom)
        {
            this.Nom = nom;         
        }
    }
}
