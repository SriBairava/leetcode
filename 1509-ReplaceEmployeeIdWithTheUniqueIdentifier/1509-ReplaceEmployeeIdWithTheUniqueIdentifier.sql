-- Last updated: 20/07/2026, 11:09:15
SELECT 
    EmployeeUNI.unique_id, 
    Employees.name
FROM 
    Employees
LEFT JOIN 
    EmployeeUNI 
ON 
    Employees.id = EmployeeUNI.id;
