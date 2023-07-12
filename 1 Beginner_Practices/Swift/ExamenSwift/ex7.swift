struct Student {
  var name: String
  var age: Int
  var gender: Gender
  var college: College
}

enum Gender {
  case male
  case female

}

enum College {
  case grasset
  case rosemont
  case maisonNeuve
}

let alpha = Student(name: "Alpha", age: 20, gender: Gender.male, college: College.grasset)
let marie = Student(name: "Marie", age: 21, gender: Gender.female, college: College.maisonNeuve)

var students = [alpha, marie]

func filterByCollege(students: [Student], college: College) -> [Student] {
  return students.filter { student in
    student.college == college
  }
}

let filteredStudents = filterByCollege(students: students, college: College.maisonNeuve)

print(filteredStudents) // prints [marie]
