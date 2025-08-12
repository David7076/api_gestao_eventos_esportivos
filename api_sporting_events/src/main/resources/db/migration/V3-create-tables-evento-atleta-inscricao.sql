create table tbAtleta
(
    id_atleta  bigint       not null auto_increment,
    nome       varchar(30) not null,
    idade      integer,
    modalidade varchar(30),
    ranking    integer
        primary key (id_atleta)
);

create table tbEvento
(
    id_evento  bigint       not null auto_increment,
    nome       varchar(30) not null,
    modalidade varchar(20) not null ,
    data datetime not null,
    local varchar(25) not null
        primary key (id_evento)
);