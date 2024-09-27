-- Drops
drop table Tipo_poke cascade constraints;
drop table Pokemon cascade constraints;

-- Criação das tabelas
create table Tipo_poke(
    id_tipo number(2) constraint tipo_id_pk Primary Key,
    nome_tipo VARCHAR2(10) constraint tipo_nm_nn not Null
);


create table Pokemon (
    num_pokedex NUMBER(4) constraint poke_num_pk Primary Key,    
    nome_poke VARCHAR2 (20) constraint poke_nm_nn Not Null,
    evolucao VARCHAR2(20),
    fk_tipo NUMBER(2) constraint venda_tipo_fk references Tipo_poke
);

