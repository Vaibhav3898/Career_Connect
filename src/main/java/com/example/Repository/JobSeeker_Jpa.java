package com.example.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Job_Seeker;

@Repository
public interface JobSeeker_Jpa extends JpaRepository<Job_Seeker, Integer>{
	Optional<Job_Seeker> findByEmail(String email);
	

}
