REST Application

It is a school based REST Application where CURD Operation can be performed using RESt APIs.
REST API Definition:
	
To get All the students List: 
	HTTP Method: GET
	URL: http://localhost:8080/restapp/students
	RESPONSE: JSON/XML Format having all the students.

To get specific student: 
	HTTP Method: GET
	URL: http://localhost:8080/restapp/students/{studentid}
	RESPONSE: JSON/XML Format having particular student record if found.
To Add a student in existing List:
	HTTP Method: POST
	URL: http://localhost:8080/sample/restapp/students
	RESPONSE: JSON/XML Format having all the Student list [Including new Student
