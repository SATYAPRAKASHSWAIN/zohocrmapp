package com.zohocrmapp.service;

import java.util.List;

import org.springframework.ui.ModelMap;

import com.zohocrmapp.entities.Lead;

public interface LeadService {
	public void saveOneLead(Lead lead);

	public Lead getOneLead(long id);

	public void deleteOneLead(long id);

	public List<Lead> listLeads();

	public Lead findLead(long id);

	
	

	

}
