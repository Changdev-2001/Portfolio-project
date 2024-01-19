package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class MyClass2 {
	
	@Autowired
	ContactRepo repo;
	
	@PostMapping(value = "/addcontact")
	public String addUpdate(Integer contactid, String fullname, String email, String phoneno, String subject, String message){
		repo.save(new Contact(contactid,fullname,email,phoneno,subject,message));
		return "contactadded.html";
	}
	
	
	

}
