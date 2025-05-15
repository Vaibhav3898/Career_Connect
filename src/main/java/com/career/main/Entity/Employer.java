package com.career.main.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "recruters_table")
public class Employer {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    
	    @Column(nullable = false)
	    private  String companyName;
	    @Column(nullable = false)
	    private String employeeFirstName;
	 
	    private String employeeLasttName;
	    @Column(nullable = false)
	    private String email;
	    @Column(nullable = false)
	    private String password;
	    private String confoPassword;
	    private  long phoneNo;
	    private  String city;
	    int noEmployees;
	    private String companyAddress;
	    private String companyDescription;
	    private String websiteUrl;
		public Employer() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Employer(int id, String companyName, String employeeFirstName, String employeeLasttName, String email,
				String password, String confoPassword, long phoneNo, String city, int noEmployees,
				String companyAddress, String companyDescription, String websiteUrl) {
			super();
			this.id = id;
			this.companyName = companyName;
			this.employeeFirstName = employeeFirstName;
			this.employeeLasttName = employeeLasttName;
			this.email = email;
			this.password = password;
			this.confoPassword = confoPassword;
			this.phoneNo = phoneNo;
			this.city = city;
			this.noEmployees = noEmployees;
			this.companyAddress = companyAddress;
			this.companyDescription = companyDescription;
			this.websiteUrl = websiteUrl;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCompanyName() {
			return companyName;
		}
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		public String getEmployeeFirstName() {
			return employeeFirstName;
		}
		public void setEmployeeFirstName(String employeeFirstName) {
			this.employeeFirstName = employeeFirstName;
		}
		public String getEmployeeLasttName() {
			return employeeLasttName;
		}
		public void setEmployeeLasttName(String employeeLasttName) {
			this.employeeLasttName = employeeLasttName;
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
		public String getConfoPassword() {
			return confoPassword;
		}
		public void setConfoPassword(String confoPassword) {
			this.confoPassword = confoPassword;
		}
		public long getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(long phoneNo) {
			this.phoneNo = phoneNo;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getNoEmployees() {
			return noEmployees;
		}
		public void setNoEmployees(int noEmployees) {
			this.noEmployees = noEmployees;
		}
		public String getCompanyAddress() {
			return companyAddress;
		}
		public void setCompanyAddress(String companyAddress) {
			this.companyAddress = companyAddress;
		}
		public String getCompanyDescription() {
			return companyDescription;
		}
		public void setCompanyDescription(String companyDescription) {
			this.companyDescription = companyDescription;
		}
		public String getWebsiteUrl() {
			return websiteUrl;
		}
		public void setWebsiteUrl(String websiteUrl) {
			this.websiteUrl = websiteUrl;
		}
	    
	    
	    
	    
	    
	

}
