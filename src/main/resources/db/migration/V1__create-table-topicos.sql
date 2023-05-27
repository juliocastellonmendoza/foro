CREATE TABLE topicos(
    id bigint not null auto_increment,
    titulo varchar(100) not null unique,
    mensaje varchar(255) not null unique,
    fecha_creacion varchar(100) not null,
    estatus varchar(11) not null,
    autor varchar(100) not null,
    curso varchar(100) not null,

    primary key(id)
);