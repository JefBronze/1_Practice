using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Factory
{
    public class Siamois : Chat
    {
        public String Nom { get; private set; }
        public Siamois(String nom)
        {
            Nom = nom;
        }
        public override String race()
        {
            return "Je suis un chat Siamois";
        }
    }
}
