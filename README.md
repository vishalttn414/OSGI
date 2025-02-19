this repo contains solution of below Question
1. Create service ClassConfigurationService that allows two configuration :
 a) No. of students allowed in the class
b) marks required by the student to pass the class
also it exposes two methods :
a) isClassLimitReached(List) // returns true if the list size is less than the configured allowed size
b) getPassingMarks() // returns the passing marks required
2. Create another service StudentClassService that maintains the list of students in the class and make use of ClassConfigurationService and exposes the following methods :
addStudent(student values)
deleteStudent(id)
isStudentPassed(id)
getStudent(id)
getAllStudents()
A student may have id,name , marks obtained,age etc
Access the service and print a students information.
