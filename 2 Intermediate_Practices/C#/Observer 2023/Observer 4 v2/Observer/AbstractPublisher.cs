using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Observer
{
    public abstract class AbstractPublisher
    {
        protected List<AbstractSubscriber> list = new List<AbstractSubscriber>();

        protected void notifySubscribers(Object o)
        {
            foreach (AbstractSubscriber s in list)
            {
                s.ListenerDict[this].inform(this, o);
            }
        }

        public void subscribe(AbstractSubscriber s)
        {
            list.Add(s);
        }
        public void unsubscribe(AbstractSubscriber s)
        {
            list.Remove(s);
        }
    }
}
