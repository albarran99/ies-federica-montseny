CREATE TABLE IF NOT EXISTS clientes (
id INT AUTO_INCREMENT PRIMARY KEY,
dni VARCHAR(9) NOT NULL,
nombre VARCHAR(30) NOT NULL,
apell1 VARCHAR(30) NOT NULL,
apell2 VARCHAR(30),
localidad VARCHAR(30) NOT NULL,
direccion VARCHAR(30) NOT NULL
);

drop table IF EXISTS tasks;

CREATE TABLE IF NOT EXISTS tasks (
id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
title varchar(255) NOT NULL,
start_date DATETIME DEFAULT NULL,
end_date DATETIME DEFAULT NULL,
price int DEFAULT NULL,
id_employee int DEFAULT NULL
) ;

INSERT INTO tasks (id, title, price, id_employee, start_date, end_date)
VALUE (NULL, 'formatear', 25, 1, CURRENT_DATE(), '2021-02-17');

SELECT * FROM tasks;

INSERT INTO clientes (dni, nombre, apell1, localidad, direccion)
VALUES ('111111K', 'pedro', 'gutierrez', '', ''),
('2222222K', 'Juan', 'gutierrez', '', ''),
('3333333K', 'jose', 'gutierrez', '', '');


SELECT * FROM clientes;