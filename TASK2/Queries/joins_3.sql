USE SchoolDB;
INSERT INTO Students (Name, Age, Department, Grade) VALUES ('Mihir', 24, 'ML', 'B');
INSERT INTO Students (Name, Age, Department, Grade) VALUES ('Neel', 21, 'AI', 'A');
INSERT INTO Students (Name, Age, Department, Grade) VALUES ('Sumit', 18, 'DS', 'C');
INSERT INTO Students (Name, Age, Department, Grade) VALUES ('Dhruvi', 23, 'CS', 'A');
INSERT INTO Students (Name, Age, Department, Grade) VALUES ('Manan', 19, 'ML', 'C');
INSERT INTO Students (Name, Age, Department, Grade) VALUES ('Moksh', 22, 'AI', 'A');
INSERT INTO Students (Name, Age, Department, Grade) VALUES ('Aryan', 23, 'DS', 'A');
INSERT INTO Students (Name, Age, Department, Grade) VALUES ('Jinal', 20, 'CS', 'A');


-- Inner Join
SELECT Students.Name, Departments.DeptName
FROM Students
INNER JOIN Departments ON Students.Department = Departments.DeptName;

-- Left Join
SELECT Students.Name, Departments.DeptName
FROM Students
LEFT JOIN Departments ON Students.Department = Departments.DeptName;

-- Right Join
SELECT Students.Name, Departments.DeptName
FROM Students
RIGHT JOIN Departments ON Students.Department = Departments.DeptName;

-- Full Join
SELECT Students.Name, Departments.DeptName
FROM Students
FULL OUTER JOIN Departments ON Students.Department = Departments.DeptName;


