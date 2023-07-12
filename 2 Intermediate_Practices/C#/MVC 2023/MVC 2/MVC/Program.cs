using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace MVC
{
    static class Program
    {
        internal static Student model ;
        private static StudentView view;
        internal static StudentController studentController; 

        static ModelEditor modelEditor;

        /// <summary>
        /// The main entry point for the application.
        /// </summary>
        [STAThread]
        static void Main()
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);

            model = new Student();
            view = new StudentView();
            studentController = new StudentController(model, view);

            modelEditor = new ModelEditor();
            modelEditor.Visible = true;            
            Application.Run(view);

        }
        
    }
}
