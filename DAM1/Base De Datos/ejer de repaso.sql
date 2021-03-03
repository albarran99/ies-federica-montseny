CREATE DATABASE prueba;

CREATE TABLE IF NOT EXISTS employee_departments(
id int,
employee_id int,
department_id int
);

CREATE TABLE IF NOT EXISTS departments(
id int AUTO_INCREMENT PRIMARY KEY,
name_department VARCHAR(60) NOT NULL,
company_code VARCHAR(60) NOT NULL
);

CREATE TABLE IF NOT EXISTS languages(
id int AUTO_INCREMENT PRIMARY KEY,
name_language VARCHAR(60)
);
CREATE TABLE IF NOT EXISTS employees(
id int AUTO_INCREMENT PRIMARY KEY,
name_employee VARCHAR(60),
suranme_employee VARCHAR(60),
language_id INT,

CONSTRAINT FK_language_id
FOREIGN KEY (language_id)
REFERENCES languages (id)
);

ALTER TABLE employee_departments
ADD CONSTRAINT FK_employee_id
FOREIGN KEY (employee_id)
REFERENCES employees (id);

ALTER TABLE employee_departments
ADD CONSTRAINT FK_departmnet_id
FOREIGN KEY (department_id)
REFERENCES departments (id);

ALTER TABLE employee_departments
ADD CONSTRAINT PK_id
PRIMARY KEY (id);

CREATE INDEX index_employee_id
ON employees (id);

CREATE INDEX index_department_id
ON departments (id);

CREATE INDEX index_language_id
ON languages (id);

CREATE INDEX index_employees_id
ON employee_departments(employee_id);

CREATE INDEX index_departments_id
ON employee_departments(department_id);

ALTER TABLE employees
ADD UNIQUE UC_name_employee (name_employee);

ALTER TABLE departments
ALTER company_code SET DEFAULT 'COD10000';

drop INDEX UC_name_employee ON employees;

ALTER TABLE departments
ALTER COLUMN company_code DROP DEFAULT;

ALTER TABLE employees
ADD COLUMN created_at DATETIME;

INSERT employees (created_at, name_employee)
VALUE (current_timestamp(), 'pepe');

SELECT * FROM employees;
