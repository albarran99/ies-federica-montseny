CREATE DATABASE ejerDML;

USE ejerDML;

CREATE TABLE empleados

(

id INT PRIMARY KEY AUTO_INCREMENT,

nombre VARCHAR(50) NOT NULL,

ape1 VARCHAR(50) NOT NULL,

oficio VARCHAR(50) NULL,

dir VARCHAR(100) NOT NULL,

fecha_alt DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,

salario FLOAT NOT NULL,

comision FLOAT NOT NULL,

dept_no VARCHAR(50) NOT NULL

);
-- 2 Inserta 5 registros distintos en la tabla anterior.

INSERT INTO empleados
VALUE (1, 'Julián', 'Romera', 'Programador', 'calle alcala', current_timestamp(), 60000, 0.05, 'Informatica');

INSERT INTO empleados
VALUE (2, 'Luis', 'Alonso', 'Comercial', 'calle benezuela', current_timestamp(), 15000, 0.05, 'Ventas');

INSERT INTO empleados
VALUE (3, 'Raúl', 'Albarrán', 'Programador', 'calle de sillas', current_timestamp(), 10000, 0.05, 'Informatica');

INSERT INTO empleados
VALUE (4, 'Alberto', 'Molina', 'Programador', '', current_timestamp(), 60000, 0.05, 'Informatica');

INSERT INTO empleados
VALUE (5, 'Julián', 'Romera', 'Programador', 'calle alcala', current_timestamp(), 60000, 0.05, 'Informatica');