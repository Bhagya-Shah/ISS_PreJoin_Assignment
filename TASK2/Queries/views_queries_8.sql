use EmployeeDB;

-- Creating a View to show employees with their department names
CREATE VIEW EmployeeDetails AS
SELECT Employees.Name, Departments.DeptName, Employees.Salary
FROM Employees
LEFT JOIN Departments ON Employees.DeptID = Departments.DeptID;

-- Selecting from the View
SELECT * FROM EmployeeDetails;

-- Create view combining Employees, Departments, and SalaryPaid
CREATE VIEW FullEmployeeDetails AS
SELECT 
    e.EmpID,
    e.Name,
    e.Age,
    e.Salary AS BaseSalary,
    e.HireDate,
    d.DeptName,
    sp.Salary AS PaidSalary,
    sp.PaidDate
FROM Employees e
JOIN Departments d ON e.DeptID = d.DeptID
JOIN SalaryPaid sp ON e.EmpID = sp.EmpID;

--Viewing view
select * from FullEmployeeDetails;
