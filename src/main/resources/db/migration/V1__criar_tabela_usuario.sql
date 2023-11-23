CREATE TABLE usuarios
(
    id            BINARY(16) DEFAULT (UUID_TO_BIN(UUID(), 1)) NOT NULL,
    primeiro_nome varchar(35) DEFAULT NULL,
    sobrenome     varchar(35) DEFAULT NULL,
    idade         bigint(20) NOT NULL,
    email         varchar(35) DEFAULT NULL,
    senha         varchar(35) DEFAULT NULL,
    tipo_usuario  varchar(35) DEFAULT NULL,
    data_registro datetime NOT NULL,
    PRIMARY KEY (id)
);