# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table basket (
  id                            bigint auto_increment not null,
  customer_email                varchar(255),
  constraint uq_basket_customer_email unique (customer_email),
  constraint pk_basket primary key (id)
);

create table category (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_category primary key (id)
);

create table comment (
  comment_id                    bigint auto_increment not null,
  commenting                    varchar(255),
  rating                        integer not null,
  p1_id                         bigint,
  constraint pk_comment primary key (comment_id)
);

create table order_item (
  id                            bigint auto_increment not null,
  order_id                      bigint,
  basket_id                     bigint,
  product_id                    bigint,
  quantity                      integer not null,
  price                         double not null,
  constraint pk_order_item primary key (id)
);

create table payment (
  id                            bigint auto_increment not null,
  shipment_address              varchar(255),
  cc_number                     varchar(255),
  ccv                           varchar(255),
  customer_email                varchar(255),
  constraint pk_payment primary key (id)
);

create table product (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  price                         double not null,
  description                   varchar(255),
  stock                         integer not null,
  category_id                   bigint,
  constraint pk_product primary key (id)
);

create table shop_order (
  id                            bigint auto_increment not null,
  order_date                    timestamp,
  customer_email                varchar(255),
  constraint pk_shop_order primary key (id)
);

create table user (
  role                          varchar(255),
  email                         varchar(255) not null,
  password                      varchar(255),
  first_name                    varchar(255),
  last_name                     varchar(255),
  constraint pk_user primary key (email)
);

alter table basket add constraint fk_basket_customer_email foreign key (customer_email) references user (email) on delete restrict on update restrict;

alter table comment add constraint fk_comment_p1_id foreign key (p1_id) references product (id) on delete restrict on update restrict;
create index ix_comment_p1_id on comment (p1_id);

alter table order_item add constraint fk_order_item_order_id foreign key (order_id) references shop_order (id) on delete restrict on update restrict;
create index ix_order_item_order_id on order_item (order_id);

alter table order_item add constraint fk_order_item_basket_id foreign key (basket_id) references basket (id) on delete restrict on update restrict;
create index ix_order_item_basket_id on order_item (basket_id);

alter table order_item add constraint fk_order_item_product_id foreign key (product_id) references product (id) on delete restrict on update restrict;
create index ix_order_item_product_id on order_item (product_id);

alter table payment add constraint fk_payment_customer_email foreign key (customer_email) references user (email) on delete restrict on update restrict;
create index ix_payment_customer_email on payment (customer_email);

alter table product add constraint fk_product_category_id foreign key (category_id) references category (id) on delete restrict on update restrict;
create index ix_product_category_id on product (category_id);

alter table shop_order add constraint fk_shop_order_customer_email foreign key (customer_email) references user (email) on delete restrict on update restrict;
create index ix_shop_order_customer_email on shop_order (customer_email);


# --- !Downs

alter table basket drop constraint if exists fk_basket_customer_email;

alter table comment drop constraint if exists fk_comment_p1_id;
drop index if exists ix_comment_p1_id;

alter table order_item drop constraint if exists fk_order_item_order_id;
drop index if exists ix_order_item_order_id;

alter table order_item drop constraint if exists fk_order_item_basket_id;
drop index if exists ix_order_item_basket_id;

alter table order_item drop constraint if exists fk_order_item_product_id;
drop index if exists ix_order_item_product_id;

alter table payment drop constraint if exists fk_payment_customer_email;
drop index if exists ix_payment_customer_email;

alter table product drop constraint if exists fk_product_category_id;
drop index if exists ix_product_category_id;

alter table shop_order drop constraint if exists fk_shop_order_customer_email;
drop index if exists ix_shop_order_customer_email;

drop table if exists basket;

drop table if exists category;

drop table if exists comment;

drop table if exists order_item;

drop table if exists payment;

drop table if exists product;

drop table if exists shop_order;

drop table if exists user;

