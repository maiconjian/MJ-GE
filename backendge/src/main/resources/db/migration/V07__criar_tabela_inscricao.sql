
create table GE_INSCRICAO (
   ID                   integer              not null,
   ID_ALUNO             integer              not null,
   ID_ATIVIDADE         integer              not null,
   CD_AUTENTICACAO      varchar(50)          not null,
   DT_INSCRICAO         datetime             null,
   ST_PRESENCA          tinyint              null,
   ST_ATIVO             tinyint              null,
   constraint PK_GE_INSCRICAO primary key (ID)
)
go

alter table GE_INSCRICAO
   add constraint FK_GE_INSCR_REFERENCE_GE_ATIVI foreign key (ID_ATIVIDADE)
      references GE_ATIVIDADE (ID)
go

alter table GE_INSCRICAO
   add constraint FK_GE_INSCR_REFERENCE_GE_USUAR foreign key (ID_ALUNO)
      references GE_USUARIO (ID)
go
