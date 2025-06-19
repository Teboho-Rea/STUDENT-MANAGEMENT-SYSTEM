--CREATE DATABASE Student_management_system;
  CREATE DATABASE Student_management_system;

--USE Student_management_system;
 USE Student_management_system;

 --CREATE TABLE Students
   CREATE TABLE Students(
    Student_id INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(25),
    Surname VARCHAR(25),
    Age INT,
    Level INT,
    Course_name VARCHAR(25),
    Date_of_birth DATE,
    Email_address VARCHAR(25),
    Phone_number VARCHAR (20),
    Address VARCHAR(30),
    Enrollment_Date DATE
   );

--CREATE TABLE Courses
  CREATE TABLE Courses(
    Course_id INT AUTO_INCREMENT PRIMARY KEY,
    Course_name varchar(25),
    Credit INT
  );

--CREATE TABLE Enrollments
  CREATE TABLE Enrollments(
    Enrollment_id INT PRIMARY KEY,
    Student_id INT,
    FOREIGN KEY(Student_id) REFERENCES students(Student_id),
    Course_id INT,
    Enrollment_Date DATE,
    Level varchar(15)
  );

--CREATE TABLE Faculty
  CREATE TABLE Faculty(
    Faculty_id INT(30)PRIMARY KEY,
    Name varchar(25),
    Email_address varchar(25),
    Department varchar(25)
  );

--INSERT INTO Students
 INSERT INTO Students(Student_id,Name,Surname,Age,Level,Course_name,Date_of_birth,Email_address,Phone_number,Address,Enrollment_date)VALUES
(001,"Lucky","Sithole",22,5,"Elecrical Engineering",'2003-08-18',"luckysithole03@gmail.com","0730736515","12 Libra Street",'2024-02-22'),
(002,"Lebo","Kim",24,4,"Beauty Therapy",'2001-06-23',"Lebo070@gmail.com","0824581245","45 Dan section",'2024-02-11'),
(003,"Thato","Blue",20,7,"Human Resources",'2005-07-12',"Thatoblue@gmail,com","0764537601","Don Vin Street",'2024-02-11'),
(004,"Lesego","Steazy",20,6,"Computer Science",'2005-12-16',"Steazy707@gmail.com","0651174548","99 Pimville",'2024-02-15'),
(005,"Bafana","Jobe",23,2,"Mechanical Engineering",'2002-02-01',"Jobe204@gmail.com","0845245481","55 Full Moon",'2025-03-01'),
(006,"Pinky","White",22,4,"Beauty Therapy",'2003-05-11',"Pinkywhite11@gmail.com","0713524537","27 Student Road",'2025-02-05'),
(007,"Thando","Nkosi",21,5,"Journalism",'2004-02-14',"thandonkosi5@gmail.com","0845245481","18 zuma section",'2024-03-01'),
(008,"Khanya","Maqaqa",22,1,"Electrical Engineering",'2003-01-07',"Maqaqakhanya01@gmail.com","0791125759","221 Mngadi section",'2024-01-29'),
(009,"Naledi","Mofokeng",20,7,"Beauty Therapy",'2005-01-15',"Naledimofokeng7@gmail.com","0714537680","45 Thokoza gardens",'2025-03-03'),
(0010,"Nthabiseng","Mokoena",23,3,"Information Technology",'2001-04-27',"nthabisengmokoena4@gmail,com","0724412600","3332 Mkhonto street",'2024-02-25');

--INSERT INTO Courses
  INSERT INTO Courses(Course_id, Course_name, Credits) VALUES
(101,"Mechanical Engineering",5),
(102,"Beauty Therapy",3),
(105,"Electrical Engineering",5),
(103,"Information Technology",4),
(106,"Journalism",3),
(104,"Human Resources",4),
(107,"Computer studies",4); 

--INSERT INTO ENROLLMENT
INSERT INTO `enrollments`(Enrollment_id, Student_id, Course_id, Enrollment_Date, Level) VALUES 
(2001,001,105,2024-02-22,5),
(2002,002,102,2024-02-11,4),
(2003,003,104,2024-02-15,7),
(2004,004,107,2024-02-15,6),
(2005,005,101,2025-03-01,2),
(2006,006,102,2025-02-05,5),
(2007,007,106,2024-03-01,4),
(2008,008,105,2024-01-29,1),
(2009,009,102,2024-03-03,7),
(2010,0010,103,2024-02-25,3);

--INSERT INTO Faculty
INSERT INTO faculty(Faculty_id, Name, Email_address, Departments) VALUES
(123,"Prof John Smith","Johnsmith7@gmail.com","STEM"),
(124,"Prof Neil Armstrong","Neilarmstrong1@gmail.com","Humanities"),
(125,"Prof Judith Butler","butlerjudith01@gmail.com","BTI"),
(126,"Prof McGonagall","mcgonagallprof@gmail.com","Faculty of Humanities");

--SQL QUERIES
SELECT * 
FROM Students;

SELECT * 
FROM Students 
WHERE Course_name = 'Electrical Engineering';

SELECT * 
FROM Students 
WHERE Enrollment_date = (SELECT MAX(Enrollment_date) FROM Students);

SELECT * 
FROM Students 
WHERE YEAR (Date_of_birth) <2003;

SELECT * 
FROM Courses;

SELECT * 
FROM Courses 
WHERE Credits = 4;

SELECT * 
FROM enrollments 
WHERE Student_id = 001;

SELECT * 
FROM enrollments 
WHERE Level = 5;

SELECT Faculty_id, 
Name, Email_address FROM Faculty;

SELECT * FROM Faculty 
WHERE Departments = 'Humanities'
