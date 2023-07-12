using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Observer
{
    public class Listener
    {
        public delegate void InformMethod(AbstractPublisher ap, Object o);

        private Subscriber s;
        private InformMethod IM;

        public Listener(Subscriber s, InformMethod IM)
        {
            this.s = s;
            this.IM = IM;
        }

        public void inform(AbstractPublisher ap, Object o)
        {

            IM( ap, o);
        }

        public void setIM(InformMethod IM)
        {
            this.IM = IM;
        }

        public void Add(AbstractPublisher ap)
        {
            ap.subscribe(s);
        }

        public void Remove(AbstractPublisher ap)
        {
            ap.unsubscribe(s);
        }

    }
}
