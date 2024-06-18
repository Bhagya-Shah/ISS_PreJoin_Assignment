-- Create the database
CREATE DATABASE EmployeeDB;

-- Use the database
USE EmployeeDB;

-- Create Departments table
CREATE TABLE Departments (
    DeptID INT IDENTITY(1,1) PRIMARY KEY,
    DeptName VARCHAR(100) NOT NULL
);


-- Create Employees table
CREATE TABLE Employees (
    EmpID INT IDENTITY(1,1) PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    Age INT,
    DeptID INT,
    Salary DECIMAL(10, 2),
    CONSTRAINT fk_department FOREIGN KEY (DeptID) REFERENCES Departments(DeptID)
);


-- Insert data into Departments table
INSERT INTO Departments (DeptName) VALUES ('HR');
INSERT INTO Departments (DeptName) VALUES ('Engineering');
INSERT INTO Departments (DeptName) VALUES ('Marketing');


-- Insert data into Employees table
INSERT INTO Employees (Name, Age, DeptID, Salary) VALUES ('Bhagya', 30, 1, 60000);
INSERT INTO Employees (Name, Age, DeptID, Salary) VALUES ('Neel', 25, 2, 70000);
INSERT INTO Employees (Name, Age, DeptID, Salary) VALUES ('Shaili', 28, 2, 80000);
INSERT INTO Employees (Name, Age, DeptID, Salary) VALUES ('Shivani', 35, 3, 65000);
INSERT INTO Employees (Name, Age, DeptID, Salary) VALUES ('Saloni', 40, NULL, 90000); -- No department assigned


-- Inner Join: Select employees with their department names
SELECT Employees.Name, Departments.DeptName, Employees.Salary
FROM Employees
INNER JOIN Departments ON Employees.DeptID = Departments.DeptID;



-- Left Join: Select all employees, even those without a department
SELECT Employees.Name, Departments.DeptName, Employees.Salary
FROM Employees
LEFT JOIN Departments ON Employees.DeptID = Departments.DeptID;


-- Right Join: Select all departments, even those without employees
SELECT Employees.Name, Departments.DeptName, Employees.Salary
FROM Employees
RIGHT JOIN Departments ON Employees.DeptID = Departments.DeptID;



-- Full Join: Select all employees and all departments, matching where possible
SELECT Employees.Name, Departments.DeptName, Employees.Salary
FROM Employees
FULL OUTER JOIN Departments ON Employees.DeptID = Departments.DeptID;

