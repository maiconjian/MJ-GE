CREATE TABLE USUARIO_PERMISSAO(
	ID INTEGER IDENTITY NOT NULL PRIMARY KEY,
	ID_USUARIO INTEGER NOT NULL,
	ID_PERMISSAO INTEGER NOT NULL,
);

ALTER TABLE USUARIO_PERMISSAO 
ADD CONSTRAINT FK1USUARIO_PERMISSAO FOREIGN KEY (ID_USUARIO) REFERENCES GE_USUARIO(ID);
go

ALTER TABLE USUARIO_PERMISSAO 
ADD CONSTRAINT FK2USUARIO_PERMISSAO FOREIGN KEY (ID_PERMISSAO) REFERENCES GE_PERMISSAO(ID);
go