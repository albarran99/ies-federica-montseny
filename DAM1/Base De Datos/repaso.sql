# Crear tabla

CREATE TABLE IF NOT EXISTS verengena (
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(60),
fecha_verengena DATETIME
);

# crear una tabla con clave ajena

CREATE TABLE IF NOT EXISTS patata (
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(60) NOT NULL,
fecha_patata DATETIME NOT NULL,
verengena_id INT,

CONSTRAINT FK_verengena
FOREIGN KEY (verengena_id)
REFERENCES verengena (id)

ON UPDATE CASCADE
ON DELETE CASCADE
);

# añadir una constrain (UNIQUE, CHECK, DEFAULT, INDEX)
ALTER TABLE patata
ADD CONSTRAINT UC_verengena_id UNIQUE (verengena_id);

ALTER TABLE verengena
ADD CONSTRAINT CHK_fecha_verengena CHECK (fecha_verengena > 100);

CREATE INDEX index_id
ON patata (id);

ALTER TABLE patata
ALTER nombre SET DEFAULT "verdura";

# Crear un par de entradas de datos en las tablas

INSERT INTO verengena
VALUE ("1", "patata1", current_timestamp());

INSERT INTO patata 
VALUE ("1", "verengena1", current_timestamp(), "1");

# Dropear cosas

ALTER TABLE patata
DROP CHECK CHK_fecha_verengena;

ALTER TABLE patata
ALTER verengena_id DROP DEFAULT;

DROP INDEX UC_verengena_id ON patata;

DROP INDEX index_id on patata; 

# mostrar la informaciond de las tablas 

SHOW CREATE TABLE patata;

SELECT * FROM patata;

SHOW DATABASES;

SHOW TABLES;