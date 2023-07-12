using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace MVC
{
    public partial class ModelEditor : Form
    {
        public ModelEditor()
        {
            InitializeComponent();
        }

        private void readBtn_Click(object sender, EventArgs e)
        {
            textBox1.Text = Program.model.Id;
            textBox2.Text = Program.model.Name;
        }

        private void writeBtn_Click(object sender, EventArgs e)
        {
            Program.model.Id = textBox1.Text;
            Program.model.Name = textBox2.Text;
        }

        private void ModelEditor_FormClosed(object sender, FormClosedEventArgs e)
        {
            Application.Exit();
        }

        private void ModelEditor_FormClosing(object sender, FormClosingEventArgs e)
        {
            //MessageBox.Show("Pour fermer l'application, fermez la fenêtre Exemple MVC", "Attention");
            //e.Cancel = true;    // Pour annuler la fermeture de la fenêtre
        }
    }
}
