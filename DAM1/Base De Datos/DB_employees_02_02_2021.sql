SELECT * FROM pets.pet;

DESCRIBE pets;

CREATE TABLE IF NOT EXISTS employees (
id INT,
name_employee VARCHAR(30),
year_employee INT
);

SHOW TABLES;

DESCRIBE employees;

ALTER TABLE mployees RENAME TO employees;

ALTER TABLE employees ADD (
oficina int
);

DESCRIBE employees;

ALTER TABLE employees ADD (
boss VARCHAR(20),
department BIT
);

/*
	no ejecuto por que elimina la columna
*/
ALTER TABLE employees DROP COLUMN boss;

ALTER TABLE employees MODIFY boss VARCHAR(25);

