-- Last updated: 20/07/2026, 11:11:06
SELECT Person.lastname, Person.firstname, Address.city, Address.state
FROM Person LEFT JOIN Address
ON Person.PersonId = Address.PersonId