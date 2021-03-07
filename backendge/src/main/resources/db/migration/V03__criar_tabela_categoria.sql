create table GE_CATEGORIA (
   ID                   integer              identity,
   NM_NOME              varchar(50)          not null,
   ST_ATIVO             tinyint              not null,
   constraint PK_GE_CATEGORIA primary key (ID)
)
go
