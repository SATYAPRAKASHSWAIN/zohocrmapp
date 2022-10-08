package com.zohocrmapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrmapp.entities.Contacts;
import com.zohocrmapp.service.ContactService;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/listContacts")
	public String listContacts(ModelMap model) {
		List<Contacts>  contacts=contactService.getAllContacts();
		model.addAttribute("contacts", contacts);
		return "list_contact";
	}
	

}
