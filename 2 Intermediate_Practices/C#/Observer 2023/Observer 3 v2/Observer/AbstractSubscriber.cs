using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Observer
{
    public abstract class AbstractSubscriber
    {
        public Listener PListener { get; private set; }

        public void SetListener(Listener.InformMethod IM)
        {
            PListener = new Listener(IM);
        }

        /* Once we have an abstract class AbstractSubscriber, 
         * it is more natural to have the methods Listener.Add() 
         * et Listener.Remove() migrated to here. See below. 
         */ 

        public void SubscribeTo(AbstractPublisher ap)
        {
            ap.subscribe(this);
        }

        public void UnsubscribeTo(AbstractPublisher ap)
        {
            ap.unsubscribe(this);
        }

    }
}
