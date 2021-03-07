create table GE_LOCAL (
   ID                   integer              identity,
   NM_NOME              varchar(100)         not null,
   ST_ATIVO             tinyint              not null,
   constraint PK_GE_LOCAL primary key (ID)
)
go