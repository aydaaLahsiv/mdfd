package com.lahsiv.mbfd.user;

import java.util.Date;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class User {

	@Id
	public String userId;

	public String email;

	public String fName;

	public String lName;

	public Date dob;

	public String password;
	
	
	 User() {
		
	}
	

	public User(String userId, String email, String fName, String lName, Date dob, String password) {
		super();
		this.userId = userId;
		this.email = email;
		this.fName = fName;
		this.lName = lName;
		this.dob = dob;
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [userId=");
		builder.append(userId);
		builder.append(", email=");
		builder.append(email);
		builder.append(", fName=");
		builder.append(fName);
		builder.append(", lName=");
		builder.append(lName);
		builder.append(", dob=");
		builder.append(dob);
		builder.append(", password=");
		builder.append(password);
		builder.append("]");
		return builder.toString();
	}

}
