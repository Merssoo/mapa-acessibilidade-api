--liquibase formatted sql
--changeset emerson:001
CREATE SEQUENCE IF NOT EXISTS seq_locais
    INCREMENT 1
    START 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE "locais" (
    id BIGINT NOT NULL DEFAULT nextval('seq_locais'),
    bairro VARCHAR(100) NOT NULL,
    rua VARCHAR(100) NOT NULL,
    tipo_local VARCHAR(100) NOT NULL,
    acessivel BOOLEAN NOT NULL,
    descricao TEXT,
    CONSTRAINT pk_locais PRIMARY KEY (id)
);

ALTER SEQUENCE seq_locais OWNED BY "locais".id;