--liquibase formatted sql

--changeset shotundefm:1 dbms:mysql

CREATE TABLE IF NOT EXISTS customer_info (
id INT AUTO_INCREMENT,
firstName VARCHAR (30) NOT NULL,
lastName VARCHAR (30),
email VARCHAR (50) UNIQUE,
phone BIGINT NOT NULL UNIQUE,
PRIMARY KEY info_pk (id)
);
CREATE INDEX info_idx01 ON customer_info (phone);