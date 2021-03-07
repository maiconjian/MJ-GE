create table GE_PERFIL (
   ID                   integer              identity,
   NM_NOME              varchar(50)          not null,
   ST_ATIVO             tinyint              not null,
   constraint PK_GE_PERFIL primary key (ID)
)
go