GRANT ALL ON TABLE project1.ers_reimbursement TO jdbc_worker;
GRANT ALL ON TABLE project1.ers_reimbursement_status TO jdbc_worker;
GRANT ALL ON TABLE project1.ers_reimbursement_type TO jdbc_worker;
GRANT ALL ON TABLE project1.ers_user_roles TO jdbc_worker;
GRANT ALL ON TABLE project1.ers_users TO jdbc_worker;

select a.ers_users_id, a.ers_username, a.ers_password, a.user_first_name, a.user_last_name, a.user_email, b.user_role 
from ers_users a join ers_user_roles b on a.user_role_id = b.ers_user_role_id;

drop view reimbursement_view;

create view reimbursement_view as select a.reimb_id, d.ers_username, a.reimb_author, a.reimb_amount, 
    b.reimb_status, a.reimb_submitted, c.reimb_type 
    from ers_reimbursement a join ers_reimbursement_status b on a.reimb_id  =  b.reimb_status_id
   join ers_reimbursement_type c on a.reimb_id = c.reimb_type_id
    left join ers_users d on a.reimb_author = d.ers_users_id;
  
select * from reimbursement_view;

  insert into reimbursement_view (ers_username, reimb_amount, 
    reimb_status, reimb_type) 
     values 
    ('John.smith', 600, 'Approved', 'Travel');
    
 select * from reimbursement_view where reimb_author=?;

create table project1.ers_users

drop table project1.ers_reimbursement;


select * from project1.ers_reimbursement;



CREATE TABLE project1.ers_reimbursement (
	reimb_id serial primary key,
	reimb_amount integer,
	reimb_submitted timestamp default(now()),
	reimb_resolved  timestamp default(now()),
	reimb_description text,
	reimb_receipt bytea,
	reimb_author integer references public.ers_users(ers_users_id),
	reimb_resolver integer references public.ers_users(ers_users_id),
	reimb_status_id integer references public.ers_reimbursement_status(reimb_status_id),
	reimb_type_id integer references public.ers_reimbursement_type(reimb_type_id)
);

   insert into project1.ers_reimbursement (reimb_amount, reimb_description, reimb_receipt, reimb_author, reimb_resolver, reimb_status_id, reimb_type_id) values
     (700, 'travel', ('/home/xyz')::bytea, 2, 1, 1, 3);

select * from project1.ers_reimbursement_status;

insert into project1.ers_reimbursement_status(reimb_status) values ('Pending'), ('Approved'), ('Denied');

create table project1.ers_reimbursement_status (
    reimb_status_id serial primary key,
    reimb_status text
)

select * from project1.ers_reimbursement_type;

insert into project1.ers_reimbursement_type(reimb_type) values ('Advertising Expense'), ('Relocation Expense'), ('Travel'); 

create table project1.ers_reimbursement_type (
    reimb_type_id serial primary key,
    reimb_type text
);


select * from project1.ers_user_roles;

drop table project1.ers_user_roles;

insert into project1.ers_user_roles(user_role) values ('Employee'), ('Admin'), ('Supervisor'); 



select * from user

CREATE TABLE project1.ers_user_roles (
	ers_user_role_id serial primary key,
	user_role text DEFAULT 'employee'
);

select * from project1.ers_users;

drop table project1.ers_users cascade;

create table project1.ers_users (
  ers_users_id serial primary key,
  ers_username text,
  unique(ers_username),
  ers_password text,
  user_first_name text,
  user_last_name text,
  user_email text,
  unique(user_email),
  user_role_id integer references public.ers_user_roles(ers_user_role_id)  
 )
 
 insert into project1.ers_users (ers_users_id, ers_username, ers_password, user_first_name, user_last_name, user_email, user_role_id) values
     (1, 'adam.adams', 'qwe', 'adam', 'adam', 'adam.adams@email.com', 2),
     (2, 'John.smith', 'asd', 'john', 'smith', 'john.smith@email.com', 1);

