alter table account
    add constraint account_value_positive_check check (value >= 0),
    add column created_date  timestamp not null,
    add column modified_date timestamp not null;

alter table project
    add column created_date  timestamp not null,
    add column modified_date timestamp not null;

create sequence bank_sequence start 1 increment 1;
create table bank
(
    id            bigint primary key,
    name          varchar(100) not null unique,
    created_date  timestamp    not null,
    modified_date timestamp    not null
);

create sequence currency_rate_sequence start 1 increment 1;
create table currency_rate
(
    id            bigint primary key,
    bank_id       bigint references bank (id) not null,
    date          date                        not null,
    currency_from varchar(3)                  not null,
    currency_to   varchar(3)                  not null,
    value         numeric(14, 4)              not null,
    constraint currency_rate_value_positive_check check (value >= 0),
    unique (bank_id, date, currency_from, currency_to)
);
create index currency_rate_bank_id_idx on currency_rate (bank_id);