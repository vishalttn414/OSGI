
FOLDER STRUCTURE


![Screenshot from 2025-02-19 22-23-04](https://github.com/user-attachments/assets/51d13e6b-40ee-4b3f-98f5-4cd5b624c50e)

Working page

![Screenshot from 2025-02-19 22-21-41](https://github.com/user-attachments/assets/be03b600-91d8-4aa4-832f-daf20ec2733e)

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





