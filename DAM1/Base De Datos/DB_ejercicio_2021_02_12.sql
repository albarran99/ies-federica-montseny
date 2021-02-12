CREATE SCHEMA game_management;

CREATE DATABASE game_management;

CREATE TABLE IF NOT EXISTS game_plataform (
id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
game_publisher_id INT AUTO_INCREMENT NOT NULL,
platform_id INT AUTO_INCREMENT NOT NULL,
release_year INT NOT NULL,

CONSTRAINT FK_game_platform_id_game_publisher
  FOREIGN KEY (game_publisher_id)
  REFERENCES game_publisher (id),
  
  CONSTRAINT FK_game_platform_platform
  FOREIGN KEY (platform_id)
  REFERENCES platform (id)
  );
  
  
CREATE TABLE IF NOT EXISTS game_publisher (
id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
game_id INT AUTO_INCREMENT NOT NULL,
publisher_id INT AUTO_INCREMENT NOT NULL,

CONSTRAINT FK_game_publisher_game
  FOREIGN KEY (game_id)
  REFERENCES game (id),
  
  CONSTRAINT FK_game_publisher_publisher
  FOREIGN KEY (publisher_id)
  REFERENCES publisher (id)
  );
  
  CREATE TABLE IF NOT EXISTS game (
  id INT AUTO_INCREMENT PRIMARY KEY,
  genre_id INT AUTO_INCREMENT NOT NULL,
  game_name VARCHAR(20),
  
  CONSTRAINT FK_genre_id
  FOREIGN KEY (genre_id)
  REFERENCES genre (id)
  );
  
CREATE TABLE IF NOT EXISTS genre (
id INT AUTO_INCREMENT NOT NULL,
genre_name VARCHAR(20) NOT NULL
);

CREATE TABLE IF NOT EXISTS publisher (
id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
publisher_name VARCHAR(20) NOT NULL
);