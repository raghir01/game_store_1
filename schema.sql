create schema if not exists game_store;
use game_store;

create table if not exists game (
	game_id int(11) not null auto_increment primary key,
    title varchar(50) not null,
    ersb_rating varchar(50) not null,
    description varchar(255) not null,
    price decimal(5, 2) not null,
    studio varchar(50) not null,
    quantity int(11)
);

create table if not exists console (
	game_id int(11) not null auto_increment primary key,
    model varchar(50) not null,
    manufacturer varchar(50) not null,
    memory_amount varchar(20),
    processor varchar(20),
    price decimal(5, 2) not null,
    quantity int(11) not null
);

create table if not exists t_shirt (
	t_shirt_id int(11) not null auto_increment primary key,
    size varchar(20) not null,
    color varchar(20) not null,
    description varchar(255) not null,
    price decimal(5,2) not null,
    quantity int(11) not null
);

create table if not exists sales_tax_rate (
	state char(2) not null,
    rate decimal(3,2) not null
);

create unique index ix_state_rate on sales_tax_rate (state, rate);

create table if not exists processing_fee (
	product_type varchar(20) not null,
    fee decimal (4,2)
);

create unique index ix_product_type_fee on processing_fee (product_type, fee);

create table if not exists invoice (
	invoice_id int(11) not null auto_increment primary key,
    name varchar(80) not null,
    street varchar(30) not null,
    city varchar(30) not null,
    state varchar(30) not null,
    zipcode varchar(5) not null,
    item_type varchar(20) not null,
    item_id int(11) not null,
    unit_price decimal(5,2) not null,
    quantity int(11) not null,
    subtotal decimal(5,2) not null,
    tax decimal(5,2) not null,
    processing_fee decimal (5,2) not null,
    total decimal(5,2) not null
);

---------------------------------------------------------------
insert into sales_tax_rate (state, rate) values ("AL", ".05");
insert into sales_tax_rate (state, rate) values ("AK", ".06");
insert into sales_tax_rate (state, rate) values ("AZ", ".04");
insert into sales_tax_rate (state, rate) values ("AR", ".06");
insert into sales_tax_rate (state, rate) values ("CA", ".06");
insert into sales_tax_rate (state, rate) values ("CO", ".04");
insert into sales_tax_rate (state, rate) values ("CT", ".03");
insert into sales_tax_rate (state, rate) values ("DE", ".05");
insert into sales_tax_rate (state, rate) values ("FL", ".06");
insert into sales_tax_rate (state, rate) values ("GA", ".07");
insert into sales_tax_rate (state, rate) values ("HI", ".05");
insert into sales_tax_rate (state, rate) values ("ID", ".03");
insert into sales_tax_rate (state, rate) values ("IL", ".05");
insert into sales_tax_rate (state, rate) values ("IN", ".05");
insert into sales_tax_rate (state, rate) values ("IA", ".04");
insert into sales_tax_rate (state, rate) values ("KS", ".06");
insert into sales_tax_rate (state, rate) values ("KY", ".04");
insert into sales_tax_rate (state, rate) values ("LA", ".05");
insert into sales_tax_rate (state, rate) values ("ME", ".03");
insert into sales_tax_rate (state, rate) values ("MD", ".07");
insert into sales_tax_rate (state, rate) values ("MA", ".05");
insert into sales_tax_rate (state, rate) values ("MI", ".06");
insert into sales_tax_rate (state, rate) values ("MN", ".06");
insert into sales_tax_rate (state, rate) values ("MS", ".05");
insert into sales_tax_rate (state, rate) values ("MO", ".05");
insert into sales_tax_rate (state, rate) values ("MT", ".03");
insert into sales_tax_rate (state, rate) values ("NE", ".04");
insert into sales_tax_rate (state, rate) values ("NV", ".04");
insert into sales_tax_rate (state, rate) values ("NH", ".06");
insert into sales_tax_rate (state, rate) values ("NJ", ".05");
insert into sales_tax_rate (state, rate) values ("NM", ".05");
insert into sales_tax_rate (state, rate) values ("NY", ".06");
insert into sales_tax_rate (state, rate) values ("NC", ".05");
insert into sales_tax_rate (state, rate) values ("ND", ".05");
insert into sales_tax_rate (state, rate) values ("OH", ".04");
insert into sales_tax_rate (state, rate) values ("OK", ".04");
insert into sales_tax_rate (state, rate) values ("OR", ".07");
insert into sales_tax_rate (state, rate) values ("PA", ".06");
insert into sales_tax_rate (state, rate) values ("RI", ".06");
insert into sales_tax_rate (state, rate) values ("SC", ".06");
insert into sales_tax_rate (state, rate) values ("SD", ".06");
insert into sales_tax_rate (state, rate) values ("TN", ".05");
insert into sales_tax_rate (state, rate) values ("TX", ".03");
insert into sales_tax_rate (state, rate) values ("UT", ".04");
insert into sales_tax_rate (state, rate) values ("VT", ".07");
insert into sales_tax_rate (state, rate) values ("VA", ".06");
insert into sales_tax_rate (state, rate) values ("WA", ".05");
insert into sales_tax_rate (state, rate) values ("WV", ".05");
insert into sales_tax_rate (state, rate) values ("WI", ".03");
insert into sales_tax_rate (state, rate) values ("WY", ".04");

--------------------------------------------------------------

insert into processing_fee (product_type, fee) values ("Consoles", "14.99");
insert into processing_fee (product_type, fee) values ("T-Shirts", "1.98");
insert into processing_fee (product_type, fee) values ("Games", "1.49");