/*DATE - format YYYY-MM-DD
DATETIME - format: YYYY-MM-DD HH:MI:SS
SMALLDATETIME - format: YYYY-MM-DD HH:MI:SS
TIMESTAMP - format: a unique number
*/

-- ADD DATE
ALTER TABLE EMPLOYEES ADD HireDate DATE;

-- SET ALL TO DEFAULT DATE
UPDATE Employees 
SET HireDate = '2024-07-04'
where HireDate is null;

select * from Employees;

--adding not null constraint on hiredate
ALTER TABLE EMPLOYEES ALTER COLUMN HireDate Date Not Null;

--insert into table
INSERT INTO Employees (Name, Age, DeptID, Salary, HireDate)
VALUES ('Ariyan',  30, 3, 75000, '2024-07-20');

-- Select employees hired after '2024-07-11'
SELECT * FROM Employees
WHERE HireDate > '2024-07-11';

update Employees 
set HireDate = '2024-07-15'
where EmpID=4;

select Name from Employees where HireDate > '2024-07-18';

-- Delete employees hired after '2024-07-18'
DELETE FROM Employees
WHERE HireDate > '2024-07-18';

