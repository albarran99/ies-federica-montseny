use nba;

show tables;

DESCRIBE EQUIPOS;

DESCRIBE estadisticas;

DESCRIBE jugadores;

DESCRIBE partidos;

-- TABLA equipos

-- 1. Muestra las ciudades de la Division 'SouthWest'
	SELECT Ciudad 
    FROM equipos
    WHERE Division = 'SouthWest';

-- 2. Muestra el nombre y ciudad de los equipos de la conferencia 'East'
	SELECT Nombre, Ciudad
    FROM equipos
    WHERE Conferencia = 'East';

-- 3. Muestra el nombre y ciudad de los equipos de la conferencia 'West' y de la division 'Pacific'
	SELECT Nombre, Ciudad
    FROM equipos
    WHERE Conferencia = 'West' AND Division = 'Pacific';
-- 4. Muestra el nombre, ciudad y conferencia de los equipos de la division 'SouthEast'
	SELECT Nombre, Ciudad, Conferencia 
    FROM equipos
    WHERE Division = 'SouthEast';


-- TABLA estadisticas

-- 1. Muestra las estadisticas de la temporada '00/01'
	SELECT * FROM estadisticas
    WHERE temporada = 00/01;

-- 2. Muestra los puntos por partido del jugador 2 de las temporadas 04/05 y 05/06
	SELECT Puntos_por_partido 
    FROM estadisticas
    WHERE jugador = 2 AND (temporada = '04/05' OR temporada = '05/06');

-- 3. Muestra las asistencias y tapones por partido del jugador 4 de las temporadas que haya anotado más de 5 puntos por partido
	SELECT Asistencias_por_partido, Tapones_por_partido, temporada 
    FROM estadisticas
    WHERE jugador = 4 AND (Puntos_por_partido > 5);

-- 4. Muestra los puntos, asistencias y rebotes por partido de los jugadores con más de 1.2 asistencias
	SELECT Puntos_por_partido, Asistencias_por_partido, Rebotes_por_partido 
    FROM estadisticas
    WHERE Asistencias_por_partido > 1.2;


-- TABLA jugadores

-- 1. Muestra toda la información de los jugadores de los Lakers.
	SELECT * FROM jugadores
    WHERE Nombre_equipo = 'Lakers';
-- 2. Muestra el codigo, nombre y posicion de los jugadores de los Clippers y de los Grizzlies.
	SELECT codigo, Nombre, Posicion, Nombre_equipo FROM jugadores
    WHERE Nombre_equipo = 'Clippers' OR Nombre_equipo = 'Grizzlies';
-- 3. Muestra el nombre, posicion y equipo de los jugadores de procedencia 'Spain'
	SELECT Nombre, Posicion, Nombre_equipo 
    FROM jugadores
    WHERE Procedencia = 'Spain';
-- 4. Muestra el nombre, procedencia y nombre del equipo de los jugadores cuyo peso sea mayor o igual a 250
	SELECT Nombre, Procedencia, Nombre_equipo 
    FROM jugadores
    WHERE Peso >= 250;
-- 5. Muestra el nombre y equipo de los jugadores de la posición 'F-C'
	SELECT Nombre, Nombre_equipo 
    FROM jugadores
    WHERE Posicion = 'F-C';


-- TABLA partidos


-- 1. Muestra todos los partidos que los Raptors han jugado como equipo visitante en la temporada 07/08
	SELECT *
    FROM partidos
    WHERE equipo_visitante = 'Raptors' AND temporada = '07/08';
-- 2. Muestra los equipos visitantes contra los que Mavericks jugaron (como locales) la temporada 05/06 y 06/07
	SELECT equipo_visitante, equipo_local
    FROM partidos
    WHERE equipo_local = 'Mavericks' AND (temporada = '05/06' OR temporada = '06/07');
-- 3. Muestra los equipos locales y sus puntos, de los que hayan anotado más de 100 puntos en la temporada 04/05
	SELECT equipo_local, puntos_local
    FROM partidos
    WHERE puntos_local > 100 AND temporada = '04/05';
-- 4. Muestra los puntos que ha obtenido el equipo de los Supersonics como visitante en la temporada 03/04
	SELECT puntos_visitante, equipo_visitante
    FROM partidos
    WHERE equipo_visitante = 'Supersonics' AND temporada = '03/04';
-- 5. Muestra los equipos visitantes que hayan anotado menos de 60 puntos de las temporadas 98/99 y 00/01
	SELECT equipo_visitante, puntos_visitante
    FROM partidos
    WHERE puntos_visitante < 60 AND (temporada = '98/99' OR temporada = '00/01');
