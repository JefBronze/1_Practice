using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Observer
{
    public class Publisher
    {
        public String Nom { get; private set; }

        /* 
         * A Publisher must know its Subscribers 
         */
        private List<Subscriber> list = new List<Subscriber>();    

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
                    notifySubscribers();
                }
            }
        }

        public Publisher(String nom)
        {
            this.Nom = nom;
        }

        private void notifySubscribers()
        {
            foreach( Subscriber s in list)
            {
                /* 
                 * each Subscriber is notified by calling its call-back function inform() 
                 */
                s.inform(this, Data);
            }
        }

        /* 
         * to add a new subscriber 
         */
        public void subscribe(Subscriber s)
        {
            list.Add(s);
        }

        /* 
         * to remove a subscriber 
         */
        public void unsubscribe(Subscriber s)
        {
            list.Remove(s);
        }
    }
}
