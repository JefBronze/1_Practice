using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Factory
{
    public static class FabriqueChat
    {
        public static Chat getChat(String race)
        {
            Chat c = null; 
            switch (race)
            {
                case "Balinais": c = new Balinais(); break;
                case "Bengal": c = new Bengal(); break;
                case "Siamois": c = new Siamois(""); break;
                case "Persan": c = new Persan(); break;
                case "Exotic": c = new Exotic(); break;
            }
            return c;
        }
    }
}
