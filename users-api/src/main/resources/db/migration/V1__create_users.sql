CREATE TABLE users (
    id SERIAL,
    firstName VARCHAR(15) NOT NULL,
    lastName VARCHAR(15) NOT NULL,
    email VARCHAR(20) NOT NULL,
    password VARCHAR (20) NOT NULL
);