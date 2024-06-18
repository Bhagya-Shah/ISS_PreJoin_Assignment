use EmployeeDB;

--Handling -> Null values
--Showing employees, defaulting DeptName to 'No Department' if NULL
SELECT Name, ISNULL(
	(
	SELECT DeptName FROM Departments WHERE DeptID = Employees.DeptID), 'No Department'
	) AS DeptName, 
	Salary
FROM Employees;

-- Using GROUP BY and HAVING -> Count employees in each department
select dp.DeptName , count(e.EmpID) as NumOfEmployees from Departments 
dp LEFT JOIN Employees e ON dp.DeptID = e.DeptID 
group by dp.DeptName 
having count(e.EmpID)>0;

-- Aggregate Functions -> Average, Max, Min salary of employees
SELECT AVG(Salary) AS AverageSalary, MAX(Salary) AS MaxSalary, MIN(Salary) AS MinSalary FROM Employees;




