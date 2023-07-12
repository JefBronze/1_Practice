using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MVC
{
    public class StudentView
    {
        public void printStudentDetails(String studentId, String studentName)
        {
            Console.WriteLine("=== Student ================ ");
            Console.WriteLine("Student Id: " + studentId);
            Console.WriteLine("Student Name: " + studentName);
            Console.WriteLine("============================ ");
            Console.WriteLine();


        }
    }
}
