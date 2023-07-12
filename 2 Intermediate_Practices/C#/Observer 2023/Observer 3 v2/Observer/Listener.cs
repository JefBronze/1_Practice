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

        private InformMethod IM;

        public Listener(InformMethod IM)
        {
            this.IM = IM;
        }

        public void inform(AbstractPublisher ap, Object o)
        {

            IM( ap, o);
        }

    }
}
