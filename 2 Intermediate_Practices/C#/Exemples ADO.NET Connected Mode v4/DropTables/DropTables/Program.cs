﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.SqlClient;

namespace DropTables
{
    class Program
    {
        static void Main(string[] args)
        {
            SqlConnectionStringBuilder cs = new SqlConnectionStringBuilder();
            cs.DataSource = "(local)";
            cs.InitialCatalog = "EMP";
            cs.UserID = "sa";
            cs.Password = "sysadm";
            SqlConnection con = new SqlConnection();
            con.ConnectionString = cs.ConnectionString;
            con.Open();
            SqlCommand cmd = con.CreateCommand();
            cmd.CommandText = "DROP TABLE COMPANY";
            try
            {
                cmd.ExecuteNonQuery();
                Console.WriteLine("Tables successfully deleted");
            }
            catch (Exception e)
            {
                Console.WriteLine("Tables not deleted");
            }
            con.Close();
            Console.ReadKey();
        }
    }
}
