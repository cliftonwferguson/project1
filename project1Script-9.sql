GRANT ALL ON TABLE project1.ers_reimbursement TO jdbc_worker;
GRANT ALL ON TABLE project1.ers_reimbursement_status TO jdbc_worker;
GRANT ALL ON TABLE project1.ers_reimbursement_type TO jdbc_worker;
GRANT ALL ON TABLE project1.ers_user_roles TO jdbc_worker;
GRANT ALL ON TABLE project1.ers_users TO jdbc_worker;

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

select * from project1.ers_reimbursement_status;

create table project1.ers_reimbursement_status (
    reimb_status_id serial primary key,
    reimb_status text
)

select * from project1.ers_reimbursement_type;

create table project1.ers_reimbursement_type (
    reimb_type_id serial primary key,
    reimb_type text
);

select * from project1.ers_user_roles;

drop table project1.ers_user_roles;

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

