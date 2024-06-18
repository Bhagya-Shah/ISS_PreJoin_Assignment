use EmployeeDB;

-- Using UNION: Combine names of employees from two departments
SELECT Name FROM Employees WHERE DeptID = 1
UNION
SELECT Name FROM Employees WHERE DeptID = 2;

-- Using SELECT INTO: Create a backup of Employees table
SELECT * INTO EmployeesBackup FROM Employees;

-- Using INSERT INTO SELECT: Add a new employee by copying details from an existing one
INSERT INTO Employees (Name, Age, DeptID, Salary)
SELECT 'Harshil', Age, DeptID, Salary FROM Employees WHERE Name = 'Bhagya';

Select * from Employees;
