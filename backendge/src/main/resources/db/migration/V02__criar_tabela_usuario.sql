create table GE_USUARIO (
   ID                   integer              identity,
   NM_NOME              varchar(100)         not null,
   LG_EMAIL             varchar(60)          not null,
   PW_SENHA             varchar(10)          not null,
   ST_ATIVO             tinyint              not null,
   ID_PERFIL            integer              not null,
   ST_PCD               tinyint              not null,
   DS_PCD               varchar(100)         null,
   constraint PK_GE_USUARIO primary key (ID)
)
go

alter table GE_USUARIO
   add constraint FK_GE_USUAR_REFERENCE_GE_PERFI foreign key (ID_PERFIL)
      references GE_PERFIL (ID)
go