CREATE DATABASE test20210316;



use test20210316;



CREATE TABLE clientes (
id INT AUTO_INCREMENT PRIMARY KEY,
dni VARCHAR(9) NOT NULL,
nombre VARCHAR(30) NOT NULL,
ape1 VARCHAR(30) NOT NULL,
ape2 VARCHAR(30),
localidad VARCHAR(30) NOT NULL,
direccion VARCHAR(30) NOT NULL,
comision FLOAT NOT NULL,
created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
);



INSERT INTO clientes (dni, nombre, ape1, ape2, localidad, direccion, comision)
VALUES ('11111111H', 'Pedro', 'Gutierrrez', NULL, '', '', 0),
('11111122H', 'Juan', 'Gutierrrez', NULL, '', '', 0),
('11111133H', 'Jose', 'Gutierrrez', NULL, '', '', 0);


INSERT INTO clientes (dni, nombre, ape1, ape2, localidad, direccion)
VALUES ('11111111H', 'Pedro', 'Gutierrrez', NULL, '', ''),
('11111122H', 'Juan', 'Gutierrrez', NULL, '', ''),
('11111133H', 'Jose', 'Gutierrrez', NULL, '', '');

SELECT * FROM Clientes
WHERE id = 2;

DESCRIBE Clientes;

UPDATE clientes
SET ape1 = 'López', comision = 2
WHERE id = 2;

UPDATE clientes
SET created_at = '2021-03-15'
WHERE id = 2;

SELECT * FROM Clientes;
