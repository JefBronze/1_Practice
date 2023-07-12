using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Factory
{
    public static class FabriqueChat
    {
        public static Chat getChat(Race race)
        {
            Chat c = null; 
            switch (race)
            {
                case Race.Balinais: c = new Balinais(); break;
                case Race.Bengal: c = new Bengal(); break;
                case Race.Siamois: c = new Siamois(""); break;
                case Race.Persan: c = new Persan(); break;
                case Race.Exotic: c = new Exotic(); break;
            }
            return c;
        }
    }
}
