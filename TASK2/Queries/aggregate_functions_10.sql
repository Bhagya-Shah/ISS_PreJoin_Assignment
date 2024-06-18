use EmployeeDB

-- Total number of employees
select count(*) as TotalNumberOfEmployees from Employees;

-- Sum of all salaries paid
select SUM(Salary) as TotalPaidSalaries from SalaryPaid;

-- Average salary of all employees
select AVG(Salary) as AverageSalary from Employees;

-- Minimum salary of all employees
SELECT MIN(Salary) AS MinimumSalary FROM Employees;

-- Maximum salary of all employees
SELECT MAX(Salary) AS MaximumSalary FROM Employees;

-- Total number of employees per department
SELECT DeptID, COUNT(*) AS EmployeesCount
FROM Employees
GROUP BY DeptID;
GO

-- Sum of salaries per department
SELECT DeptID , SUM(Salary) AS TotalDepartmentSalaries
FROM Employees
GROUP BY DeptID Having SUM(Salary)>0;

-- Sum of salaries per department with DepartmentName
SELECT d.DeptName, SUM(e.Salary) AS TotalDepartmentSalaries
FROM Employees e
JOIN Departments d ON e.DeptID = d.DeptID
GROUP BY d.DeptName
HAVING SUM(e.Salary) > 0;

-- Average salary per department
SELECT DeptID, AVG(Salary) AS AverageDepartmentSalary
FROM Employees
GROUP BY DeptID;

-- Average salary per department by department name
SELECT d.DeptName, AVG(Salary) AS AverageSalaryPerDept 
from Employees e Left JOIN Departments d on d.DeptID = e.DeptID
group by d.DeptName


-- Minimum and maximum salary per department
SELECT DeptID, MIN(Salary) AS MinDepartmentSalary, MAX(Salary) AS MaxDepartmentSalary
FROM Employees
GROUP BY DeptID;


-- Total salary paid on each date
SELECT PaidDate, SUM(Salary) AS TotalPaidOnDate
FROM SalaryPaid
GROUP BY PaidDate;


-- Number of employees hired each year
SELECT YEAR(HireDate) AS HireYear, COUNT(*) AS HiresPerYear
FROM Employees
GROUP BY YEAR(HireDate);

SELECT EMPID, SALARY FROM EMPLOYEES ORDER BY EmpID ASC;

INSERT INTO SalaryPaid(EmpID, Salary, PaidDate)
VALUES
(4,65000,'2024-07-30'),
(5,90000,'2025-01-01'),
(6,60000,'2024-07-30');

-- Total salary paid each month
SELECT YEAR(PaidDate) AS PaidYear, MONTH(PaidDate) AS PaidMonth, SUM(Salary) AS AverageMonthlySalary
FROM SalaryPaid
GROUP BY YEAR(PaidDate), MONTH(PaidDate);
