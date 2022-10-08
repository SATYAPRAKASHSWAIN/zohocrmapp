package com.zohocrmapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrmapp.entities.Contacts;
import com.zohocrmapp.repository.ContactsRepository2;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactsRepository2 contactRepository;

	@Override
	public void saveOneContact(Contacts contact) {
		contactRepository.save(contact);
	}

	@Override
	public List<Contacts> getAllContacts() {
		List<Contacts> contact = contactRepository.findAll();
		return contact;
	}

	@Override
	public Contacts getOneContact(long id) {
		Optional<Contacts> findById = contactRepository.findById(id);
		Contacts contacts = findById.get();
		return contacts;
	}

}
