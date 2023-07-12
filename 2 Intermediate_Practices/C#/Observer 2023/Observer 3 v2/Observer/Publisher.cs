using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Observer
{
    public class Publisher  : AbstractPublisher
    {
        public String Nom { get; private set; }

        private String data = "";

        public String Data
        {
            get => data;
            set
            {
                if (data != value)
                {
                    /* 
                     * if data has changed, the subscribers must be notified 
                     */
                    data = value;
                    notifySubscribers(data);
                }
            }
        }

        public Publisher(String nom)
        {
            this.Nom = nom;
        }



    }
}
