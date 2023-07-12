using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MVC
{
    class StudentController
    {
        private Student model;
        private StudentView view;

        public StudentController(Student model, StudentView view)
        {
            this.model = model;
            this.view = view;
        }

        public void modelIdUpdated()
        {
            view.setTextBox1(model.Id);
           
        }

        public void modelNameUpdated()
        {           
            view.setTextBox2(model.Name);
        }

        public void viewIdUpdated(String id )
        {
            model.setId(id);
        }

        public void viewNameUpdated(String name)
        {
            model.setName(name);
        }
    }
}
