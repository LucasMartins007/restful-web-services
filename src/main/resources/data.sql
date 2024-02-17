insert into user_details(id, birth_date, name)
    values(1001, current_date(), 'Juan');

insert into user_details(id, birth_date, name)
    values(1002, current_date(), 'Ravi');

insert into user_details(id, birth_date, name)
    values(1003, current_date(), 'Santi');


insert into post(id, description, user_id)
    values(1001, 'post number 1 user 1001', 1001);

insert into post(id, description, user_id)
    values(1002, 'post number 2 user 1001', 1001);

insert into post(id, description, user_id)
    values(1003, 'post number 3 user 1001', 1001);


insert into post(id, description, user_id)
    values(1004, 'post number 1 user 1001', 1002);

insert into post(id, description, user_id)
    values(1005, 'post number 2 user 1002', 1002);

insert into post(id, description, user_id)
    values(1006, 'post number 3 user 1002', 1002);


insert into post(id, description, user_id)
    values(1007, 'post number 1 user 1003', 1003);

insert into post(id, description, user_id)
    values(1008, 'post number 2 user 1003', 1003);

insert into post(id, description, user_id)
    values(1009, 'post number 3 user 1003', 1003);