create table player
(
    id  bigint not null
            primary key,
    nom varchar(255),
    prenom varchar(255)
);

alter table player
    owner to postgres;
