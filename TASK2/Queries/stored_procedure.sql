-- stored procedure to get employee details by ID
CREATE PROCEDURE GetEmployeeById
    @EmployeeID INT
AS
BEGIN
    SELECT * FROM Employees WHERE EmpID = @EmployeeID;
END;

-- Execute the stored procedure
EXEC GetEmployeeById @EmployeeID = 2;
EXEC GetEmployeeById @EmployeeID = 3;
