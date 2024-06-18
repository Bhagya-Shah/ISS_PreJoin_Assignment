-- Create the database
CREATE DATABASE SchoolDB;

-- Use the database
USE SchoolDB;

-- Create Students table
CREATE TABLE Students (
    ID INT IDENTITY(1,1) PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    Age INT,
    Department VARCHAR(100),
    Grade CHAR(1)
);

-- Create Departments table
CREATE TABLE Departments (
    DeptID INT IDENTITY(1,1) PRIMARY KEY,
    DeptName VARCHAR(100) NOT NULL
);


-- Insert data into Students table
INSERT INTO Students (Name, Age, Department, Grade) VALUES ('Ankit', 20, 'ML', 'A');
INSERT INTO Students (Name, Age, Department, Grade) VALUES ('Bhagya', 22, 'AI', 'A');
INSERT INTO Students (Name, Age, Department, Grade) VALUES ('Mahek', 21, 'DS', 'B');
INSERT INTO Students (Name, Age, Department, Grade) VALUES ('Shubham', 23, 'CS', 'C');


-- Insert data into Departments table
INSERT INTO Departments (DeptName) VALUES ('ML');
INSERT INTO Departments (DeptName) VALUES ('AI');
INSERT INTO Departments (DeptName) VALUES ('DS');
INSERT INTO Departments (DeptName) VALUES ('CS');


-- Basic SELECT query
SELECT * FROM Students;


-- Using DISTINCT
SELECT DISTINCT Department FROM Students;


-- Using WHERE clause
SELECT * FROM Students WHERE Age > 21;


-- Using AND & OR
SELECT * FROM Students WHERE Age > 21 AND Grade = 'A';
SELECT * FROM Students WHERE Age > 21 OR Grade = 'A';


-- Using ORDER BY
SELECT * FROM Students ORDER BY Name ASC;


-- Using SELECT TOP
SELECT TOP 2 * FROM Students;


-- Using LIKE
SELECT * FROM Students WHERE Name LIKE 'A%';

-- Using Wildcards
SELECT * FROM Students WHERE Name LIKE '%e%';

-- Using IN
SELECT * FROM Students WHERE Department IN ('DS', 'CS');

-- Using BETWEEN
SELECT * FROM Students WHERE Age BETWEEN 20 AND 22;

-- Using Aliases
SELECT Name AS StudentName, Department AS Dept FROM Students;

-- Updating data
UPDATE Students SET Grade = 'B' WHERE Name = 'Shubham';
SELECT * from Students where Name='Shubham';

-- Deleting data
DELETE FROM Students WHERE Name = 'Ankit';
Select * From Students;







