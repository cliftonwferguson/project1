package com.web.model;

import java.time.OffsetDateTime;

import javax.print.DocFlavor.BYTE_ARRAY;

public class Reimbursement {

	/*
	 * reimb_id serial primary key,
	reimb_amount integer,
	reimb_submitted timestamp default(now()),
	reimb_resolved  timestamp default(now()),
	reimb_description text,
	reimb_receipt bytea,
	reimb_author integer references public.ers_users(ers_users_id),
	reimb_resolver integer references public.ers_users(ers_users_id),
	reimb_status_id integer references public.ers_reimbursement_status(reimb_status_id),
	reimb_type_id integer references public.ers_reimbursement_type(reimb_type_id)
	 */
	
	private int reimbid;
	private int amount;
	private OffsetDateTime submitted;
	private OffsetDateTime resolved;
	private String description;
	private BYTE_ARRAY receipt; 
	private int author;
	private int resolver;
	private int statusid;
	private int typeid;
	public int getReimbid() {
		return reimbid;
	}
	public void setReimbid(int reimbid) {
		this.reimbid = reimbid;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public OffsetDateTime getSubmitted() {
		return submitted;
	}
	public void setSubmitted(OffsetDateTime submitted) {
		this.submitted = submitted;
	}
	public OffsetDateTime getResolved() {
		return resolved;
	}
	public void setResolved(OffsetDateTime resolved) {
		this.resolved = resolved;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BYTE_ARRAY getReceipt() {
		return receipt;
	}
	public void setReceipt(BYTE_ARRAY receipt) {
		this.receipt = receipt;
	}
	public int getAuthor() {
		return author;
	}
	public void setAuthor(int author) {
		this.author = author;
	}
	public int getResolver() {
		return resolver;
	}
	public void setResolver(int resolver) {
		this.resolver = resolver;
	}
	public int getStatusid() {
		return statusid;
	}
	public void setStatusid(int statusid) {
		this.statusid = statusid;
	}
	public int getTypeid() {
		return typeid;
	}
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}
	@Override
	public String toString() {
		return "Reimbursement [reimbid=" + reimbid + ", amount=" + amount + ", submitted=" + submitted + ", resolved="
				+ resolved + ", description=" + description + ", receipt=" + receipt + ", author=" + author
				+ ", resolver=" + resolver + ", statusid=" + statusid + ", typeid=" + typeid + "]";
	}
	public Reimbursement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reimbursement(int reimbid, int amount, OffsetDateTime submitted, OffsetDateTime resolved, String description,
			BYTE_ARRAY receipt, int author, int resolver, int statusid, int typeid) {
		super();
		this.reimbid = reimbid;
		this.amount = amount;
		this.submitted = submitted;
		this.resolved = resolved;
		this.description = description;
		this.receipt = receipt;
		this.author = author;
		this.resolver = resolver;
		this.statusid = statusid;
		this.typeid = typeid;
	}
	
	
}
