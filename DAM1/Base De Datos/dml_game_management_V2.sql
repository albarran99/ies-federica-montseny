USE game_management;

-- 1. Crea los siguientes registros en la tabla genres
-- a. Mediante un solo comando: Action, Adventure, Fighting, Misc, Platform, Puzzle, 
-- b. Cada opción un comando en un insert: Racing, Role-Playing, Shooter, Simulation, Sports, Strategy

INSERT INTO genre 
VALUE 
(NULL, 'Action'), 
(NULL, 'Adventure'), 
(NULL, 'Fighting'), 
(NULL, 'Misc'), 
(NULL, 'platform'), 
(NULL,'Puzzle');

INSERT INTO genre 
VALUE (NULL, 'Racing');
INSERT INTO genre 
VALUE (NULL, 'Role_Playing');
INSERT INTO genre 
VALUE (NULL, 'Shooter');
INSERT INTO genre
 VALUE (NULL, 'Simulation');
INSERT INTO genre 
VALUE (NULL, 'Sports');
INSERT INTO genre 
VALUE (NULL, 'Strategy');

SELECT * FROM genre;


-- 2. Crea los siguientes registros en la tabla platforms
-- (1,'Wii U'),(2,'PS5'),(3,'XBOX ONE'),(4,'PS3')
-- (5,'3DS'),(6,'PS4'),(7,'PC')
INSERT INTO platform 
VALUE 
(NULL, 'Wii U'),
 (NULL, 'PS5'), 
 (NULL, 'XBOX ONE'), 
 (NULL, 'PS3'),
 (NULL, '3DS'),
 (NULL,'PS4'),
 (NULL,'PC');

SELECT * FROM platform;
-- 3. Crea los siguientes registros en la tabla publisers mediante un solo comando insert
-- (1,'10TACLE Studios'),(2,'1C Company'),(3,'20th Century Fox Video Games')
-- (4,'Activision'),(5,'Activision Blizzard'),(6,'Activision Value')

INSERT INTO publisher
 VALUE 
 (NULL, '10TACLE Studios'), 
 (NULL, '1C Company'),
 (NULL, '20th Century Fox Video Games'),
 (NULL, 'Activision'),
 (NULL, 'Activision Blizzard'),
 (NULL,'Activision Value');

SELECT * FROM publisher;

SHOW CREATE TABLE regions;

-- 4. Crea los siguientes registros en la tabla regions mediante un solo comando insert
-- (1,'North America'),(2,'Europe'),(3,'Japan'),(4,'Other')
ALTER TABLE regions
MODIFY id INT AUTO_INCREMENT;

INSERT INTO regions 
VALUE (DEFAULT, 'North America'), 
(DEFAULT, 'Europe'), 
(DEFAULT, 'Japan'), 
(DEFAULT, 'Other');

SELECT * FROM regions;


-- 5. Crea los campos 'created_at' y 'updated_at' para las siguientes tablas:
-- a. game, game_publisher y game_platform
-- b. NOTA: los campos deben guardar por defecto la fecha actual

ALTER TABLE games 
ADD COLUMN created_at DATETIME;

ALTER TABLE games 
ADD COLUMN update_at DATETIME;

ALTER TABLE game_publisher
ADD COLUMN created_at DATETIME;

ALTER TABLE game_publisher 
ADD COLUMN update_at DATETIME;

ALTER TABLE game_plataform
ADD COLUMN created_at DATETIME;

ALTER TABLE game_plataform 
ADD COLUMN update_at DATETIME;

INSERT INTO game_plataform 
VALUE ('1', '1', '1', '2021', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO game_publisher 
VALUE ('2', '2', '14', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);


SELECT * FROM game_plataform;

SELECT * FROM publisher;

INSERT INTO game_plataform
 VALUE ('2', '2', '2', '2021', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

SELECT * FROM game_plataform;

INSERT INTO game_publisher 
VALUE ('1', '1', '1', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO games
VALUE ('1', '1', 'Halo', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO region_sales
VALUE ('1', '1', '12');

SELECT * FROM games;
SELECT * FROM region_sales;

