package com.gccareerstudio.repository;

import com.gccareerstudio.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeadRepository extends JpaRepository<Lead, Long> {
	 // Spring Data JPA gives you save(), findAll(), findById(), deleteById() for free.
    // Add custom query methods here later if needed, e.g.:
    // List<Lead> findByPreferredService(String preferredService);
}
