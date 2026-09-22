-- Last updated: 22/09/2026, 09:18:42
SELECT 
    EmployeeUNI.unique_id, 
    Employees.name
FROM 
    Employees
LEFT JOIN 
    EmployeeUNI 
ON 
    Employees.id = EmployeeUNI.id;
