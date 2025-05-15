package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Job_Seeker;
import com.example.Service.JobSeeker_Ser;

@RestController
@RequestMapping("/api/jobseeker")
public class JobSeekerContr {
	
	@Autowired
    private JobSeeker_Ser service;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody Job_Seeker seeker) {
        String result = service.register(seeker);
        return ResponseEntity.ok(result);
    }

}
