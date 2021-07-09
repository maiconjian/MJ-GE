create table GE_USUARIO (
   ID                   integer              identity,
   NM_NOME              varchar(100)         not null,
   NM_EMAIL             varchar(100)         not null,
   NR_SENHA             varchar(150)         not null,
   ST_ATIVO             tinyint              not null,
   ID_PERFIL            integer              not null,
   ST_PCD               tinyint              not null,
   DS_PCD               varchar(500)         null,
   constraint PK_GE_USUARIO primary key (ID)
)
go

alter table GE_USUARIO
   add constraint FK_GE_USUAR_REFERENCE_GE_PERFI foreign key (ID_PERFIL)
      references GE_PERFIL (ID)
go