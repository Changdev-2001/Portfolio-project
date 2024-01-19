package com.example.demo;

import java.util.Objects;
import jakarta.persistence.*;


@Entity
@Table(name = "contact")

public class Contact {

	@Id
	@GeneratedValue
	private Integer contactid;
	
	private String fullname;
	private String email;
	private String phoneno;
	private String subject;
	private String message;

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(Integer contactid, String fullname, String email, String phoneno, String subject, String message) {
		super();
		this.contactid = contactid;
		this.fullname = fullname;
		this.email = email;
		this.phoneno = phoneno;
		this.subject = subject;
		this.message = message;
	}

	public Integer getContactid() {
		return contactid;
	}

	public void setContactid(Integer contactid) {
		this.contactid = contactid;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public int hashCode() {
		return Objects.hash(contactid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		return Objects.equals(contactid, other.contactid);
	}

	@Override
	public String toString() {
		return "Contact [contactid=" + contactid + ", fullname=" + fullname + ", email=" + email + ", phoneno=" + phoneno + ", subject=" + subject + ", message=" + message + "]";
	}

}
