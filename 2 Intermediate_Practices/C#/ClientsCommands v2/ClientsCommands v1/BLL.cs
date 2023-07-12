using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace BusinessLayer
{
    internal class Clients
    {
        internal static int UpdateClients()
        {
            // ================================================
            // Business rules for Clients
            // ================================================

            return Data.Clients.UpdateClients();
        }

    }

    internal class Commandes
    {
        internal static int UpdateCommandes()
        {
            // ================================================
            // Business rules for Commandes
            // ================================================

            DataTable dt = Data.Commandes.GetCommandes().GetChanges(DataRowState.Added | DataRowState.Modified);
            if ((dt != null) && ((dt.Select("Prix < 10").Length > 0)))
            {
                MessageBox.Show("Les prix inférieurs à 10 ne sont pas acceptés");
                Data.Commandes.GetCommandes().RejectChanges();
                return -1;
            }
            else
            {
                return Data.Commandes.UpdateCommandes();
            }

        }
    }

}
