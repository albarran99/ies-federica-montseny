/*
	EJER 1
*/

CREATE TABLE `empleado` (
  `DNI_empleado` varchar(9) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `domicilio` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`DNI_empleado`)
  );
  
  CREATE TABLE `existencias` (
  `COD_articulo` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) DEFAULT NULL,
  `cantidad` int DEFAULT NULL,
  `COD_pub` int DEFAULT NULL,
  PRIMARY KEY (`COD_articulo`)
  );
  
  CREATE TABLE `localidad` (
  `COD_localidad` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`COD_localidad`)
  );
  
  CREATE TABLE `pub` (
  `COD_PUB` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) DEFAULT NULL,
  `licencia_fiscal` varchar(20) DEFAULT NULL,
  `domicilio` varchar(20) DEFAULT NULL,
  `COD_localidad` int DEFAULT NULL,
  PRIMARY KEY (`COD_PUB`)
  );
  
  CREATE TABLE `titular` (
  `DNI_titular` varchar(9) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `licencia_fiscal` varchar(20) DEFAULT NULL,
  `domicilio` varchar(20) DEFAULT NULL,
  `COD_pub` int DEFAULT NULL,
  PRIMARY KEY (`DNI_titular`)
  );
  
  CREATE TABLE PUB_empleado (
  cod_pub VARCHAR(20),
  dni_empleado VARCHAR(20),
  funcion VARCHAR(20)
  );
  
  /*
	EJER 2
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