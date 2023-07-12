using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MVC
{
    class Program
    {
        static void Main(string[] args)
        {
            //fetch student record 
            Student model = retriveStudent();

            //Create a view : to write student details on console
            StudentView view = new StudentView();

            StudentController controller = new StudentController(model, view);

            controller.updateView();

            //update model data
            controller.setStudentName("John");

            controller.updateView();

            Console.ReadKey();
        }

        private static Student retriveStudent()
        {
            Student student = new Student();
            student.Id = "10";
            student.Name ="Robert";           
            return student;
        }
    }
}
