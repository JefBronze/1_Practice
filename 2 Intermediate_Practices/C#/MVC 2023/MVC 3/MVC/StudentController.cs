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

        private bool viewUpdating = false;

        public void modelIdUpdated()
        {
            viewUpdating = true;
            view.setTextBox1(model.Id);
            viewUpdating = false;
        }

        public void modelNameUpdated()
        {
            viewUpdating = true;
            view.setTextBox2(model.Name);
            viewUpdating = false;
        }

        public void viewIdUpdated(String id )
        {
            if (!viewUpdating)
            {
                model.setId(id);
            }
        }

        public void viewNameUpdated(String name)
        {
            if (!viewUpdating)
            {
                model.setName(name);
            }
        }
    }
}
