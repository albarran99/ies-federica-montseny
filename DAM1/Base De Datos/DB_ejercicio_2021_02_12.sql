CREATE SCHEMA game_management;

CREATE DATABASE game_management;

CREATE TABLE IF NOT EXISTS genre (
id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
genre_name VARCHAR(20) NOT NULL
);

CREATE TABLE IF NOT EXISTS publisher (
id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
publisher_name VARCHAR(20) NOT NULL
);

CREATE TABLE IF NOT EXISTS platform (
id INT AUTO_INCREMENT PRIMARY KEY,
platform VARCHAR(20) NOT NULL
);

CREATE TABLE IF NOT EXISTS regions (
id INT PRIMARY KEY,
region_name VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS region_sales (
region_id INT,
game_platform_id INT,
num_sales INT NOT NULL
);

CREATE TABLE IF NOT EXISTS games (
  id INT AUTO_INCREMENT PRIMARY KEY,
  genre_id INT NOT NULL,
  game_name VARCHAR(20),
  
  CONSTRAINT FK_genre_id
  FOREIGN KEY (genre_id)
  REFERENCES genre (id)
  );

CREATE TABLE IF NOT EXISTS game_publisher (
id INT AUTO_INCREMENT PRIMARY KEY,
game_id INT NOT NULL,
publisher_id INT NOT NULL,

CONSTRAINT FK_game_publisher_game
  FOREIGN KEY (game_id)
  REFERENCES games (id),
  
  CONSTRAINT FK_game_publisher_publisher
  FOREIGN KEY (publisher_id)
  REFERENCES publisher (id)
  );

CREATE TABLE IF NOT EXISTS game_plataform (
id INT AUTO_INCREMENT PRIMARY KEY,
game_publisher_id INT NOT NULL,
platform_id INT NOT NULL,
release_year INT NOT NULL,

CONSTRAINT FK_game_platform_id_game_publisher
  FOREIGN KEY (game_publisher_id)
  REFERENCES game_publisher (id),
  
  CONSTRAINT FK_game_platform_platform
  FOREIGN KEY (platform_id)
  REFERENCES platform (id)
  );

#Parte en la que se crea las claves foraneas y primarias de la tabla region_sales y region

ALTER TABLE region_sales
ADD CONSTRAINT FK_region_sales_regions
FOREIGN KEY (region_id) REFERENCES regions(id);

ALTER TABLE region_sales
ADD CONSTRAINT FK_region_sales_game_platform
FOREIGN KEY (game_platform_id) REFERENCES game_plataform(id);

# Parte de crear indices

CREATE INDEX index_game_platform 
ON game_plataform (id, game_publisher_id, platform_id);

CREATE INDEX index_game_publisher
ON game_publisher (id, game_id, publisher_id);

CREATE INDEX index_region_sales
ON region_sales (region_id, game_platform_id);

CREATE INDEX index_regions
ON regions (id);

CREATE INDEX index_genre
ON genre (id);

CREATE INDEX index_game 
ON games (id, genre_id);

CREATE INDEX index_publisher
ON publisher (id);

CREATE INDEX index_platform 
ON platform (id);

# Creacion de las restringiones (fuera de las tablas)

ALTER TABLE regions
ADD CONSTRAINT UC_region_name
UNIQUE (region_name);

ALTER TABLE publisher
ADD CONSTRAINT UC_publisher_name
UNIQUE (publisher_name);

ALTER TABLE region_sales
ALTER num_sales SET DEFAULT  0;

ALTER TABLE game_plataform
ALTER release_year SET DEFAULT 1989;

ALTER TABLE region_sales
ADD CONSTRAINT CHK_region_sales
CHECK (num_sales >= 0);

ALTER TABLE game_plataform
ADD CONSTRAINT CHK_release_year
CHECK (release_year >= 1989);

# Dorpeo de las restrinciones creadas anteriormente

ALTER TABLE region_sales
ALTER num_sales DROP DEFAULT;

ALTER TABLE game_plataform
ALTER release_year DROP DEFAULT;

DROP INDEX UC_region_name ON regions;

DROP INDEX UC_publisher_name ON publisher;

ALTER TABLE region_sales
DROP CHECK CHK_region_sales;

ALTER TABLE game_plataform
DROP CHECK CHK_release_year;