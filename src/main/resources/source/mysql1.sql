create table t_blog
(
    id          char(255) not null
        primary key,
    title       char(255) null,
    description char(255) null,
    content     longtext  null,
    creator_id  char(255) null,
    likes       int       null,
    create_time bigint    null,
    update_time bigint    null,
    status      char(31)  null,
    temperature int       null
);

create table t_user
(
    id             char(255)  not null
        primary key,
    username       char(255)  null,
    real_name      char(255)  null,
    email          char(255)  null,
    date_of_birth  char(255)  null,
    email_verified tinyint(1) null,
    create_date    bigint     null,
    status         char(31)   null,
    password       char(255)  null,
    constraint t_user_pk2
        unique (email),
    constraint t_user_pk3
        unique (username)
);

