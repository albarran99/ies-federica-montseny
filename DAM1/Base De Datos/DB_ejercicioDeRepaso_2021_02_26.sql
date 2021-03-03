#Nombre BD: department_management
CREATE DATABASE department_management;

#1.	Crea las sentencias SQL que nos permiten crear las tablas anteriores y 
#sus restricciones, teniendo en cuenta las siguientes restricciones:

CREATE TABLE IF NOT EXISTS employee_departments (
id INT,
employee_id INT,
department_id INT
);

CREATE TABLE IF NOT EXISTS departments (
id INT AUTO_INCREMENT PRIMARY KEY,
name_departmen VARCHAR(60) NOT NULL,
company_code VARCHAR(60) NOT NULL
);

CREATE TABLE IF NOT EXISTS languages (
id INT AUTO_INCREMENT PRIMARY KEY,
name_language VARCHAR(60) NOT NULL
);

CREATE TABLE IF NOT EXISTS employees (
id INT AUTO_INCREMENT PRIMARY KEY,
name_employee VARCHAR(60) NOT NULL,
surname_employee VARCHAR(60) NOT NULL,
second_surname_employee VARCHAR(60) NOT NULL,
language_id INT,

CONSTRAINT FK_language_id
FOREIGN KEY (language_id)
REFERENCES languages (id)

ON UPDATE CASCADE
ON DELETE CASCADE

);

#2.	Crea las claves primarias y ajenas de la tabla ‘employee_department’.

ALTER TABLE employee_departments
ADD CONSTRAINT PK_id
PRIMARY KEY (id);

ALTER TABLE employee_departments
ADD CONSTRAINT FK_employee_id
FOREIGN KEY (employee_id) REFERENCES employees(id);


ALTER TABLE employee_departments
ADD CONSTRAINT FK_department_id
FOREIGN KEY (department_id) REFERENCES departments(id);

# 3. Crea un índice para cada tabla que incluya sus campos clave y ajenos, 
# en caso de que una tabla no tenga claves ajenas,
# el índice estará compuesto solo por la clave primaria.

CREATE INDEX index_ID
ON employees (ID);

CREATE INDEX index_ID
ON languages (ID);

CREATE INDEX index_ID
ON departments (ID);

CREATE INDEX index_employee_id
ON employee_departments (employee_id);


CREATE INDEX index_department_id
ON employee_departments (department_id);


CREATE INDEX index_id
ON employee_departments (id);

# 4. Crea las siguientes restricciones:
#UNIQUE para los campos name
#DEFAULT para el campo company_code = COD10000

ALTER TABLE employees
ADD CONSTRAINT UC_name_employee
UNIQUE (name_employee);

ALTER TABLE employees
ADD CONSTRAINT UC_surname_employee
UNIQUE (surname_employee);

ALTER TABLE employees
ADD CONSTRAINT UC_second_surname_employee
UNIQUE (second_surname_employee);

ALTER TABLE languages
ADD CONSTRAINT UC_name_language
UNIQUE (name_language);

ALTER TABLE departments
ADD CONSTRAINT UC_name_department
UNIQUE (name_departmen);

ALTER TABLE departments
ALTER company_code SET DEFAULT 'COD10000';

# 5. Elimina las restricciones creadas en el ejercicio anterior.

DROP INDEX UC_name_employee ON employees;
DROP INDEX UC_surname_employee ON employees;
DROP INDEX UC_second_surname_employee ON employees;
DROP INDEX UC_name_department ON departments;
DROP INDEX UC_name_language ON languages;
ALTER TABLE departments
ALTER company_code DROP DEFAULT;

# 6.	Crea un campo ‘created_at’
# para las tablas department y employee de tipo datetime y 
#que por defecto guarden la fecha y hora actuales.

ALTER TABLE departments
ADD COLUMN create_at DATETIME;

ALTER TABLE employees
ADD COLUMN create_at DATETIME;