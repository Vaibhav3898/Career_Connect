package com.example.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Job_Seeker;
import com.example.Repository.JobSeeker_Jpa;

@Service
public class JobSeeker_Ser {

    @Autowired
    private JobSeeker_Jpa repo;

    public String register(Job_Seeker newJobSeeker) {
        Optional<Job_Seeker> existing = repo.findByEmail(newJobSeeker.getEmail());
        
        if (existing.isPresent()) {
            return "Email already registered!";
        }

        repo.save(newJobSeeker);
        return "Registration successful!";
    }
}
