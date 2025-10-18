DROP TABLE tb_atleta;

create table tb_athlete
(
    id_athlete  bigint       not null auto_increment,
    name       varchar(30) not null,
    age      integer,
    modality varchar(30),
    ranking    integer,
    primary key (id_athlete)
);