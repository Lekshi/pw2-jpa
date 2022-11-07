create database PW2_JPA

use PW2_JPA

CREATE TABLE TBL_VEICULO(
ID_VEICULO BIGINT PRIMARY KEY IDENTITY,
TX_FABRICANTE VARCHAR(30) NOT NULL,
TX_MODELO VARCHAR(20) NOT NULL,
NR_ANO_FABRICACAO INT NOT NULL,
NR_ANO_MODELO INT NOT NULL,
VLR_PRECO FLOAT NOT NULL
);

CREATE TABLE TBL_AGENTE_AUTUADOR( 
ID_AGENTE_AUTUADOR BIGINT PRIMARY KEY IDENTITY,
TX_NOME VARCHAR(50) NOT NULL, 
TP_AGENTE VARCHAR(8) NOT NULL, 
ST_AGENTE INT NOT NULL, 
TX_FONE VARCHAR(10) NOT NULL

);

