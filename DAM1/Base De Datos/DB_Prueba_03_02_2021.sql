CREATE DATABASE IF NOT EXISTS Prueba;

USE Prueba;

SHOW DATABASes;

SHOW TABLES;

CREATE TABLE IF NOT EXISTS pet (
name varchar(20),
owner VARCHAR(20),
species VARCHAR(20),
birth DATE,
death DATE
);

DESCRIBE pet;

CREATE TABLE IF NOT EXISTS employees ( 
	id INT, 
    name_employee VARCHAR(30), 
    year_employee int
);

ALTER TABLE empleados RENAME TO employees;

DROP TABLE task;

USE prueba;

CREATE TABLE IF NOT exists task (
	id INT NOT NULL,
    title VARCHAR(255) NOT NULL,
    start_date DATE UNIQUE,
    end_date DATE,
    UNIQUE (end_date, title),
    price INT CHECK (price > 0)
);

DESCRIBE TASK;

SHOW CREATE TABLE task;

SHOW INDEXES FROM task;

ALTER TABLE task
ADD CONSTRAINT tas_til_uk
UNIQUE (title);

