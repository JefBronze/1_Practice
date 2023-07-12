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

        private bool modelToView = false;
        private bool viewToModel = false;

        public void modelIdUpdated()
        {
            if (!viewToModel)
            {
                modelToView = true;
                view.setTextBox1(model.Id);
                modelToView = false;
            }
        }

        public void modelNameUpdated()
        {
            if (!viewToModel)
            {
                modelToView = true;
                view.setTextBox2(model.Name);
                modelToView = false;
            }
        }

        public void viewIdUpdated(String id )
        {
            if (!modelToView)
            {
                viewToModel = true;
                model.Id=id;
                viewToModel = false;
            }
        }

        public void viewNameUpdated(String name)
        {
            if (!modelToView)
            {
                viewToModel = true;
                model.Name=name;
                viewToModel = false;
            }
        }
    }
}
