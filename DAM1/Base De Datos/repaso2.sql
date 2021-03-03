CREATE DATABASE prueba2;

USE prueba2;

#Crear una tabla


CREATE TABLE IF NOT EXISTS pera(
id INT AUTO_INCREMENT PRIMARY KEY,
nombre_pera VARCHAR(60) NOT NULL,
pera_stocks INT,
manzana_id INT

);

CREATE TABLE IF NOT EXISTS manzana(
id int PRIMARY KEY AUTO_INCREMENT,
nombre_manzana VARCHAR(60) NOT NULL,
mazana_stocks INT,
pera_id INT,

CONSTRAINT FK_pera
FOREIGN KEY (pera_id)
REFERENCES pera (id)

ON UPDATE CASCADE
ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS pomelo(
id INT AUTO_INCREMENT PRIMARY KEY,
nombre_pomelo VARCHAR(60) NOT NULL,
pomelo_stocks INT DEFAULT "0",
manzana_id INT

-- CONSTRAINT FK_manzana
-- FOREIGN KEY (manzana_id)
-- REFERENCES manzana (id)

-- ON UPDATE CASCADE
-- ON DELETE CASCADE
);

# crear claves ajenas y primarias fuera de las tablas
# tambien son las que se escriben con add constraint

ALTER TABLE manzana 
ADD CONSTRAINT PK_manzana
PRIMARY KEY manzana (id);

ALTER TABLE pera
add CONSTRAINT FK_manzana_id 
FOREIGN KEY (manzana_id)
REFERENCES pera (id);

ALTER TABLE manzana
ADD CONSTRAINT CHK_manzana_stocks
CHECK (mazana_stocks >= 0);

ALTER TABLE manzana 
ADD CONSTRAINT UC_manzana
UNIQUE (id);

# crear un indice (index)

CREATE INDEX index_mnazana ON manzana (id);

# Crear un campo por defecto 

ALTER TABLE manzana 
ALTER nombre_manzana SET DEFAULT "nada";

# crear datos en los campos de las tablas

INSERT INTO pera
VALUES ("2", "casio", "5", "2", current_timestamp());

INSERT INTO manzana
VALUES ("2", "casio", "5", "2", current_timestamp());

SHOW CREATE TABLE manzana;

SELECT * FROM manzana;

# modificar cosas en una tabla el campo de una tabla

ALTER TABLE manzana
MODIFY nombre_manzana VARCHAR(100);

ALTER TABLE manzana
RENAME TO manzana_stocks;

ALTER TABLE manzana
ADD COLUMN fecha_caducidad DATETIME;

ALTER TABLE pera
ADD COLUMN fecha_caducidad DATETIME;

