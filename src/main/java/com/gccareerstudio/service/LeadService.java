package com.gccareerstudio.service;

import com.gccareerstudio.entity.Lead;
import com.gccareerstudio.repository.LeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LeadService {

   @Autowired
   private LeadRepository leadRepository;

   public Lead saveLead(Lead lead) {
       return leadRepository.save(lead);
   }

   public List<Lead> getAllLeads() {
       return leadRepository.findAll();
   }

   public Optional<Lead> getLeadById(Long id) {
       return leadRepository.findById(id);
   }

   public void deleteLead(Long id) {
       leadRepository.deleteById(id);
   }
}