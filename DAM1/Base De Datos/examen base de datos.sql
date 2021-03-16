CREATE DATABASE nba_management;

USE nba_management;

#1.	(1,5 puntos) Crea las sentencias SQL que nos permiten crear las tablas anteriores y 
#sus restricciones, teniendo en cuenta las siguientes restricciones:

CREATE TABLE IF NOT EXISTS temporadas (
nombre_temporada VARCHAR(20) PRIMARY KEY 

);

CREATE TABLE IF NOT EXISTS equipos (
nombre_equipo VARCHAR(20) PRIMARY KEY,
ciudad VARCHAR(20) NOT NULL,
conferencia VARCHAR(4) NOT NULL,
division VARCHAR(9) NOT NULL

);

CREATE TABLE IF NOT EXISTS partidos(
codigo INT AUTO_INCREMENT PRIMARY KEY,
equipo_local VARCHAR(20) NOT NULL,
equipo_visitante VARCHAR(20) NOT NULL,
puntos_local INT NOT NULL,
puntos_visitantes INT NOT NULL,
temporada VARCHAR(5) NOT NULL,

CONSTRAINT FK_equipo_local
FOREIGN KEY (equipo_local)
REFERENCES equipos (nombre_equipo),

CONSTRAINT FK_equipo_visitante
FOREIGN KEY (equipo_visitante)
REFERENCES equipos (nombre_equipo),

CONSTRAINT FK_temporada
FOREIGN KEY (temporada)
REFERENCES temporadas (nombre_temporada)
);

CREATE TABLE IF NOT EXISTS jugadores(
codigo INT AUTO_INCREMENT PRIMARY KEY,
nombre_jugador VARCHAR(30) NOT NULL,
apellido_jugador VARCHAR(20) NOT NULL,
procedencia VARCHAR(4) NOT NULL,
peso INT NOT NULL,
posicion VARCHAR(5) NOT NULL,
nombre_equipo VARCHAR(20) NOT NULL,

CONSTRAINT FK_nombre_equipo
FOREIGN KEY (nombre_equipo)
REFERENCES equipos (nombre_equipo)

);

CREATE TABLE IF NOT EXISTS estadisticas(
codigo INT AUTO_INCREMENT PRIMARY KEY,
temporada VARCHAR(5) NOT NULL,
jugador INT NOT NULL,
puntos_por_partido FLOAT NOT NULL,
asistencias_por_partido FLOAT NOT NULL,
tapones_por_partido FLOAT NOT NULL,
rebotes_por_partido FLOAT NOT NULL,

CONSTRAINT FK_estadisticas_temporada
FOREIGN KEY (temporada)
REFERENCES temporadas (nombre_temporada),

CONSTRAINT FK_estadisticas_jugador
FOREIGN KEY (jugador)
REFERENCES jugadores (codigo)

);

# Crea un índice para cada tabla que incluya sus campos clave y ajenos

CREATE INDEX index_temporada ON temporadas (nombre_temporada);
CREATE INDEX index_equipo ON equipos (nombre_equipo);
CREATE INDEX index_partido ON partidos (temporada, codigo, equipo_local, equipo_visitante);
CREATE INDEX index_jugador ON jugadores (codigo, nombre_equipo);
CREATE INDEX index_estadistica ON estadisticas (codigo, temporada , jugador);

# Crea las siguientes restricciones:

ALTER TABLE jugadores
ADD CONSTRAINT UC_nombre_jugadores
UNIQUE (nombre_jugador);

ALTER TABLE estadisticas
ADD CONSTRAINT CHK_puntos_partido
CHECK (puntos_por_partido = 0);

ALTER TABLE partidos
ADD CONSTRAINT CHK_puntos_visitante
CHECK (puntos_visitantes = 0);

# Elimina las restricciones creadas en el ejercicio anterior.

ALTER TABLE estadisticas
DROP CHECK CHK_puntos_partido;

ALTER TABLE partidos
DROP CHECK CHK_puntos_visitante;

DROP INDEX UC_nombre_jugadores ON jugadores;

# Crea un campo ‘creation_time’ para las tablas partido y estadística de 
#tipo datetime y que por defecto guarden la fecha y hora actuales.

ALTER TABLE partidos
ADD COLUMN creation_time DATETIME;

ALTER TABLE estadisticas
ADD COLUMN creation_time DATETIME;

# Añade 2 registros para cada tabla, en las tablas jugador y equipo tienes que realizarlo 
#mediante un solo insert, en el resto con dos inserts.

INSERT INTO temporadas
VALUES ("temporada_de_oro");

INSERT INTO temporadas
VALUES ("temporada_de_plata");

INSERT INTO equipos
VALUES ("Lakers", "New York", "ande", "jasdf"), ("Lakers", "filadelfia", "san", "afafd");

INSERT INTO partidos
VALUES ("1", "lakers", "boston", "20", "39", "oro", current_timestamp());

INSERT INTO partidos
VALUES ("2", "lakers", "boston", "20", "39", "plata", current_timestamp());

INSERT INTO jugadores
VALUES ("1", "paul", "gasol", "este", "39", "pivot", "lakers"), ("1", "mark", "gasol", "este", "90", "pivot", "lakers");

INSERT INTO estadisticas
VALUES ("1", "oro", "45", "7", "8", "10", "5", current_timestamp());

INSERT INTO estadisticas
VALUES ("1", "plata", "84", "5", "6", "9", "5", current_timestamp());

# Indica los comandos para realizar los siguientes ejercicios:

SHOW DATABASES;

SHOW CREATE TABLE jugadores;

DESCRIBE jugadores;

SELECT * FROM jugadores;
