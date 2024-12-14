curl localhost:8080/students
echo
curl localhost:8080/students/1
echo
curl localhost:8080/students/2
echo
curl localhost:8080/students/3
echo
curl localhost:8080/students/4
echo
curl -X POST localhost:8080/student -H 'Content-type:application/json' -d '{"name": "Bob", "gpa": "50"}'
echo
curl -X POST localhost:8080/student -H 'Content-type:application/json' -d '{"name": "Bill", "gpa": "60"}'
echo
curl localhost:8080/students
echo
curl -X PUT localhost:8080/student/1 -H 'Content-type:application/json' -d '{"name": "Jane", "gpa": "80"}'
echo
curl -X PUT localhost:8080/student/2 -H 'Content-type:application/json' -d '{"name": "Joe", "gpa": "90"}'
echo
curl localhost:8080/students
echo
