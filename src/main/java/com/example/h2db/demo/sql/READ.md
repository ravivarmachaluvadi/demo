###### Find the highest paid employee from different department

_SELECT a.[Name], a.[Salary], a.Dept
FROM MyTable a
JOIN (SELECT MAX(Salary) As Highest, Dept FROM MyTable GROUP BY Dept) b
ON a.Dept = b.Dept && a.Salary = b.Highest_