using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Observer
{
    public abstract class AbstractPublisher
    {
        /* 
         * All Publishers must know their Subscribers          
         */
        protected List<Subscriber> list = new List<Subscriber>();

        /* 
         * All Publishers must notify their Subscribers 
         * by calling the call-back function inform() of 
         * each Subscriber
         */
        protected void notifySubscribers(Object o)
        {
            foreach (Subscriber s in list)
            {
                s.PListener.inform(this, o);
            }
        }

        /* 
         * All Publisher must have this method 
         * to add a new subscriber 
         */
        public void subscribe(Subscriber s)
        {
            list.Add(s);
        }

        /* 
         * All Publisher must have this method 
         * to remove a subscriber 
         */
        public void unsubscribe(Subscriber s)
        {
            list.Remove(s);
        }
    }
}
