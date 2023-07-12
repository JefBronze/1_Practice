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

        public void setStudentName(String name)
        {
            model.Name = name;
        }

        public String getStudentName()
        {
            return model.Name;
        }

        public void setStudentID(String id)
        {
            model.Id=id;
        }

        public String getStudentId()
        {
            return model.Id;
        }

        public void updateView()
        {
            view.printStudentDetails(model.Id, model.Name);
        }

    }
}
