DROP TABLE IF EXISTS test_user;
CREATE TABLE test_user
(
    `id`         bigint(32)   NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `created_by` VARCHAR(32)  NOT NULL COMMENT '创建人',
    `created_at` DATE         NOT NULL COMMENT '创建时间',
    `updated_by` VARCHAR(32)  NOT NULL COMMENT '更新人',
    `updated_at` DATE         NOT NULL COMMENT '更新时间',
    `username`   VARCHAR(255) NOT NULL COMMENT '用户名',
    `password`   VARCHAR(255) NOT NULL COMMENT '密码',
    `avatar_url` VARCHAR(255) COMMENT '头像url',
    PRIMARY KEY (id)
) COMMENT = '用户';

DROP TABLE IF EXISTS test_user_info;
CREATE TABLE test_user_info
(
    `id`         bigint(32)  NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `created_by` VARCHAR(32) NOT NULL COMMENT '创建人',
    `created_at` DATE        NOT NULL COMMENT '创建时间',
    `updated_by` VARCHAR(32) NOT NULL COMMENT '更新人',
    `updated_at` DATE        NOT NULL COMMENT '更新时间',
    `user_id`    VARCHAR(32) NOT NULL COMMENT '用户id',
    `sex`        VARCHAR(255) COMMENT '性别',
    `email`      VARCHAR(255) COMMENT '邮件',
    `phone`      VARCHAR(255) COMMENT '电话',
    `desc`       VARCHAR(255) COMMENT '其他描述',
    PRIMARY KEY (id)
) COMMENT = '用户详情';


DROP TABLE IF EXISTS test_good;
CREATE TABLE test_good
(
    `id`         bigint(32)  NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `created_by` VARCHAR(32) NOT NULL COMMENT '创建人',
    `created_at` DATE        NOT NULL COMMENT '创建时间',
    `updated_by` VARCHAR(32) NOT NULL COMMENT '更新人',
    `updated_at` DATE        NOT NULL COMMENT '更新时间',
    `user_id`    VARCHAR(32) NOT NULL COMMENT '用户id',
    `price`      VARCHAR(255) COMMENT '价格',
    `num`        VARCHAR(255) COMMENT '数量',
    `url`        VARCHAR(255) COMMENT '链接',
    `desc`       VARCHAR(255) COMMENT '其他描述',
    PRIMARY KEY (id)
) COMMENT = '商品';


DROP TABLE IF EXISTS test_book;
CREATE TABLE test_book
(
    `id`         bigint(32)  NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `created_by` VARCHAR(32) NOT NULL COMMENT '创建人',
    `created_at` DATE        NOT NULL COMMENT '创建时间',
    `updated_by` VARCHAR(32) NOT NULL COMMENT '更新人',
    `updated_at` DATE        NOT NULL COMMENT '更新时间',
    `user_id`    VARCHAR(32) NOT NULL COMMENT '用户id',
    `name`       VARCHAR(255) COMMENT '名称',
    `author`     VARCHAR(255) COMMENT '作者',
    `publish`    VARCHAR(255) COMMENT '出版社',
    `price`      VARCHAR(255) COMMENT '价格',
    `url`        VARCHAR(255) COMMENT '链接',
    `desc`       VARCHAR(255) COMMENT '其他描述',
    PRIMARY KEY (id)
) COMMENT = '书籍';

