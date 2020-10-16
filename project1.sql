GRANT ALL ON TABLE public.Activity TO jdbc_worker;
GRANT ALL ON TABLE public.account TO jdbc_worker;


drop table public.ers_reimbursement;


select * from public.ers_reimbursement;

 CREATE TABLE public.ers_reimbursement (
	reimb_id serial primary key,
	reimb_amount integer,
	reimb_submitted timestamp default(now()),
	reimb_resolved  timestamp default(now()),
	reimb_description text,
	reimb_receipt bytea,
	reimb_author integer,
	reimb_resolver integer,
	reimb_status_id integer,
	reimb_type_id integer 
);

CREATE TABLE public.ers_reimbursement (
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

select * from public.ers_reimbursement_status;

create table public.ers_reimbursement_status (
    reimb_status_id serial primary key,
    reimb_status text
)

select * from public.ers_reimbursement_type;

create table public.ers_reimbursement_type (
    reimb_type_id serial primary key,
    reimb_type text
);

select * from public.ers_user_roles;

drop table public.ers_user_roles;

CREATE TABLE public.ers_user_roles (
	ers_user_role_id serial primary key,
	user_role text DEFAULT 'employee'
);

select * from public.ers_users;

drop table public.ers_users cascade;

drop table public.ers_users;

create table public.ers_users (
  ers_users_id serial primary key,
  ers_username text,
  unique(ers_username),
  ers_password text,
  user_first_name text,
  user_last_name text,
  user_email text,
  unique(user_email),
  user_role_id integer  

 )

create table public.ers_users (
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
 

