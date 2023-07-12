using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Observer
{
    public abstract class AbstractSubscriber
    {
        public Dictionary<AbstractPublisher, Listener> ListenerDict = new Dictionary<AbstractPublisher, Listener>();

        public void AddListener(AbstractPublisher ap, Listener.InformMethod IM)
        {
            ap.subscribe(this);
            ListenerDict.Add(ap, new Listener(IM));
        }

        public void RemoveListener(AbstractPublisher ap)
        {
            ap.unsubscribe(this);
            ListenerDict.Remove(ap);
        }

    }
}
