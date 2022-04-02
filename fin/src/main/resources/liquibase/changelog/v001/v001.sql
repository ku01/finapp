create sequence project_sequence start 1 increment 1;
create table project(
    id bigint primary key,
    name varchar(100) not null
);

create sequence account_sequence start 1 increment 1;
create table account(
  id bigint primary key,
  project_id bigint references project (id) not null,
  name varchar(100) not null,
  value numeric(12,2) not null,
  currency varchar(3) not null,
  unique (project_id, name)
);
create index account_project_id_idx on account (project_id);