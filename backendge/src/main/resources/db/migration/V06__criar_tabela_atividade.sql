create table GE_ATIVIDADE (
   ID                   integer              not null,
   NM_ATIVIDADE         varchar(150)         not null,
   DT_INICIO            datetime             not null,
   DT_FIM               datetime             not null,
   NM_PALESTRANTE       varchar(100)         not null,
   DS_CURRICULO         text                 null,
   NR_VAGAS             integer              null,
   ST_ATIVO             tinyint              not null,
   ID_EVENTO            integer              not null,
   ID_LOCAL             integer              not null,
   constraint PK_GE_ATIVIDADE primary key (ID)
)
go

alter table GE_ATIVIDADE
   add constraint FK_GE_ATIVI_REFERENCE_GE_EVENT foreign key (ID_EVENTO)
      references GE_EVENTO (ID)
go

alter table GE_ATIVIDADE
   add constraint FK_GE_ATIVI_REFERENCE_GE_LOCAL foreign key (ID_LOCAL)
      references GE_LOCAL (ID)
go