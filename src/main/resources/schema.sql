drop table if exists feed_items;

create table feed_items
(
	id int auto_increment
		primary key,
	author varchar(255) null,
	description varchar(255) null,
	link varchar(255) null,
	pub_date datetime null,
	title varchar(255) null
)
;