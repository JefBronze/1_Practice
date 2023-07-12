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
    public partial class StudentView : Form
    {
        public StudentView()
        {
            InitializeComponent();
        }

        private bool controller = false;        

        internal void setTextBox1(String s)
        {
             controller = true; 
             textBox1.Text = s;
             controller = false;           
        }

        internal void setTextBox2(String s)
        {
            controller = true;
            textBox2.Text = s;
            controller = false;
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
            if (!controller)
            {
                Program.studentController.viewIdUpdated(textBox1.Text);
            }
        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {
            if (!controller)
            {
                Program.studentController.viewNameUpdated(textBox2.Text);
            }
        }
    }
}
