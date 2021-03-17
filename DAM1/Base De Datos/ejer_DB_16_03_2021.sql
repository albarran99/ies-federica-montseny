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
VALUE (1, 'Christan', 'Jimenez', 'Programador', 'calle alcala', current_timestamp(), 60000, 0.05, 'Informatica');

INSERT INTO empleados
VALUE (2, 'Alvaro', 'Gutierrez', 'Comercial', 'calle benezuela', current_timestamp(), 15000, 0.05, 'Ventas');

INSERT INTO empleados
VALUE (3, 'Raúl', 'Albarrán', 'Programador', 'calle de sillas', current_timestamp(), 10000, 0.05, 'Informatica');

INSERT INTO empleados
VALUE (4, 'Alberto', 'Molina', 'Programador', 'Av. las naciones', current_timestamp(), 30000, 0.05, 'Informatica');

INSERT INTO empleados
VALUE (5, 'Victor', 'Cifuentes', 'Comercial', 'Av. de las regiones', current_timestamp(), 11000, 0.05, 'Marketing');

-- 3 Da de alta dos empleados: Julián Romeral y Luis Alonso. Su salario base es de 30000€ y cobrarán una comisión del 15% de su salario.

INSERT INTO empleados
VALUE (6, 'Julián', 'Romeral', 'Director', 'Av. las naciones', '2010-03-19', 11000, 0.15, 'Informatica');

INSERT INTO empleados
VALUE (7, 'Luis', 'Alonso', 'Director', 'Av. las palmas', '2010-03-19', 11000, 0.15, 'Marketing');

-- 4 Actualiza el apelllido de Julián Romeral por Alonso.

UPDATE empleados
SET ape1 = 'Alonso'
WHERE id = 6;

-- 5 Actualiza el apelllido de Luis Alonso por Romeral

UPDATE empleados
SET ape1 = 'Romeral'
WHERE id = 7;

-- 6 Actualiza el oficio de Luis Alonso a programador y el departamento por informática

UPDATE empleados
SET oficio = 'Programador', dept_no = 'Informatica'
WHERE id = 7;

-- 7 Actualiza el oficio de Julián Romeral a prácticas y el departamento por ventas.

UPDATE empleados
SET oficio = 'Practicas', dept_no = 'Ventas'
WHERE id = 6;

-- 8 Actualiza el oficio de otro empleado a comercial y su departamento a marketing.

UPDATE empleados
SET oficio = 'Comercial', dept_no = 'Marketing'
WHERE id = 1;

-- 9 Actualiza el oficio de otro empleado a director y su departamento a ventas.

UPDATE empleados
SET oficio = 'Director', dept_no = 'Ventas'
WHERE id = 2;

-- 10 Modificar la comisión de todos los empleados de la empresa, de forma que todos tengan un incremento del 10% del salario.

UPDATE empleados
SET comision = salario * 0.10;

-- 11 Modifica el salario de 2 empleados para que cobren más de 32000€.

UPDATE empleados
SET salario = '40000'
WHERE id = 2 AND id = 3;

-- 12 Modificar la comisión de los empleados de la empresa que cobren más de 32000€, de forma que todos los que cumplan este requisito tengan un incremento del 12% del salario.

UPDATE empleados
SET comision = salario * 0.12
WHERE salario >= 320000;

-- 13  Incrementar un 5% el salario de los empleados en prácticas del departamento de INFORMATICA.

UPDATE empleados 
SET comision = salario * 0.05
WHERE oficio = 'Practicas' AND dept_no = 'Informatica';

-- 14 Incrementar un 8% el salario de los programadores del departamento de INFORMATICA

UPDATE empleados
SET comision = salario * 0.08
WHERE oficio = 'Programadores' AND dept_no = 'Informatica';

-- 15 Incrementar un 6% el salario de los empleados del departamento de ventas que cobren menos de 20000€.

UPDATE empleados
SET comision = salario * 0.06
WHERE dept_no = 'Ventas' AND salario <= 20000;

-- 16 Incrementar un 8% el salario de los empleados del departamento de informática.

UPDATE empleados
SET comision = salario * 0.08
WHERE dept_no = 'Informatica';

-- 17 Reduce un 3% el salario de los empleados del departamento de marketing.

UPDATE empleados
SET comision = salario - 0.03
WHERE dept_no = 'Marketing';

-- 18 Reduce un 5% el salario de los directores que cobren más de 40000.

UPDATE empleados
SET comision = salario - 0.05
WHERE oficio = 'Directores' AND salario >= 40000;

-- 19 Incrementar en 1000€ el salario de los empleados del departamento de marketing.

UPDATE empleados
SET salario = salario + 10000
WHERE dept_no = 'Marketing';

-- 20 Incrementar en 1500€ el salario de los comerciales.

UPDATE empleados
SET salario = salario + 15000
WHERE oficio = 'Comercial';

-- 21 Incrementar en 5,75% el salario de los empleados que cobren más de 20000€.

UPDATE empleados
SET salario = comision * 0.0575
WHERE salario >= 20000;

-- 22 Incrementar en un 12,5% el salario de los empleados que cobren menos de 20000€.

UPDATE empleados
SET salario = comision * 0.125
WHERE salario <= 20000;

-- 23 Incrementa un 5% el salario de los empleados que no sean del departamento de VENTAS.

UPDATE empleados
SET salario = comision * 0.05
WHERE dept_no != 'Ventas';

-- 24 Incrementa un 2,5% el salario de los empleados que sean del departamento de MARKETING o de INFORMATICA.

UPDATE empleados
SET salario = comision * 0.025
WHERE dept_no = 'Marketing' OR dept_no = 'Informatica';

-- 25 Sube el salario en 1000€ y la comisión al 16% del salario a los empleados que se dieron de alta en este año.

UPDATE empleados
SET salario = comision * 0.16 AND salario = salario + 1000
WHERE fecha_alt = current_date();

-- 26  Sube el salario en un 5% y la comisión sea del 10% del salario a los empleados que se lleven en la empresa más de 10 años.

UPDATE empleados
SET salario = comision * 0.05 AND comision = 0.10
WHERE fecha_alt >= ;