use EmployeeDB;

--SalaryPaid table with foreign key constraint
CREATE TABLE SalaryPaid (
    ID int NOT NULL IDENTITY(1,1),
    EmpID int NOT NULL,
    Salary int NOT NULL,
    PaidDate date DEFAULT GETDATE(),
    CONSTRAINT FK_Employee FOREIGN KEY (EmpID) REFERENCES Employees(EmpID)
);


--SalaryPaid table
INSERT INTO SalaryPaid (EmpID, Salary)
VALUES
(1, 60000),
(2, 70000),
(3, 80000);

-- Select all employees
SELECT * FROM Employees;

-- Select all salary payments
SELECT * FROM SalaryPaid;

-- Join
SELECT e.Name, sp.Salary, sp.PaidDate
FROM Employees e
JOIN SalaryPaid sp ON e.EmpID = sp.EmpID;

--join 3 tables
SELECT 
    e.EmpID,
    e.Name,
    e.Age,
    e.Salary AS BaseSalary,
    d.DeptName,
    sp.Salary AS PaidSalary,
    sp.PaidDate
FROM Employees e
JOIN Departments d ON e.DeptID = d.DeptID
JOIN SalaryPaid sp ON e.EmpID = sp.EmpID;
