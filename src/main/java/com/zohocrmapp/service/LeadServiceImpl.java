package com.zohocrmapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.zohocrmapp.entities.Lead;
import com.zohocrmapp.repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	private LeadRepository leadRepository;

	@Override
	public void saveOneLead(Lead lead) {
		leadRepository.save(lead);
	}

	@Override
	public Lead getOneLead(long id) {
		Optional<Lead> findById = leadRepository.findById(id);
		return findById.get();
	}

	@Override
	public void deleteOneLead(long id) {
		leadRepository.deleteById(id);
		
	}

	@Override
	public List<Lead> listLeads() {
		List<Lead> leads = leadRepository.findAll();
		return leads;
	}

	

	@Override
	public Lead findLead(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
