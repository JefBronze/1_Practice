using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MVC
{
    public class Student
    {
        private String id;

        private String name;

        public String Id
        {
            get => id;
            set
            {
                id = value;
                Program.studentController.modelIdUpdated();
            }

        }

        public String Name
        {
            get => name;
            set
            {
                name = value;
                Program.studentController.modelNameUpdated();
            }

        }
    }
}
