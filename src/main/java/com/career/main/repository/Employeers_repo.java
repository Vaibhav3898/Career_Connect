package com.career.main.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.career.main.Entity.Employer;

@Repository
public interface Employeers_repo extends JpaRepository<Employer, Integer> {
	
	Optional<Employer> findByEmail(String email);

}
