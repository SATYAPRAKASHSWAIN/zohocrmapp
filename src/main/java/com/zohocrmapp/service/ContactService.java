package com.zohocrmapp.service;

import java.util.List;

import com.zohocrmapp.entities.Contacts;

public interface ContactService {
	public void saveOneContact(Contacts contact);
	public List<Contacts> getAllContacts();
	public Contacts getOneContact(long id);

}
