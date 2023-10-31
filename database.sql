CREATE DATABASE vehiculos;

USE vehiculos;

CREATE TABLE entradas_vehiculos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    placa VARCHAR(6),
    hora_entrada INT,
    hora_salida INT,
    ubicacion VARCHAR(255),
    tipo_vehiculo VARCHAR(20)
);
