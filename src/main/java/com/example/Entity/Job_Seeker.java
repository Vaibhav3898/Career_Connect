package com.example.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Job_Seeker {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	
    private String firstName;
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;
    
    private String Conpassword;

    private String phone;
    private String CurrentCity;
    
    private String WorkStatus;
    

    private String gender;
    private String dateOfBirth;
    
	public Job_Seeker(Long id, String firstName, String lastName, String email, String password, String conpassword,
			String phone, String currentCity, String workStatus, String gender, String dateOfBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		Conpassword = conpassword;
		this.phone = phone;
		CurrentCity = currentCity;
		WorkStatus = workStatus;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
	}
	public Job_Seeker() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConpassword() {
		return Conpassword;
	}
	public void setConpassword(String conpassword) {
		Conpassword = conpassword;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCurrentCity() {
		return CurrentCity;
	}
	public void setCurrentCity(String currentCity) {
		CurrentCity = currentCity;
	}
	public String getWorkStatus() {
		return WorkStatus;
	}
	public void setWorkStatus(String workStatus) {
		WorkStatus = workStatus;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

   

    

}
