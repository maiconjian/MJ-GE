create table GE_EVENTO (
   ID                   integer              not null,
   NM_TITULO            varchar(150)         not null,
   DS_DESCRICAO         text                 not null,
   PTH_BANNER           varchar(200)         null,
   DS_TIPO              varchar(50)          null,
   ST_ATIVO             tinyint              not null,
   DT_INSC_INICIO       datetime             not null,
   DT_INSC_FIM          datetime             not null,
   DT_INICIO            datetime             not null,
   DT_FIM               datetime             not null,
   ID_CATEGORIA         integer              not null,
   ID_RESPONSAVEL       integer              not null,
   ST_ATV_UNICA         tinyint              null,
   ID_LOCAL             integer              not null,
   constraint PK_GE_EVENTO primary key (ID)
)
go

alter table GE_EVENTO
   add constraint FK_GE_EVENT_REFERENCE_GE_CATEG foreign key (ID_CATEGORIA)
      references GE_CATEGORIA (ID)
go

alter table GE_EVENTO
   add constraint FK_GE_EVENT_REFERENCE_GE_USUAR foreign key (ID_RESPONSAVEL)
      references GE_USUARIO (ID)
go

alter table GE_EVENTO
   add constraint FK_GE_EVENT_REFERENCE_GE_LOCAL foreign key (ID_LOCAL)
      references GE_LOCAL (ID)
go
