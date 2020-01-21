create table "human" (
    id bigint not null primary key,
    dna text not null,
    mutant boolean not null
);

create index numan_dna on human(dna);