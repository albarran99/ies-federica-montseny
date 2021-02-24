/*
	EJER 1
	(Esta bien)
*/

CREATE SCHEMA managment_pubs;

CREATE TABLE `empleado` (
  `DNI_empleado` varchar(9) PRIMARY KEY,
  `nombre` varchar(20) NOT NULL,
  `domicilio` varchar(20) DEFAULT NULL
  );
  
  CREATE TABLE `existencias` (
  `COD_articulo` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) NOT NULL,
  `cantidad` int NOT NULL,
  `COD_pub` int NOT NULL,
  PRIMARY KEY (`COD_articulo`)
  );
  
  CREATE TABLE `localidad` (
  `COD_localidad` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) NOT NULL,
  PRIMARY KEY (`COD_localidad`)
  );
  
  CREATE TABLE `pub` (
  `COD_PUB` int AUTO_INCREMENT AUTO_INCREMENT,
  `nombre` varchar(20) NOT NULL,
  `licencia_fiscal` varchar(20) NOT NULL,
  `domicilio` varchar(20) DEFAULT NULL,
  `COD_localidad` int NOT NULL,
  PRIMARY KEY (`COD_PUB`)
  );
  
  CREATE TABLE `titular` (
  `DNI_titular` varchar(9) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `licencia_fiscal` varchar(20) DEFAULT NULL,
  `domicilio` varchar(20) NOT NULL,
  `COD_pub` int NOT NULL,
  PRIMARY KEY (`DNI_titular`)
  );
  
  /*
	EJER 2
    (Esta bien)
  */
  
  ALTER TABLE pub
  RENAME TO pubs;
  
  ALTER TABLE empleado
  RENAME TO employees;
  
  ALTER TABLE existencias
  RENAME TO stocks;
  
    ALTER TABLE localidad
  RENAME TO cities;
  
    ALTER TABLE titular
  RENAME TO owners;
  
    ALTER TABLE pub_empleado
  RENAME TO pub_employees;
  
  /*
	EJER 3
  */
  
ALTER TABLE pubs ADD opening_date DATE;
  
ALTER TABLE stocks ADD cost INT(50);

ALTER TABLE cities ADD Province VARCHAR(20);
  
ALTER TABLE employees ADD age INT(99);

/*
	EJER 4
*/

ALTER TABLE pub_employees
ADD CONSTRAINT PK_employees PRIMARY KEY (cod_pub, dni_empleado, funcion);

/*
	EJER 5
*/

ALTER TABLE pubs
MODIFY opening_date DATE NOT NULL;

ALTER TABLE pubs MODIFY schedule_ VARCHAR(20) NOT NULL;

ALTER TABLE cities
MODIFY province VARCHAR(20) NOT NULL;

ALTER TABLE stock
ADD CONSTRAINT CHK_price CHECK (price > 0);

ALTER TABLE stocks
ALTER price SET DEFAULT 1;

CREATE INDEX IDX_owners
ON owners (dni_holder, hlder_name);

ALTER TABLE stocks
ALTER quantity SET DEFAULT 1;

CREATE INDEX IDX_cities
ON cities (cod_locality, locality_name);

#Ejercicio 6

ALTER TABLE owners
DROP INDEX IDX_owners; 

ALTER TABLE stocks
ALTER cantidad DROP DEFAULT;

ALTER TABLE cities
DROP INDEX IDX_localidad;

ALTER TABLE stocks
DROP CHECK CHK_stocks;

ALTER TABLE stocks
ALTER price DROP DEFAULT;

#EJER 7

ALTER TABLE owners
ADD CONSTRAINT FK_owners_pubs
FOREIGN KEY (COD_pub) REFERENCES pubs(COD_pub);

ALTER TABLE pub_employees
ADD CONSTRAINT FK_pub_employees_pubs
FOREIGN KEY (cod_pub) REFERENCES pubs(cod_pub);

ALTER TABLE pub_employees
ADD CONSTRAINT FK_pub_employees_employees
FOREIGN KEY (dni_empleado) REFERENCES employees(dni_empleado);

ALTER TABLE stocks
ADD CONSTRAINT FK_stocks_pubs
FOREIGN KEY (COD_PUB) REFERENCES pubs(cod_pub);

ALTER TABLE pubs
ADD CONSTRAINT FK_pubs_cities
FOREIGN KEY (COD_localidad) REFERENCES cities(COD_localidad);

-- #EJER8

-- ALTER TABLE owners
-- DROP FOREIGN KEY FK_owners_pubs;

-- ALTER TABLE pub_employees
-- DROP FOREIGN KEY FK_pub_employees_pubs;

-- ALTER TABLE pub_employees
-- DROP FOREIGN KEY FK_pub_employees_employees;

-- ALTER TABLE stocks
-- DROP FOREIGN KEY FK_stocks_pubs;

-- ALTER TABLE pubs
-- DROP FOREIGN KEY FK_pubs_cities;

#EJER9

 CREATE TABLE PUB_empleado (
  cod_pub VARCHAR(20) NOT NULL,
  dni_empleado VARCHAR(20) NOT NULL,
  funcion VARCHAR(20) NOT NULL,
  CONSTRAINT  FK_pub_employees_pubs
  FOREIGN KEY (cod_pub)
  REFERENCES pubs (cod_pub),
  FOREIGN KEY (dni_employee) 
  REFERENCES employees (dni_employee)
  );
  
 CREATE TABLE `titular` (
  `DNI_titular` varchar(9) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `licencia_fiscal` varchar(20) DEFAULT NULL,
  `domicilio` varchar(20) NOT NULL,
  `COD_pub` int NOT NULL,
  PRIMARY KEY (`DNI_titular`),
  CONSTRAINT FK_owners_pubs 
  FOREIGN KEY (COD_pub)
  REFERENCES pubs (cod_pub)
  );
  
    CREATE TABLE `pub` (
  `COD_PUB` int AUTO_INCREMENT AUTO_INCREMENT,
  `nombre` varchar(20) NOT NULL,
  `licencia_fiscal` varchar(20) NOT NULL,
  `domicilio` varchar(20) DEFAULT NULL,
  `COD_localidad` int NOT NULL,
  PRIMARY KEY (`COD_PUB`),
  CONSTRAINT FK_pubs_cities
  FOREIGN KEY (COD_localidad)
  REFERENCES pubs (COD_localidad)
  );
  
  # EJER 