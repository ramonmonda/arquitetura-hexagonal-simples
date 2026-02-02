create table lista_compra (
    id bigint auto_increment primary key,
    nome varchar(100) not null,
    quantidade integer not null,
    comprado boolean not null
);
