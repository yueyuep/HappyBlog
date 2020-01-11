drop table if exists `tb_user`;
create table if not exists tb_user
(
    `id`       int auto_increment not null comment 'id',
    `username` varchar(20)        not null comment '用户名',
    `password` varchar(20)        not null comment '密码',
    `email`    varchar(20)        not null comment '邮箱',
    `phone`    varchar(20)        not null comment '电话号码',
    primary key (`id`, `username`)
) charset = utf8 comment ='用户表';